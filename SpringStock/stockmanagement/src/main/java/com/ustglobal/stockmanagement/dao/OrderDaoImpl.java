package com.ustglobal.stockmanagement.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

import org.springframework.stereotype.Repository;

import com.ustglobal.stockmanagement.dto.Order_info;

@Repository
public class OrderDaoImpl implements OrderDAO {

	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public Order_info orderProduct(int id) {
		EntityManager manager = factory.createEntityManager();
		return manager.find(Order_info.class, id);


	}

}
