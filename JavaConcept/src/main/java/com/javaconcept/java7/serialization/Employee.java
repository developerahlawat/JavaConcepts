package com.javaconcept.java7.serialization;

import java.io.Serializable;

public class Employee implements Serializable {

	// private static final long serialVersionUID = -1579812851346930637L;
	private int id;
	private String name;
	private String email;
	private transient String password;// this field can't be the part of serialization process..
	// private Double salary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	/*
	 * public Double getSalary() { return salary; }
	 * 
	 * public void setSalary(Double salary) { this.salary = salary; }
	 */
}
