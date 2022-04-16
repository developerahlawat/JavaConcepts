package com.javaconcept.java8.functionalinterface.lambda.bestpractice;

public class Test2 {

	private String value ="Eclosing scope value";
	public static void main(String[] args) {

		new Test2().scopeExperiment();
	}
	private  void scopeExperiment() {
		Fooo foo1 = new Fooo() {
			private String value ="Inner Class value";
			@Override
			public String method() {
				return this.value;
			}
		};
		
		System.out.println(foo1.method());
		Fooo foo2 =()->{
			//String value ="Lambda value";
			return this.value;
		};
		
		System.out.println(foo2.method());
	}

}


@FunctionalInterface
interface Fooo{
	String method();
}