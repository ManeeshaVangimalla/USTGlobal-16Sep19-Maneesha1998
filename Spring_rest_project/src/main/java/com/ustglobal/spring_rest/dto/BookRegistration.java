package com.ustglobal.spring_rest.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
@Entity
@Table(name="Requested_Books")
public class BookRegistration {

	@Id
	@Column(name="StudentId")
	private int studentId;

	@Column(name="bookId")
	private int bid;

	@Column(name="BookName")
	private String bname;

	@Column(name = "Author")
	private String author;

	@Column(name="RequestedOn")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date date;



}
