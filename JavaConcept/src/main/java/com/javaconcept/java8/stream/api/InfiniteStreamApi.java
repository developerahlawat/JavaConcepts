package com.javaconcept.java8.stream.api;

import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class InfiniteStreamApi {

	public static void main(String[] args) {

		Stream<Integer> iterate = Stream.iterate(2, i -> i + 2);
		List<Integer> collect = iterate.limit(10).collect(Collectors.toList());
		collect.forEach(System.out::println);
		
		System.out.println("-----------------------------");
		
		

		Supplier<UUID> randomUUIDs = UUID::randomUUID;
		Stream<UUID> generate = Stream.generate(randomUUIDs);

		List<UUID> collectt = generate.skip(10).limit(10).collect(Collectors.toList());

		collectt.forEach(System.out::println);

		System.out.println("-----------------------------");

		Stream<Integer> iteratee = Stream.iterate(0, i -> i + 1);
		iteratee.limit(10).forEach(System.out::println);
		System.out.println("-----------------------------");

		// IntStream stream = IntStream.iterate(0, i -> i >= 0, i -> i + 2);

		// IntStream.iterate(0, i-> i < 10, i -> i + 2).forEach(System.out::println);
		// IntStream.range(6, 10).forEach(System.out::println);

		// Displaying the elements in range
		// including the lower bound but
		// excluding the upper bound
		// stream.forEach(System.out::println);

		System.out.println("-------------------------------");
		// To get the product of all elements
		// in given range excluding the
		// rightmost element
		IntStream.range(1, 10).skip(1).limit(8).forEach(System.out::println);

	}

}
