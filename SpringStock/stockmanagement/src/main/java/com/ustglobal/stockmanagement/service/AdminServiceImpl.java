package com.ustglobal.stockmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.stockmanagement.dao.AdminDAO;
import com.ustglobal.stockmanagement.dto.Product_info;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminDAO dao;

	@Override
	public boolean addProduct(Product_info product) {

		return dao.addProduct(product);
	}

	@Override
	public boolean deleteProduct(int id) {

		return dao.deleteProduct(id);
	}

	@Override
	public boolean updateProduct(Product_info product) {

		return dao.updateProduct(product);
	}

	@Override
	public List<Product_info> searchProductByName(String name) {

		return dao.searchProductByName(name);
	}

	@Override
	public List<Product_info> searchProductByCategory(String category) {

		return dao.searchProductByCategory(category);
	}

	@Override
	public List<Product_info> searchProductByCompany(String company) {

		return dao.searchProductByCompany(company);
	}

	@Override
	public boolean addProductToCart(Product_info product) {

		return dao.addProductToCart(product);
	}

}
