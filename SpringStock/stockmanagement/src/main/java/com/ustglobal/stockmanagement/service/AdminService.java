package com.ustglobal.stockmanagement.service;

import java.util.List;

import com.ustglobal.stockmanagement.dto.Product_info;

public interface AdminService {

	public boolean addProduct(Product_info product);
	public boolean deleteProduct(int id);
	public boolean updateProduct(Product_info product);
	public List<Product_info> searchProductByName(String name);
	public List<Product_info> searchProductByCategory(String category);
	public List<Product_info> searchProductByCompany(String company);
	public boolean addProductToCart(Product_info product);
}
