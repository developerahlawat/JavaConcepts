package com.javaconcept.java8.devox;

public class FunctionalProgramming1 {
	/*
	 * Method is function which belongs to a class or to an object .A function has 4
	 * things 1.Name 2.return type 3.Paramater list 4.Body
	 * 
	 * 
	 * Lambda Expression--Paramter list->body
	 * 
	 */

	public static void main(String[] args) {

		Thread th = new Thread();
	    
		
		//using Ananomous function
		Thread thh = new Thread(new Runnable() {
			public void run() {
				System.out.println("In another thread using ananomous");
			}
		});
		
		//using lambda
		Thread thhh = new Thread(() -> System.out.println("In another thread using lambda"));

		th.start();
		thh.start();
		thhh.start();
		System.out.println("In Main");
	}

}
