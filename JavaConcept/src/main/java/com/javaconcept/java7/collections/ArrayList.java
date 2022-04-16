package com.javaconcept.java7.collections;

public class ArrayList {
	public static void main(String args[]) {

		Student s1 = new Student(101, "vivek", 23);
		Student s2 = new Student(102, "sanjeev", 21);
		Student s3 = new Student(103, "dikshant", 25);

		java.util.ArrayList<Student> list = new java.util.ArrayList<>();

		list.add(s1);
		list.add(s2);
		list.add(s2);
		list.add(s3);
		
		System.out.println("2nd in list :"+list.get(1));		
		System.out.println("----------------------------------");
		
		list.forEach((s)->System.out.println(s));		
		list.remove(1); 
		
		System.out.println("----------------------------------");
		list.forEach((s)->System.out.println(s));
		
		list.remove(s3);  
		System.out.println("----------------------------------");
		list.forEach((s)->System.out.println(s));
		
		
		java.util.List<Student> list2 = new java.util.ArrayList<>();
		Student s4 = new Student(104, "mohit", 23);
		list2.add(s4);		
		
		 System.out.println("----------------------------------");
		 list2.forEach((s)->System.out.println(s));
		
		 list.addAll(list2); 
		 System.out.println("----------------------------------");
		 list.forEach((s)->System.out.println(s));
		 
		 list2.clear();
		 System.out.println("----------------------------------");
		 list2.forEach((s)->System.out.println(s));
		 
		 System.out.println(list2.isEmpty());
		 System.out.println(list.size());
		 System.out.println("----------------------------------");
		 list.forEach((s)->System.out.println(s));
		 
		 list.set(1, new Student(105, "prabhat", 20));
		 System.out.println("----------------------------------");
		 list.forEach((s)->System.out.println(s));
	}
}
