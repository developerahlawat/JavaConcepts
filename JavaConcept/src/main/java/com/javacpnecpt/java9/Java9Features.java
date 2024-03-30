package com.javacpnecpt.java9;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Java9Features {
	public static void main(String[] args) {
	
	/*java.util.Set.of() – creates an immutable set of a given elements. 
	In Java 8 creating a Set of several elements would require several lines of code.*/
	Set<String> strKeySet = Set.of("key1", "key2", "key3");
	
	//java.util.Optional.stream() gives us an easy way to you use the power of Streams on Optional elements:
	/*List<String> filteredList = listOfOptionals.stream()
			  								   .flatMap(Optional::stream)
			  								    .collect(Collectors.toList());
	*/
	}
	

}
