package com.ustglobal.student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.student.dto.Student;

public class Insert {
	
	public static void main(String[] args) {
		
		Student student=new Student();
		student.setSid(1);
		student.setSname("Maneesha");
		student.setCollege("GPREC");
		
		EntityManager entityManager=null;
		EntityTransaction entityTransaction=null;
		
		try {
			EntityManagerFactory entityFactoryManager = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityFactoryManager.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(student);
			System.out.println("Record Inserted");
			entityTransaction.commit();
			
		}catch(Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
		
	}// end of main

}
