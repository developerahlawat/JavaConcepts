package com.javaconcept.java7.multithreading;

public class MultithreadingDemoUsingThread extends Thread {
	// Java code for thread creation by extending
	// the Thread class
	
		public void run()
		{
			try {
				//Thread.sleep(1000);  
				// Displaying the thread that is running
				System.out.println(
					"Thread " + Thread.currentThread().getId()
					+ " is running");
			}
			catch (Exception e) {
				// Throwing an exception
				System.out.println("Exception is caught"+e);
			}
		}
	

	// Main Class
	public static class Multithread {
		public static void main(String[] args) throws InterruptedException
		{
			int n = 8; // Number of threads
			for (int i = 0; i < n; i++) {
				Thread.sleep(1000);// taking -ve value will throw illegal state exception  
				MultithreadingDemoUsingThread object
					= new MultithreadingDemoUsingThread();
				object.start();
			}
		}
	}

}