package com.ustglobal.spring_rest.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.ustglobal.spring_rest.dto.User;
import com.ustglobal.spring_rest.dto.UserResponse;
import com.ustglobal.spring_rest.service.LoginService;

@CrossOrigin(origins = "*",allowedHeaders = "*", allowCredentials = "true")
@RestController
public class LoginController {
	@Autowired
	private LoginService service;

	UserResponse response = new UserResponse();
	@PostMapping(path = "/login/{id}/{password}")
	public UserResponse login(@PathVariable("id") int id,@PathVariable("password") String password) {

		User bean = service.login(id, password);
		if(bean != null) {
			response.setStatus(201);
			response.setMessage("Success");
			response.setDescription("Data added to DB");
			response.setUsers(Arrays.asList(bean));
		}else {
			response.setStatus(401);
			response.setMessage("Failure");
			response.setDescription("Data not added to DB");
		}
		return response;
	}
}
