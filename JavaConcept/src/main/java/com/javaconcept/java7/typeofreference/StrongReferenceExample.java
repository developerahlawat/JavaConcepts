package com.javaconcept.java7.typeofreference;

class Gfgs {
	// Code..
}

public class StrongReferenceExample {
	// Java program to illustrate Strong reference
	public static void main(String[] args) {
		// Strong Reference - by default
		Gfgs g = new Gfgs();

		// Now, object to which 'g' was pointing earlier is
		// eligible for garbage collection.
		g = null;
	}
}
