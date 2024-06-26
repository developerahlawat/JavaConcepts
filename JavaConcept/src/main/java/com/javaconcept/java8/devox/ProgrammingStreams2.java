package com.javaconcept.java8.devox;
import java.util.Arrays;
import java.util.List;

public class ProgrammingStreams2 {
	public static List<Person> createPeople() {
		return Arrays.asList(new Person("Sara", Gender.FEMALE, 20), new Person("Sara", Gender.FEMALE, 22),
				new Person("Bob", Gender.MALE, 20), new Person("Paula", Gender.FEMALE, 32),
				new Person("Paul", Gender.MALE, 32), new Person("Jack", Gender.MALE, 2),
				new Person("Jack", Gender.MALE, 72), new Person("Jill", Gender.FEMALE, 12));
	}

	public static void main(String[] args) {
		List<Person> people = createPeople();

		// total age of everyone
		int total = people.stream().map(Person::getAge).reduce(0, (accumuated, age) -> accumuated + age);
		int t = people.stream().map(p->p.getAge()).reduce(0, (a,b)-> a+b);
		
		int tt = people.stream().reduce(0, (a,b)-> a+b.getAge(),Integer::sum);
		int ttt = people.stream().reduce(0, (a,b)-> a-b.getAge(),Integer::min);
		// since we are passing user in b reduce is not able to identify 
		System.out.println(t);
		System.out.println(tt);
		System.out.println(total);

		// or //better approach
		System.out.println(people.stream().map(Person::getAge).reduce(0, Integer::sum));

		// or
		System.out.println(people.stream().mapToInt(Person::getAge).sum());
		
		
	}
}
