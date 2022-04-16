package com.javaconcept.java8.methodreference.staticmethod;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ClientTest {

	public static void main(String[] args) {

		ExecutorService executorService = Executors.newSingleThreadExecutor();
		
		Runnable command = ClientTest::myRun;//class then its static method name using method refernce
		executorService.execute(command);
	}

	private static void myRun(){
		System.out.println("My Task is running");
	}
}
