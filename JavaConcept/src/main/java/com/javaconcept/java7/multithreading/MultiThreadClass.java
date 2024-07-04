package com.javaconcept.java7.multithreading;

import java.util.Iterator;

import javax.swing.text.MutableAttributeSet;

public class MultiThreadClass extends Thread {

	@Override
	public void run() {
//if run is not overridden it will,thread will be created but doing would be done inside it,so would be useless
		for (int i = 0; i < 1000; i++) {
		
			System.out.println("I am executed by a child thread:"+Thread.currentThread().getId()+"::::" +i);
			System.out.println("Is Demon Thread-"+Thread.currentThread().isDaemon());
		}
	}


static class MultiThreadDemo {
	public static void main(String[] args) {

		// System.out.println("Main Thread");
		// System.out.println(Thread.currentThread().getName());//always created main
		// thread

		MultiThreadClass multiThreadClass = new MultiThreadClass();// user defined thread
		multiThreadClass.setDaemon(true);
		// to make user thread as demon thread,it is a low priority thread,only
		// complete once user thread or any other thread is completed
		// jvm dont wait for demon thread before exiting
		//if make demon thread as true may not execute till 999
		// if not a demon thread then will run till 999
		
		
		multiThreadClass.start();//creates new thread,thread with thread scheduler and execute run method 
		// multiThreadClass.run();// never replace start with run,as run only call run
		// method inside main thread only,it doesnt create any new threa

		
		// multiThreadClass.setDaemon(true);//if made demon after start of thread then
		// illegalState exception

		for (int i = 0; i < 1000; i++) {
		
			System.out.println("I am executed by a main thread:::::" + Thread.currentThread().getName());

		}
		//context switching is happening between main thread and user thread 
	}
}
}
