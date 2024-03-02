package com.javaconcept.java8.functionalinterfaces;

import java.util.function.Function;

public class Students {

	private String name;
	private int age;
	
	public Students(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	public String customShow(Function<Students, String> function){
		return function.apply(this);
	}
	
}
