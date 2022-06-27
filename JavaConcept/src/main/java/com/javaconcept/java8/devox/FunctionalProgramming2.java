package com.javaconcept.java8.devox;

import java.util.List;
import java.util.function.Consumer;

public class FunctionalProgramming2 {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

		for (int i = 0; i < numbers.size(); i++)
			System.out.println(numbers.get(i));

		System.out.println("---------------------------------");

		for (int e : numbers)
			System.out.println(e);
		/*
		 * Above two are known as external iterators,below method is internals
		 * 
		 */
		
		System.out.println("---------------------------------");

		numbers.forEach(new Consumer<Integer>() {
			public void accept(Integer e) {
			  System.out.println(e);
			}
		});

		System.out.println("---------------------------------");
		// since not doing anything with the value,better to use method reference
		numbers.forEach((e) -> System.out.println(e));

		numbers.forEach(System.out::println);
	}

}
