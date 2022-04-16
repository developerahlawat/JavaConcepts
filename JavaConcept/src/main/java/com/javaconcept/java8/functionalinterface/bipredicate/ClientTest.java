package com.javaconcept.java8.functionalinterface.bipredicate;

import java.util.function.BiPredicate;

public class ClientTest {

	public static void main(String[] args) {

		BiPredicate<Integer, String> biPredicate=(i,o)->i>20&& o.startsWith("M");
		
		System.out.println(biPredicate.test(30, "Sean"));
		System.out.println(biPredicate.test(40, "Martin"));
		System.out.println(biPredicate.test(10, "Frank"));
		
		
	}

}
