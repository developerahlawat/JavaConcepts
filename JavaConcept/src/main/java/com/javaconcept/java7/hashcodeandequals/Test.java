package com.javaconcept.java7.hashcodeandequals;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		/*
		 * Contract 1. if two objects a re equals according to Equals(Object o) method
		 * then the hashcode for both the object must be same (int value).
		 * 
		 * 2. its not necessary that if you have same hashcode for 2 object means those
		 * two object are equal. this is collision.Better hash function prevents this.
		 * 
		 * 3.whenever it is invoked on the same object more than once during an
		 * execution of a java application ,the hashcode method must consistently return
		 * the same integer
		 */

		Student std1 = new Student(1, "Nik", 101);
		Student std2 = new Student(1, "Nik", 101);
		Student std3 = new Student(1, "Nik", 101);

		Student std4 = std1;

		System.out.println("Shallow Compare-" + (std1 == std4));
		System.out.println("Deep Compare-" + (std1.equals(std4)));
		// will return true for both since reference
		// and value are equals for both

		System.out.println("Shallow Compare-" + (std1 == std2));
		System.out.println("Deep Compare-" + (std1.equals(std2)));
		// this shall be true only when equals method is
		// overridden as it checks values of object



		System.out.println(std1.hashCode());
		System.out.println(std2.hashCode());
		System.out.println(std3.hashCode());



		HashMap<Student, String> stdMap = new HashMap<>();
		/*
		 * hashcode method is called to find bucket ,when bucket is assigned ,equal
		 * method is called to check its equality by value .
		 */
		stdMap.put(std1, "Student1");
		stdMap.put(std2, "Student2");
		stdMap.put(std3, "Student3");
		
		for(Map.Entry<Student,String> entry:stdMap.entrySet()) {
			System.out.println(entry.getKey() + ":::" + entry.getValue());
			System.out.println(entry.hashCode());
		}

	}

}
