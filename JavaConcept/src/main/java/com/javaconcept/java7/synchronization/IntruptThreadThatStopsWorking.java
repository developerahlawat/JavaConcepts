package com.javaconcept.java7.synchronization;

public class IntruptThreadThatStopsWorking extends Thread {
	public void run() {
		try {
			Thread.sleep(1000);
			System.out.println("task");
		} catch (InterruptedException e) {
			throw new RuntimeException("Thread interrupted..." + e);
		}

	}

	public static void main(String args[]) {
		IntruptThreadThatStopsWorking t1 = new IntruptThreadThatStopsWorking();
		t1.start();
		try {
			t1.interrupt();
		} catch (Exception e) {
			System.out.println("Exception handled " + e);
		}
		/*
In this example, after interrupting the thread, we are propagating it, so it will stop working. 
If we don't want to stop the thread, we can handle it where sleep() or wait() method is invoked. 
Let's first see the example where we are propagating the exception.
		 */

	}
}