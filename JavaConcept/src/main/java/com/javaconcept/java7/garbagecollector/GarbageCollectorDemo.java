package com.javaconcept.java7.garbagecollector;

public class GarbageCollectorDemo {
	@Override
	public void finalize() {
		System.out.println("Finalize method is run");
	}

	public static void main(String args[]) {
		GarbageCollectorDemo s1 = new GarbageCollectorDemo();
		GarbageCollectorDemo s2 = new GarbageCollectorDemo();
		s1 = null;
		s2 = null;
		//System.gc();
		// To explicitely call garbage collector,
		//before garbage collector is called finilize method is called.
		
		Runtime.getRuntime().gc();//Onther way of calling garbage collector  explicitely
		

		System.out.println("Main method is done");
	}
}
