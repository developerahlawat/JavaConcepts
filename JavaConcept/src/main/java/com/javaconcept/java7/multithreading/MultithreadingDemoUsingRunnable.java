package com.javaconcept.java7.multithreading;

public class MultithreadingDemoUsingRunnable implements Runnable {
	// Java code for thread creation by implementing
	// the Runnable Interface

	public void run() {
		try {
			// Displaying the thread that is running
			// Number of threads
			for (int i = 0; i < 4; i++) {
				try {
					System.out.println("Thread " + Thread.currentThread().getId() + " is running::::" + i);
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println(e);
				}
			}
		} catch (Exception e) {
			// Throwing an exception
			System.out.println("Exception is caught");
		}

	}

// Main Class
	static class Multithread {
		public static void main(String[] args) throws InterruptedException {

			Thread object1 = new Thread(new MultithreadingDemoUsingRunnable());
			Thread object2 = new Thread(new MultithreadingDemoUsingRunnable());
			Thread object3 = new Thread(new MultithreadingDemoUsingRunnable());
			object1.start();
			//object1.join();//join method enable current thread to complete first,then only start other threads
			object2.start();
			//object2.join();
			object3.start();
			//object3.join();
			

			// object1.run();
			// object2.run();
			// if run method called directly will run in main thread only,no
			// seperate thread will be created

		}
	}
}
