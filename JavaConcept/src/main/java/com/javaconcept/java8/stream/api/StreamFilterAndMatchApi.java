package com.javaconcept.java8.stream.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamFilterAndMatchApi {

	public static void main(String[] args) {

		List<Student> list  = new ArrayList<>();
		
		list.add(new Student("PK", 23));
		list.add(new Student("KK", 26));
		list.add(new Student("MK", 23));
		list.add(new Student("SK", 21));
		list.add(new Student("RK", 40));
		list.add(new Student("BK", 30));
		list.add(new Student("DK", 0));
		
		Stream<Student> filteredList = list.stream().filter(s->s.getAge()>25);
		filteredList.forEach(System.out::println);
		System.out.println("-------------------");
		
		list.stream().sorted((e1,e2)->e1.getAge().compareTo(e2.getAge())).forEach(System.out::println);
		System.out.println("-------------------");
		
		
		System.out.println(list.stream().count());
		System.out.println("-------------------");
		
		Optional<Student> optional=list.stream().findAny();
		if(optional.isPresent())System.out.println(optional.get());
		
	   System.out.println("-------------------");
		
		Optional<Student> optionall=list.stream().findFirst();
		if(optional.isPresent())System.out.println(optionall.get());
		
		
		
		System.out.println("-------------------");
		
		boolean allMatch = list.stream().allMatch(s->s.getName().contains("K"));
		System.out.println(allMatch);
		
		System.out.println("-------------------");
		boolean anyMatch = list.stream().anyMatch(s->s.getAge()>35);
		System.out.println(anyMatch);
		System.out.println("-------------------");
		boolean noneMatch = list.stream().noneMatch(s->s.getAge()>55);
		System.out.println(noneMatch);
	}

}
