package com.javaconcept.java8.functionalinterfaces;

import java.util.function.BiFunction;

public class FunctionalInterfaceBiFunctional {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, String> biFunction=(num1,num2)->"Result is:"+(num1+num2);
		
		System.out.println(biFunction.apply(100, 40));
	}

}
