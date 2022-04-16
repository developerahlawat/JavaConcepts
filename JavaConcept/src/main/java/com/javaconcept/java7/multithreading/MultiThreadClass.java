package com.javaconcept.java7.multithreading;

public class MultiThreadClass extends Thread {

	@Override
	public void run() {
//if run is not overridden it will,thread will be created but doing would be done inside it,so would be useless
		for (int i = 0; i < 10; i++) {
			System.out.println("I am executed by a child thread:"+Thread.currentThread().getName()+"::::" +i);
			System.out.println("Is Demon Thread-"+Thread.currentThread().isDaemon());
		}
	}
}
