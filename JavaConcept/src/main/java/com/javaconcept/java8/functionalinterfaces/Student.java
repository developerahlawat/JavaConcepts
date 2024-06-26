package com.javaconcept.java8.functionalinterfaces;

public class Student {

	private String name;
	private Long phone;
	
	public Student(String name, Long phone) {
		super();
		this.name = name;
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", phone=" + phone + "]";
	};
}
