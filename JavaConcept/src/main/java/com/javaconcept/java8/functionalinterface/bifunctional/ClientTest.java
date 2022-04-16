package com.javaconcept.java8.functionalinterface.bifunctional;

import java.util.function.BiFunction;

public class ClientTest {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, String> biFunction=(num1,num2)->"Result is:"+(num1+num2);
		
		System.out.println(biFunction.apply(100, 40));
	}

}
