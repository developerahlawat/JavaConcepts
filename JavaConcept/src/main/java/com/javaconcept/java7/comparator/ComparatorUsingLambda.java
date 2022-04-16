package com.javaconcept.java7.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorUsingLambda {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("Sean", "sean.m@gmail.com", 90000.00));
		empList.add(new Employee("Andrew", "andy.cs@gmail.com", 70000.00));
		empList.add(new Employee("Martin", "martin.m300@gmail.com", 80000.00));
		
/*		Collections.sort(empList, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
*/	
		
		Collections.sort(empList, (o1, o2)-> o1.getName().compareTo(o2.getName()));
		empList.forEach(System.out::println);
		
	}
}
