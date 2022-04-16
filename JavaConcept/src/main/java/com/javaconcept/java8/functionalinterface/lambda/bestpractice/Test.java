package com.javaconcept.java8.functionalinterface.lambda.bestpractice;

public class Test {

	public static void main(String[] args) {

/*		Runnable r = new Runnable() {
			@Override
			public void run() {
				System.out.println("My Task");
			}
		};
*/		
		Runnable r =()->System.out.println("My Task");
		Thread thread = new Thread(r);
		thread.start();
	}

}
