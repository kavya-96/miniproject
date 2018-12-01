package com.cg.prac.entity;


import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="user")
public class User {
 
	@Id
	private String userId;
	
	@NotNull
	@Size(min=1,message="Name should have atleast 1 character")
	private String name;
	
	@NotNull
	@Size(min=3,message="department shloud be atleat 3 chars")
	private String dept;
	
	private Date DOJ = new Date();

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String userId, String name, String dept, Date dOJ) {
		super();
		this.userId = userId;
		this.name = name;
		this.dept = dept;
		DOJ = dOJ;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public Date getDOJ() {
		return DOJ;
	}

	public void setDOJ(Date dOJ) {
		DOJ = dOJ;
	}
	
}
