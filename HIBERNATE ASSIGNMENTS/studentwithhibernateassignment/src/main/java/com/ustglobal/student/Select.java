package com.ustglobal.student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.student.dto.Student;

public class Select {

	public static void main(String[] args) {

		EntityManager entityManager = null;
		EntityTransaction entityTransaction= null;
		
		
			EntityManagerFactory entityFactoryManager = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityFactoryManager.createEntityManager();
			
		
			Student student =entityManager.find(Student.class, 1);
			System.out.println("Id is = "+student.getSid());
			System.out.println("Name is = "+student.getSname());
			System.out.println("College is = "+student.getCollege());
	        entityManager.close();
		
		
	}

}
