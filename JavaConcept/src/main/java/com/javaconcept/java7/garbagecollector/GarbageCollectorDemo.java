package com.javaconcept.java7.garbagecollector;

import java.io.IOException;

public class GarbageCollectorDemo {
	@Override
	public void finalize() {
		System.out.println("Finalize method is run");
	}

	public static void main(String args[]) throws IOException {
		System.out.println("Total Memory: " + Runtime.getRuntime().totalMemory());
		System.out.println("Free  Memory: " + Runtime.getRuntime().freeMemory());

		GarbageCollectorDemo s1 = new GarbageCollectorDemo();
		GarbageCollectorDemo s2 = new GarbageCollectorDemo();
		s1 = null;
		s2 = null;

		// Runtime.getRuntime().exec("notepad");//will open a new notepad

		for (int i = 0; i < 10000; i++) {
			new GarbageCollectorDemo();
		}
		System.out.println("After creating 10000 instance, Free Memory: " + Runtime.getRuntime().freeMemory());
		System.gc();
		System.out.println("After gc(), Free Memory: " + Runtime.getRuntime().freeMemory());

		// Runtime.getRuntime().gc();// Onther way of calling garbage collector
		// explicitely
		// System.gc();
		// To explicitely call garbage collector,
		// before garbage collector is called finilize method is called.

		System.out.println("Main method is done");
	}
}
