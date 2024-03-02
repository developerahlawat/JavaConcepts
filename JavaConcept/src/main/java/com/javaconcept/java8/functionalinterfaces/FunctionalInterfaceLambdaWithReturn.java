package com.javaconcept.java8.functionalinterfaces;

public class FunctionalInterfaceLambdaWithReturn {

	public static void main(String[] args) {

		MyFunctionalInterface myInterfacee=(n1,n2)->{
		return n1>n2;
		};
		
		MyFunctionalInterface myInterface=(n1,n2)->n1>n2;
		
		System.out.println(myInterfacee.test(40, 35));	
		System.out.println(myInterface.test(40, 35));
		System.out.println(myInterface.test(40, 45));
	}
}
