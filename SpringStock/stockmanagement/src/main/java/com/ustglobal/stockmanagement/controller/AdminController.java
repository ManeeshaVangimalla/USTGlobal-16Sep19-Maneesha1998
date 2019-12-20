package com.ustglobal.stockmanagement.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.ustglobal.stockmanagement.dto.Product_info;
import com.ustglobal.stockmanagement.dto.UserResponse;
import com.ustglobal.stockmanagement.service.AdminService;

@RestController
@CrossOrigin(origins = "*",allowedHeaders = "*", allowCredentials = "true")
public class AdminController {

	@Autowired
	private AdminService service;

	UserResponse response = new UserResponse();

	@PostMapping(path = "/addproduct" , 
			consumes = MediaType.APPLICATION_JSON_VALUE ,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse addProduct(@RequestBody Product_info product) {

		if(service.addProduct(product)) {

			response.setStatus(201);
			response.setMessage("Success");
			response.setDescription("product added to DB");
		}else {
			response.setStatus(401);
			response.setMessage("Failure");
			response.setDescription("product not added to DB");


		}
		return response;

	}//end of add

	@DeleteMapping(path = "/deleteproduct/{id}" ,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse deleteProduct(@PathVariable("id") int id) {

		if(service.deleteProduct(id)) {

			response.setStatus(201);
			response.setMessage("Success");
			response.setDescription("product Deleted from DB");
		}else {
			response.setStatus(401);
			response.setMessage("Failure");
			response.setDescription("product not Deleted from DB");


		}


		return response;

	}//end of delete

	@PutMapping(path="/updateproduct",consumes=MediaType.APPLICATION_JSON_VALUE,
			produces=MediaType.APPLICATION_JSON_VALUE)
	public UserResponse updateProduct(@RequestBody Product_info product) {
		if(service.updateProduct(product)) {
			response.setStatus(201);
			response.setMessage("success");
			response.setDescription("product modified in DB");
		}else {
			response.setStatus(401);
			response.setMessage("Failure");
			response.setDescription("product not modified in DB");
		}
		return response;

	}//end of updateProduct()

	@GetMapping(path = "/searchproductbyname" ,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse searchProductByName(@RequestParam("name") String  name){

		List<Product_info> product = service.searchProductByName(name);
		if(product!=null) {
			response.setStatus(201);
			response.setMessage("Success");
			response.setDescription("Data found in DB");
			response.setProduct(product); // a single object to list type and stored
		}else {
			response.setStatus(401);
			response.setMessage("Failure");
			response.setDescription("Data not found in DB");


		}
		return response;
	}//end of search product by name

	@GetMapping(path = "/searchproductbycategory" ,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse searchProductByCategory(@RequestParam("category") String  category){

		List<Product_info> product = service.searchProductByName(category);
		if(product!=null) {
			response.setStatus(201);
			response.setMessage("Success");
			response.setDescription("Data found in DB");
			response.setProduct(product); // a single object to list type and stored
		}else {
			response.setStatus(401);
			response.setMessage("Failure");
			response.setDescription("Data not found in DB");


		}
		return response;
	}//end of searchproductbycategory

	@GetMapping(path = "/searchproductbycompany" ,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse searchProductByCompany(@RequestParam("company") String  company){

		List<Product_info> product = service.searchProductByName(company);
		if(product!=null) {
			response.setStatus(201);
			response.setMessage("Success");
			response.setDescription("Data found in DB");
			response.setProduct(product); // a single object to list type and stored
		}else {
			response.setStatus(401);
			response.setMessage("Failure");
			response.setDescription("Data not found in DB");


		}
		return response;
	}//end of searchproductbycompany

	@PostMapping(path = "/addproducttocart" , 
			consumes = MediaType.APPLICATION_JSON_VALUE ,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse addProductToCart(@RequestBody Product_info product) {

		if(service.addProduct(product)) {

			response.setStatus(201);
			response.setMessage("Success");
			response.setDescription("product added to DB");
		}else {
			response.setStatus(401);
			response.setMessage("Failure");
			response.setDescription("product not added to DB");


		}
		return response;

	}//end of addproducttocart

}
