package com.ustglobal.springcore.config;

import org.springframework.context.annotation.Bean;

import com.ustglobal.springcore.di.Book;

public class BookConfigurationClass {

	@Bean(name="book")
	public Book getBook() {
		Book book = new Book();
		book.setName("Maths");
		book.setName("SaiSree");
		book.setPrice(560);
		return book;
	}
}
