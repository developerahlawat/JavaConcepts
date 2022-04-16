package com.javaconcept.java12;

import java.nio.file.Files;
import java.nio.file.Path;

public class FileMissmatch {

	public static void main(String[] args) {
		Path helloworld1 = tempDir.resolve("helloworld1.txt");
		 
		Path helloworld2 = tempDir.resolve("helloworld2.txt");
		 
		long diff = Files.mismatch(helloworld1, helloworld2);   //returns long value

	}

}
