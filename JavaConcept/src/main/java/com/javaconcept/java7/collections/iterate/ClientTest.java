package com.javaconcept.java7.collections.iterate;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

public class ClientTest {

	public static void main(String[] args) {
		Student studentt = new Student("doll",24);
		

		List<Student> stuList = new ArrayList<>();
		stuList.add(new Student("Sean", 45));
		stuList.add(new Student("Andrew", 40));
		stuList.add(new Student("Martin", 42));
		stuList.add(studentt);
		

		for (int i=0;i<stuList.size();i++) {
			System.out.println(stuList.get(i));//  simple for loop
		}
		
		System.out.println("----------------------------------");
		stuList.forEach(new MyConsumer());// using consumers

		System.out.println("----------------------------------");

		stuList.forEach((s)->System.out.println(s));  // s is object of consumer,using lambda expression,,internal iteration,fast loop

		System.out.println("----------------------------------");

		stuList.forEach(System.out::println);// java 8 feature(inhanced foreach loop),simplified version of lambda,using method reference,best approach

		System.out.println("----------------------------------");

		for (Student student : stuList) {
			System.out.println(student);//  inhanced for loop,external iteration,slow loop
		}

		System.out.println("-------------------");

		Iterator<Student> iterator = stuList.iterator();
		while (iterator.hasNext()) {
			
			System.out.println(iterator.next());// using iterator,external iteration
		}
		
		System.out.println("-------------------");

		ListIterator<Student> iteratorr = stuList.listIterator(stuList.size());
		while (iteratorr.hasPrevious()) {
			
			System.out.println(iteratorr.previous());// using iterator,external iteration
			// ListIterator - traverse a list of elements in either forward or backward order
		      
		}

	}
}

class MyConsumer implements Consumer<Student> {
	@Override
	public void accept(Student student) {
		System.out.println(student);
	}
}
