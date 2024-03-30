package com.javaconcept.java8.functionalinterface.lambda.bestpractice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MethodReference {

	public static void main(String[] args) {

		ExecutorService executorService = Executors.newSingleThreadExecutor();
		
		Runnable command = MethodReference::myRun;//class then its static method name using method refernce
		executorService.execute(command);
	}

	private static void myRun(){
		System.out.println("My Task is running");
	}
}
