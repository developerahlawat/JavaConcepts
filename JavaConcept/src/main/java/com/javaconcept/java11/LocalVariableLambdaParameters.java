package com.javaconcept.java11;

import java.util.stream.IntStream;

public class LocalVariableLambdaParameters {
	  
	
	  public static void main(String[] args) { 
	      IntStream.of(1, 2, 3, 5, 6, 7)   	//Variable used in lambda expression 
	               .filter( (var i )-> i % 2 == 0) 
	               .forEach(System.out::println); 
	 	
	        IntStream.of(1, 2, 3, 5, 6, 7)    	//Variable without using lambda expression 
	                 .filter(i -> i % 2 == 0) 
	                 .forEach(System.out::println); 
	    } 
	   

}
