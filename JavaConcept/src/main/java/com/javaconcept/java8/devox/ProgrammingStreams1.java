package com.javaconcept.java8.devox;
import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/*
 * 
 * Programming with Streams in Java 8-By Venkat Subramaniam
 */
public class ProgrammingStreams1 {
	/*
	 * Stream is an abstraction,non mutating,
	 */

	public static List<Person> createPeople() {
		return Arrays.asList(new Person("Sara", Gender.FEMALE, 20), new Person("Sara", Gender.FEMALE, 22),
				new Person("Bob", Gender.MALE, 20), new Person("Paula", Gender.FEMALE, 32),
				new Person("Paul", Gender.MALE, 32), new Person("Jack", Gender.MALE, 2),
				new Person("Jack", Gender.MALE, 72), new Person("Jill", Gender.FEMALE, 12));
	}

	public static void main(String[] args) {
		List<Person> people = createPeople();

		// get, in uppercase, the names of all female older than 18
		List<String> names = new ArrayList<>();
		for (Person person : people) {
			if (person.getGender() == Gender.FEMALE && person.getAge() > 18) {
				names.add(person.getName().toUpperCase());
			}
		}
		 Predicate<Integer> isEven = (n) -> n % 2 == 0; 
		System.out.println(names);

		// The above mixes what with how - sequential, one element at a time. Details
		// all thrown together.
		// imperative in nature - mutability and low level details
		// We are focused on each element

		// Let's use Streams instead

		System.out.println(
				people
				.stream()
				.filter(person -> person.getGender() == Gender.FEMALE)
				.filter(person -> person.getAge() > 18)
				.map(person -> person.getName().toUpperCase())
				.collect(toList()));

		// better way
		System.out.println(people.stream()
				.filter(person -> person.getGender() == Gender.FEMALE)
				.filter(person -> person.getAge() > 18)
				.map(Person::getName)
				.map(String::toUpperCase)
				.collect(toList()));
		
		System.out.println("-----------------------");

		// we said what, not how, may be sequential, lazy, parallel, etc.
		// functional and declarative in nature - no explicit mutation and higher level
		// of abstraction
		// focus on the whole collection instead of fiddling with iteration and each
		// element.

		// filter is like cone,map is like cylinder
		
		
		 //print all males
	    people.stream()
	          .filter(person -> person.getGender() == Gender.MALE)
	          .forEach(System.out::println);

		// print all males, but with name in uppercase
		people.stream()
		        .filter(person -> person.getGender() == Gender.MALE)
				.map(person -> new Person(person.getName().toUpperCase(), person.getGender(), person.getAge()))
				.forEach(System.out::println);

		// the original list is still intact
		System.out.println(people);

	}
}
