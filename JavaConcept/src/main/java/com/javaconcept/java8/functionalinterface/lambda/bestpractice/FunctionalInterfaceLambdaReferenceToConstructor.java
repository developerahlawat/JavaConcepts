package com.javaconcept.java8.functionalinterface.lambda.bestpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionalInterfaceLambdaReferenceToConstructor {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(4,9,36,100);
		numbers.forEach(System.out::println);
		System.out.println("-------------------------");
		
		List<Double> findSquareRoots = FunctionalInterfaceLambdaReferenceToConstructor.findSquareRoots(numbers,Integer::new);// second parameter is constrctor reference
		findSquareRoots.forEach(System.out::println);
	}

	private static List<Double> findSquareRoots(List<Integer> numbers,Function<Integer, Integer> f) {// second parameter fucntion is a functional interface
		List<Double> results = new ArrayList<>();
		numbers.forEach(x->results.add(Math.sqrt(f.apply(x))));
		return results;
	}
}
