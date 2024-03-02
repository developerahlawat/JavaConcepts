package com.javaconcept.java8.functionalinterface.lambda.bestpractice;

import java.util.ArrayList;
import java.util.List;

public class FunctionalInterfaceLambdaReferenceToInstance {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("David");
		names.add("Richard");
		names.add("Samuel");
		names.add("Rose");
		names.add("John");
		
		//names.forEach(x->System.out.println(x));
		names.forEach(System.out::println);
	}

}
