package com.javaconcept.java8.functionalinterfaces;

import java.util.function.BiPredicate;

public class FunctionalInterfaceBiPredicate {

	public static void main(String[] args) {

		BiPredicate<Integer, String> biPredicate=(i,o)->i>20&& o.startsWith("M");
		
		System.out.println(biPredicate.test(30, "Sean"));
		System.out.println(biPredicate.test(40, "Martin"));
		System.out.println(biPredicate.test(10, "Frank"));
		
		
	}

}
