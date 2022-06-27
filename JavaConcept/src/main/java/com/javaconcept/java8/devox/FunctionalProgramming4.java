package com.javaconcept.java8.devox;
import java.util.List;
import java.util.stream.Stream;

public class FunctionalProgramming4 {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

		int factor = 2;

		Stream<Integer> strm = numbers.stream().map(e -> e * factor);

		strm.forEach(System.out::println);

		System.out.println("-----------------------------");
		// get the double of sqrt root of even numbrs

		System.out.println(numbers.stream().filter(e -> e % 2 == 0).mapToDouble(Math::sqrt).sum());

	}
}
