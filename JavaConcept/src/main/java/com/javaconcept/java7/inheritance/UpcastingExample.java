package com.javaconcept.java7.inheritance;


class Parent {
	String parentName;
	void parent() {
		System.out.println("parent run");
	}
	void PrintData() {
		System.out.println("method of parent class");
	}
}

class Child extends Parent {
	int childId;

	void child() {
		System.out.println("child run");
	}

	@Override
	void PrintData() {
		System.out.println("method of child class");
	}
}

public class UpcastingExample {
	public static void main(String args[]) {

		Parent upCastingImplicity = new Child(); // upcasting is done implicitly or explicitly,only overridden method
													// can be accessed from child class
		Parent upCastingExplicity = (Parent) new Child();

		upCastingExplicity.parentName = "Father";
		// upCastingExplicity.childId=101;//not accessable,only overridden method of
		// child
		System.out.println(upCastingExplicity.parentName);
		upCastingImplicity.PrintData();
		upCastingImplicity.parent();// parent class method is overriden method hence child will be executed not all
									// methods

		upCastingExplicity.PrintData();
		upCastingExplicity.parent();

		// Child downCasting = new Parent();//compile time error
		// Child downCastingExplicity = (Child) new Parent();// this type using new is
		// not possible,downcasting has to be
		// explicitly,run time error,implicitely not possible
		
		Child downCastingExplicity = (Child) upCastingImplicity; // downcasting has to be
																	// explicitly,run perfectly
		downCastingExplicity.childId = 101;
		System.out.println(downCastingExplicity.childId);
		System.out.println(downCastingExplicity.parentName);
		downCastingExplicity.PrintData();
		downCastingExplicity.child();
		downCastingExplicity.parent();
	}
}

