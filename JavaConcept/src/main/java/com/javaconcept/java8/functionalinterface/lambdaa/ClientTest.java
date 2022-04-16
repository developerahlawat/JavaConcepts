package com.javaconcept.java8.functionalinterface.lambdaa;

public class ClientTest {

	public static void main(String[] args) {
//		MyInterface1 myInterface1 = new MyInterface1() {
//			@Override
//			public void method1() {
//				System.out.println("This is traditional method");
//			}
//		};
//		myInterface1.method1();
//	}

	MyInterface1 myInterface1=()->System.out.println("This methods executes using lambda..");
	myInterface1.method1();

	System.out.println("-----------------------------");

	MyInterface2 myInterface2=name->System.out.println("Your name is:"+name);
	myInterface2.method2("Sean Murphy");

	System.out.println("-----------------------------");

	MyInerface3 myInerface3 = (name, age) -> {
		System.out.println("Your name is:" + name);
		System.out.println("You are " + age + " years Old..");
	};

	myInerface3.method3("Andrew",30);
}

}
