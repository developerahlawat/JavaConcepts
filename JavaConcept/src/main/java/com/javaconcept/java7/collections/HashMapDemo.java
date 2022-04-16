package com.javaconcept.java7.collections;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {
	
	public static void main(String args[]) {
	
	Student s1 = new Student(101, "vivek", 23);
	Student s2 = new Student(102, "sanjeev", 21);
	Student s3 = new Student(103, "dikshant", 25);

	HashMap<Integer,Student> hashMap = new HashMap<>();
	
	hashMap.put(1,s1);  
	hashMap.put(2,s2);  
	hashMap.put(3,s3);
	
	
	Set<Integer> keySet = hashMap.keySet();
	for (Integer key : keySet) {
		System.out.print(key);
		System.out.println("\t"+hashMap.get(key));
	}
	
	System.out.println("----------------------------------");
	System.out.println(hashMap.get(1));
	
	System.out.println(hashMap.remove(2));
	
	System.out.println("----------------------------------");
	hashMap.forEach((k,v)->System.out.println(k+"\t"+v));
	
	System.out.println("----------------------------------");
	System.out.println(hashMap.size());
	System.out.println(hashMap.containsKey(4));
	System.out.println(hashMap.containsValue(s1));
	
	System.out.println(hashMap.replace(1, s1, s2));
	System.out.println("----------------------------------");
	hashMap.forEach((k,v)->System.out.println(k+"\t"+v));
	
	}
}
