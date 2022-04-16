package com.javaconcept.java8.stream.api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamReductionDemo {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Sean");
		list.add("Martin");
		list.add("Frank");
		list.add("Andrew");
		
/*		Stream<String> stream = list.stream();
		Stream<String> distinct = stream.distinct();// first way
		long count = distinct.count();
*/		
		/*
		 * Stream<String> stream = list.stream(); 
		 * long count =stream.distinct().distinct().count();//second way
		 */
		long count = list.stream().distinct().distinct().count();// best way
		System.out.println(count);
		
		boolean anyMatch = list.stream().anyMatch(s->s.contains("S"));
		System.out.println(anyMatch);
		
	}

}
