package com.javaconcept.java7.comparatorusinglambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("Sean", "sean.m@gmail.com", 90000.00));
		empList.add(new Employee("Andrew", "andy.cs@gmail.com", 70000.00));
		empList.add(new Employee("Martin", "martin.m300@gmail.com", 80000.00));
		
		System.out.println("List of employee before sorting..");
		empList.forEach(System.out::println);
		
		//Collections.sort(empList, new EmployeeNameSorter());// using external class,and functional interface in that class

//		Collections.sort(empList, new Comparator<Employee>() {
//
//			@Override
//			public int compare(Employee o1, Employee o2) {
//				return o1.getName().compareTo(o2.getName());// using functional interface in this class only
//			}
//		});
		
		Collections.sort(empList,(e1,e2)->e1.getName().compareTo(e2.getName()));// using lambda expression,best approach
		Comparator.comparing(Employee::getEmail);
		System.out.println("--------------------------------------------");
		System.out.println("List of employee after sorting..");
		empList.forEach(System.out::println);
		
	
	}
}
