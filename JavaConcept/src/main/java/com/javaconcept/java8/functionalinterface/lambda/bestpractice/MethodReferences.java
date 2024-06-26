package com.javaconcept.java8.functionalinterface.lambda.bestpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class MethodReferences {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(4,9,25,36,100);
		numbers.forEach(System.out::println);
		System.out.println("-----------------------");
		List<Double> squaredNumbers = MethodReferences.findSquare(numbers,Integer::new);
		System.out.println(squaredNumbers);
	}

	private static List<Double> findSquare(List<Integer> numbers, Function<Integer, Integer> f) {
		List<Double> result = new ArrayList<>();
		numbers.forEach(x->result.add(Math.sqrt(f.apply(x))));
		return result;
	}

}
