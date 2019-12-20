package com.ustglobal.stockmanagement.dao;

import java.util.List;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.stockmanagement.dto.Product_info;

@Repository
public class AdminDaoImpl implements AdminDAO {

	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public boolean addProduct(Product_info product) {

		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
			//transaction.begin();
			manager.persist(product);
			transaction.commit();
			return true;
		}catch (Exception e) {
			return false;
		}
	}


	@Override
	public boolean deleteProduct(int id) {

		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
			//transaction.begin();
			Product_info product = manager.find(Product_info.class, id);
			manager.remove(product);
			transaction.commit();
			return true;
		}catch (Exception e) {
			return false;
		}
	}


	@Override
	public boolean updateProduct(Product_info product) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
			//transaction.begin();
			Product_info p = manager.find(Product_info.class, product.getId());
			p.setCategory(product.getCategory());
			p.setName(product.getName());
			p.setQuantity(product.getQuantity());
			p.setPrice(product.getPrice());
			p.setCompany(product.getCompany());
			transaction.commit();
			return true;
		}catch (Exception e) {
			return false;
		}

	}

	@Override
	public List<Product_info> searchProductByName(String name) {
		String jpql = "from Product_info where name=:name";
		EntityManager entityManager = factory.createEntityManager();
		TypedQuery<Product_info> query = entityManager.createQuery(jpql, Product_info.class);
		
		 List<Product_info >product = query.getResultList(); return product;
		 
		//typedQuery.setParameter("name", name);
		//return typedQuery.getResultList();
	}

	@Override
	public List<Product_info> searchProductByCategory(String category) {

		String jpql = "from Product_info where category=:category";
		EntityManager entityManager = factory.createEntityManager();
		TypedQuery<Product_info> query = entityManager.createQuery(jpql, Product_info.class);
		
		  List<Product_info >product = query.getResultList(); 
		  return product;
		 //typedQuery.setParameter("category", category);
		 //return typedQuery.getResultList();

	}

	@Override
	public List<Product_info> searchProductByCompany(String company) {

		String jpql = "from Product_info where company=:company";
		EntityManager entityManager = factory.createEntityManager();
		TypedQuery<Product_info> query = entityManager.createQuery(jpql, Product_info.class);
		
		  List<Product_info >product = query.getResultList(); 
		  return product;
		 
		//typedQuery.setParameter("company", company);
		//return typedQuery.getResultList();
	}

	@Override
	public boolean addProductToCart(Product_info product) {

		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
			//transaction.begin();
			manager.persist(product);
			transaction.commit();
			return true;
		}catch (Exception e) {
			return false;
		}
	}

}
