package com.javaconcept.java8.stream.api;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SteamsSort {
	public static void main(String[] args) {

		List<Student> list = new ArrayList<>();

		list.add(new Student("PK", 23));
		list.add(new Student("KK", 26));
		list.add(new Student("MK", 23));
		list.add(new Student("SK", 21));
		list.add(new Student("CK", 40));
		list.add(new Student("DK", 40));
		list.add(new Student("RK", 40));
		list.add(new Student("BK", 30));
		list.add(new Student("DK", 60));
		list.add(new Student("DK", 0));

		list.sort(Comparator.comparing(Student::getAge).reversed());
		list.forEach(System.out::println);
		System.out.println("-------------------");
		list.sort(Comparator.comparing(Student::getName).reversed());
		list.forEach(System.out::println);
		System.out.println("-------------------");
		Comparator<Student> compareByAgeName = Comparator.comparing(Student::getAge)
				.thenComparing(Student::getName);

		List<Student> sortedStudent = list.stream().sorted(compareByAgeName).collect(Collectors.toList());
		//list.sort(Comparator.comparing(Student::getName).reversed());
		sortedStudent.forEach(System.out::println);
		System.out.println("-------------------");
	}
}
