package com.ustglobal.stockmanagement.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.stockmanagement.dto.Order_info;
import com.ustglobal.stockmanagement.dto.UserResponse;
import com.ustglobal.stockmanagement.service.OrderService;

@RestController
@CrossOrigin(origins = "*",allowedHeaders = "*", allowCredentials = "true")
public class OrderController {

	@Autowired
	private OrderService service;

	UserResponse response = new UserResponse();

	@GetMapping(path = "/orderproduct" ,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse orderProduct(@RequestParam("id") int  id){

		Order_info product = service.orderProduct(id);
		if(product!=null) {
			response.setStatus(201);
			response.setMessage("Success");
			response.setDescription("Data found in DB");
		}else {
			response.setStatus(401);
			response.setMessage("Failure");
			response.setDescription("Data not found in DB");


		}
		return response;
	}//end of searchproductbyname

}
