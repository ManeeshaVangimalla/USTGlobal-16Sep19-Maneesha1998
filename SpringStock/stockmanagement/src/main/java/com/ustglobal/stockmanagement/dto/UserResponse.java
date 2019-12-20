package com.ustglobal.stockmanagement.dto;

import java.util.List;


public class UserResponse {

	private int status;
	private String message;
	private String description;
	private List<Product_info> product;
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<Product_info> getProduct() {
		return product;
	}
	public void setProduct(List<Product_info> product) {
		this.product = product;
	}

}
