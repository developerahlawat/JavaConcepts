package com.javaconcept.java8.devox;
import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class ProgrammingStreams5 {
	public static List<Person> createPeople() {
		return Arrays.asList(new Person("Sara", Gender.FEMALE, 20), new Person("Sara", Gender.FEMALE, 22),
				new Person("Bob", Gender.MALE, 20), new Person("Paula", Gender.FEMALE, 32),
				new Person("Paul", Gender.MALE, 32), new Person("Jack", Gender.MALE, 2),
				new Person("Jack", Gender.MALE, 72), new Person("Jill", Gender.FEMALE, 12));
	}

	public static void main(String[] args) {
		List<Person> people = createPeople();
		// grouping operations

		Map<Integer, List<Person>> peopleByAgeAsKey = people.stream().collect(groupingBy(Person::getAge));

		System.out.println(peopleByAgeAsKey);
		System.out.println("---------------");

		System.out.println(people.stream().collect(groupingBy(Person::getName)));
		System.out.println("---------------");

		System.out.println(people.stream().collect(groupingBy(person -> person.getName().charAt(0))));

		// given a list of people, create a map where
		// their name is the key and value is all the ages of people with that name

		System.out.println(people.stream().collect(groupingBy(Person::getName, mapping(Person::getAge, toList()))));

		// sized, ordered, non-distinct, sorted
		System.out.println("---------------");
		people.stream().sorted((person1, person2) -> person1.getAge() > person2.getAge() ? 1 : -1)
				.forEach(System.out::println);

		System.out.println("---------------");
		Function<Person, Integer> byAge = Person::getAge;
		people.stream().sorted(comparing(byAge)).forEach(System.out::println);

		System.out.println("---------------");
		Function<Person, String> byName = Person::getName;
		people.stream().sorted(comparing(byAge).thenComparing(byName)).forEach(System.out::println);

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5);
		// sorting operatations
		numbers.stream().filter(e -> e % 2 == 0).sorted().forEach(System.out::println);

		// distinct
		numbers.stream().filter(e -> e % 2 == 0).distinct().forEach(System.out::println);
		// sized, ordered, distinct, non-sorted

	}
}
