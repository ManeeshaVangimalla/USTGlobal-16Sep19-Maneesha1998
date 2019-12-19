package com.ustglobal.spring_rest.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;

import org.springframework.stereotype.Repository;

import com.ustglobal.spring_rest.dto.Book;
import com.ustglobal.spring_rest.dto.BookRegistration;

@Repository
public class StudentDaoImpl implements StudentDao {

	@PersistenceUnit
	private EntityManagerFactory factory;
	@Override
	public Book searchBook(int bid) {

		//String jpql = "from Book where bid=:bid and bName=:bname";
		EntityManager entityManager = factory.createEntityManager();
		//TypedQuery<Book> query = entityManager.createQuery(jpql, Book.class);
		//List<Book> book = query.getResultList();
		Book bean = entityManager.find(Book.class, bid);
		return bean;
	}



	@Override
	public Boolean requestBook(BookRegistration book) {
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();

		try {
			entityManager.persist(book);
			entityTransaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}
}
