package com.javaconcept.java8.devox;

import java.util.List;

public class FunctionalProgramming3 {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		// find total of double of even umbers

		int result = 0;
		for (int e : numbers) {
			if (e % 2 == 0)
				result += e * 2;
		}

		System.out.println(result);

		System.out.println("---------------------------");

		System.out.println(numbers.stream().filter(e -> e % 2 == 0).mapToInt(e -> e * 2).sum());
	}
}
