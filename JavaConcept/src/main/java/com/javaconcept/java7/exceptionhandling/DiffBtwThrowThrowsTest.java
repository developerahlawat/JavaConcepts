package com.javaconcept.java7.exceptionhandling;

public class DiffBtwThrowThrowsTest {
	public static void main(String[] args) throws ClassNotFoundException {

		try {
			method1();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		method2();
	}

	private static void method1() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// throws->followed by class name,calling method must have handled this
		// exception
		Class<?> cls = Class.forName("com.exceptionhandling.Hello");
		Object obj = cls.newInstance();
		if (obj instanceof Hello) {
			Hello hello = (Hello) obj;
			hello.greet();
		} else {
			throw new ClassCastException("Provided class type is not correct!!");
			// throw->followed by object
		}
	}

	private static void method2() {
		try {
			Class<?> cls = Class.forName("com.exceptionhandling.Hello");
			Object obj = cls.newInstance();
			if (obj instanceof Hello) {
				Hello hello = (Hello) obj;
				hello.greet();
			} else {
				throw new ClassCastException("Provided class type is not correct!!");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}
