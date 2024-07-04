package com.javaconcept.java7.synchronization;

public class IntruptThreadThatDoesntStopsWorking extends Thread {
	public void run() {
		try {
			Thread.sleep(1000);
			System.out.println("task");
		} catch (InterruptedException e) {
			System.out.println("Exception handled " + e);
		}
		System.out.println("thread is running...");
	}

	public static void main(String args[]) {
		IntruptThreadThatDoesntStopsWorking t1 = new IntruptThreadThatDoesntStopsWorking();
		t1.start();

		t1.interrupt();

	}
}
