package com.javaconcept.java7.synchronization;

public class VolatileKeyword {
	/*
	 If flag were not marked as volatile, the reader thread might not see the updated value of flag 
	 because the change could be cached in the local memory of the writer thread and not immediately 
	 flushed to the main memory. 
	 */
	private static volatile boolean flag = false;

	public static void main(String[] args) {
		Thread writerThread = new Thread(() -> {
			try {
				Thread.sleep(1000); // Simulate some work with sleep
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
			flag = true;
			System.out.println("Writer thread updated flag to true");
		});

		Thread readerThread = new Thread(() -> {
			while (!flag) {
				// Busy-wait until the flag is true
			}
			System.out.println("Reader thread detected flag change to true");
		});

		writerThread.start();
		readerThread.start();
	}
}
