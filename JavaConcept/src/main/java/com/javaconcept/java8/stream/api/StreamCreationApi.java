package com.javaconcept.java8.stream.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreationApi {

	public static void main(String[] args) {
		
		String arr[]= new String[]{"AA","BB","CC"};
		Stream<String> stream = Arrays.stream(arr);
		stream.forEach(System.out::println);
		Stream<Integer> streamm = Stream.iterate(1, i->i+1);
		stream.limit(5).filter(i-> i%2==0).forEach(System.out::println);
		
		System.out.println("----------------------");
		Stream<String> of = Stream.of("A","B","C","D");		
		//of.forEach((i)->System.out.println(i));
		of.forEach(System.out::println);
		
		System.out.println("----------------------");		
		List<String> list = new ArrayList<>();
		list.add("Kishan");
		list.add("Raj");
		list.add("Mohan");
		Stream<String> stream2 = list.stream();
		list.stream().forEach(System.out::println);		
		System.out.println("----------------------");
		stream2.forEach(System.out::println);
		

		System.out.println("----------------------");
		Stream<String> build = Stream.<String>builder().add("kk").add("PK").add("MK").build();
		build.forEach(System.out::println);
		
		System.out.println("---------------------------------------------------");
		Stream<String> limit = Stream.generate(()->"Hello").limit(2);
		limit.forEach(System.out::println);
		
		System.out.println("---------------------------------------------------");	
		Stream<Integer> limit2 = Stream.iterate(10, i->i+2).limit(10);
		limit2.forEach(System.out::println);
		
		
		System.out.println("---------------------------------------------------");
		IntStream range = IntStream.range(1, 6);
		range.forEach(System.out::println);
		
		System.out.println("---------------------------------------------------");
		IntStream range2 = IntStream.rangeClosed(1, 6);
		range2.forEach(System.out::println);
		
		System.out.println("---------------------------------------------------");
		Random random = new Random();
		DoubleStream doubles = random.doubles(5);
		doubles.forEach(System.out::println);
		
		IntStream chars = "abcd".chars();
		System.out.println("---------------------------------------------------");
		chars.forEach(System.out::println);
		
	}

}
