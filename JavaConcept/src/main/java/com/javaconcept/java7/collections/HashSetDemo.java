package com.javaconcept.java7.collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
	
		public static void main(String args[]) {

			Student s1 = new Student(101, "vivek", 23);
			Student s2 = new Student(102, "sanjeev", 21);
			Student s4 = new Student(102, "sanjeev", 21);
			Student s3 = new Student(103, "dikshant", 25);
			s1.equals(s2);

			HashSet<Student> set = new HashSet<>();

			set.add(s1);
			set.add(s2);
			set.add(s2);
			set.add(null);
			set.add(s3);
			set.add(s4);
			set.add(null);
			
			System.out.println(s2.hashCode());
			System.out.println(s4.hashCode());
			
			
			set.forEach((s)->System.out.println(s));		
			set.remove(s2); 
			
			System.out.println("----------------------------------");
			set.forEach((s)->System.out.println(s));
			
			set.remove(s3);  
			System.out.println("----------------------------------");
			set.forEach((s)->System.out.println(s));
			
			
			Set<Student> set2 = new HashSet<>();
		//	Student s4 = new Student(104, "mohit", 23);
			set2.add(s4);	
			
			
			 System.out.println("----------------------------------");
			 set2.forEach((s)->System.out.println(s));
			
			 set.addAll(set2); 
			 System.out.println("----------------------------------");
			 set.forEach((s)->System.out.println(s));
			 
			 set2.clear();
			 System.out.println("----------------------------------");
			 set2.forEach((s)->System.out.println(s));
			 
			 System.out.println(set2.isEmpty());
			 System.out.println(set.size());
			 System.out.println("----------------------------------");
			 set.forEach((s)->System.out.println(s));
			 
		//	 set.set(1, new Student(105, "prabhat", 20));
			 
			 System.out.println("----------------------------------");
			 set.forEach((s)->System.out.println(s));
		}
	}



