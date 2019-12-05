package com.ustglobal.springboot1.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ustglobal.springboot1.dto.EmployeeResponse;

@ControllerAdvice
public class HandleException {

	@ExceptionHandler(Exception.class)
	public @ResponseBody EmployeeResponse getException() {
		EmployeeResponse response = new EmployeeResponse();
		response.setStatusCode(501);
		response.setMessage("error in code");
		response.setDescription("Got an exception");
		return response;
	}
}
