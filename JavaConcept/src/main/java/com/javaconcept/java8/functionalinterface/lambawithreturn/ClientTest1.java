package com.javaconcept.java8.functionalinterface.lambawithreturn;

public class ClientTest1 {

	public static void main(String[] args) {

//		MyInterface myInterface=(n1,n2)->{
//		return n1>n2;
//		};
		
		MyInterface myInterface=(n1,n2)->n1>n2;
		
		System.out.println(myInterface.test(40, 35));
		System.out.println(myInterface.test(40, 45));
	}
}
