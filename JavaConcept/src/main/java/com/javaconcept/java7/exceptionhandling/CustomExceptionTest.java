package com.javaconcept.java7.exceptionhandling;

import java.util.Scanner;

public class CustomExceptionTest {

	public static void main(String[] args) throws ClassNotFoundException {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter person age:");
			int age = scanner.nextInt();
			new CustomExceptionTest().calculateExtraBenefits(age);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void calculateExtraBenefits(int age) {
		// If age is less than 60 throw exception
		if (age < 60) {
			throw new InvalidAgeException(age);
		} else {
			System.out.println("Recognized as senior citizen..");
			System.out.println("Calculate ExtraBenefit for senior citizen..");
		}
	}
}
