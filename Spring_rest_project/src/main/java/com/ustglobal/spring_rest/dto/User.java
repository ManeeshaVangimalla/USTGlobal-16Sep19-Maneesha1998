package com.ustglobal.spring_rest.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Users_details")
public class User {

	@Id
	@Column(name = "userId")
	@GeneratedValue
	private int id;

	@Column(name = "UserName")
	private String name;

	@Column(name = "Email")
	private String  email;

	@Column(name = "password")
	private String password;

	@Column(name="Role")
	private String role;





}
