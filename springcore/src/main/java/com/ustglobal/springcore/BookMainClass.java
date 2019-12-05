package com.ustglobal.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ustglobal.springcore.di.Book;

public class BookMainClass {

	public static void main(String[] args) {

		 ApplicationContext context = new ClassPathXmlApplicationContext("books.xml");
		 Book book = context.getBean(Book.class);
		 System.out.println(book.getName());
		 System.out.println(book.getAuthor());
		 System.out.println(book.getPrice());
	}

}
