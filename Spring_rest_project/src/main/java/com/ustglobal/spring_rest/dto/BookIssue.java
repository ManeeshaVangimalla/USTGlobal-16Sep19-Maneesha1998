package com.ustglobal.spring_rest.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
@Entity
@Table(name = "Book_Issue_Details")
public class BookIssue {

	@Id
	@Column(name="BookId")
	private int bid;

	@Column(name="BookName")
	private String bname;

	@Column(name="IssueDate")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date issueDate;

	@Column(name="ReturnDate")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date returnDate;

	@Column(name="Fine")
	private int fine;

}
