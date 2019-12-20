package com.ustglobal.stockmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.stockmanagement.dao.OrderDAO;
import com.ustglobal.stockmanagement.dto.Order_info;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderDAO dao;

	@Override
	public Order_info orderProduct(int id) {

		return dao.orderProduct(id);
	}


}
