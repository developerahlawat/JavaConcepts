package com.javaconcept.java8.functionalinterface.lambda.bestpractice;

import java.util.function.Function;

public class UseFoo {

	public String addd(String name,Foo foo){
		return foo.method(name);
	}
	
	public String add(String name,Function<String, String> fn){
		return fn.apply(name);
	}
}
