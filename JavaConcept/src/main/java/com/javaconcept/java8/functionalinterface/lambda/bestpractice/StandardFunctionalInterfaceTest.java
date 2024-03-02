package com.javaconcept.java8.functionalinterface.lambda.bestpractice;

import java.util.function.Function;

public class StandardFunctionalInterfaceTest {

	public static void main(String[] args) {
		
		Foo foo =s->s+" from Lambda";
		UseFoo useFooo = new UseFoo();
		String resultt = useFooo.addd("John", foo);
		System.out.println(resultt);

		
		Function<String, String> function=s->s+ " from Lambda";
		UseFoo useFoo = new UseFoo();
		String result = useFoo.add("John", function);
		System.out.println(result);
	}

}
