package com.ustglobal.student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.student.dto.Student;


public class Delete {

	public static void main(String[] args) {
		 
		EntityManager entityManager=null;
		EntityTransaction entityTransaction=null;
		
		try {
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
			entityManager =entityManagerFactory.createEntityManager();
			entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			Student student=entityManager.find(Student.class,1);
			entityManager.remove(student);
			System.out.println("Deleted Record");
			entityTransaction.commit();
		}catch(Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();

		}
		entityManager.close();
		
	}
	
}
