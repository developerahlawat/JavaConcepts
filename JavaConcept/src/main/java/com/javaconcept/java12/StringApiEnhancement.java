package com.javaconcept.java12;

import java.util.ArrayList;
import java.util.List;

public class StringApiEnhancement {
	public static void main(String[] args) {
	String result = "foo\nbar\nbar2".indent(4);

	System.out.println(result);
	
	System.out.println("<------------------------>");

	
	 List<String> names = List.of("   Alex", "brian");
	 
	 List<String> transformedNames = new ArrayList<>();
	 
	 for( String name:names) { 
		 String transformedName = name.transform(String::strip);
	 	 transformedNames.add(transformedName); }
}
}
