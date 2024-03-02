package com.javaconcept.java8.stream.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiArrayAndStringQuestions {
	
	public static void main(String[] args) {
		//1.Given a list of integers, find out all the even numbers that exist in the list using Stream functions?
		List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);
        list.stream()
            .filter(n -> n%2 == 0)
            .forEach(System.out::println);
		System.out.println("----------------------------");
		
		
		//2. Given a list of integers, find out all the numbers starting with 1 using Stream functions?
		 List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
         myList.stream()
               .map(s -> s + "") // Convert integer to String
               .filter(s -> s.startsWith("1"))
               .forEach(System.out::println);
		
         System.out.println("----------------------------");
        
         //3. How to find duplicate elements in a given integers list in java using Stream functions?
         List<Integer> myListt = Arrays.asList(10,15,8,49,25,98,98,32,15);
         Set<Integer> set = new HashSet();
         myListt.stream()
               .filter(n -> !set.add(n))
               .forEach(System.out::println);
		System.out.println("----------------------------");
       
		//4. Given the list of integers, find the first element of the list using Stream functions?
		List<Integer> myList3 = Arrays.asList(10,15,8,49,25,98,98,32,15);
        myList3.stream()
              .findFirst()
              .ifPresent(System.out::println);
		
		System.out.println("----------------------------");
		
		
		//5.Given a list of integers, find the total number of elements present in the list 
		//using Stream functions?
	    List<Integer> myListtt = Arrays.asList(10,15,8,49,25,98,98,32,15);
	    long count =  myListtt.stream()
	                          .count();
	    System.out.println(count);  
	    System.out.println("----------------------------");
		
	    //6.Given a list of integers, find the maximum value element present in it using Stream functions?
	    List<Integer> myList6 = Arrays.asList(10,15,8,49,25,98,98,32,15);
	    int max =  myList6.stream()
	                       .max(Integer::compare)
	                       .get();
	    System.out.println(max);        
	          
	    System.out.println("----------------------------");
	          
	          
	   //7. Given a String, find the first non-repeated character in it using Stream functions?       
	    String input = "Java articles are Awesome";
	          
	    Character result = input.chars() // Stream of String       
	                  .mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s))) // First convert to Character object and then to lowercase         
	                  .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) //Store the chars in map with count 
	                  .entrySet()
	                  .stream()
	                  .filter(entry -> entry.getValue() == 1L)
	                  .map(entry -> entry.getKey())
	                  .findFirst()
	                  .get();
	    
	    
	    
	    System.out.println(result); 
	    System.out.println("----------------------------");
	          
	   //8. Given a String, find the first repeated character in it using Stream functions?       
	     String input8 = "Java Articles are Awesome";

	     Character result8 = input8.chars() // Stream of String       
	                             .mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s))) // First convert to Character object and then to lowercase         
	                             .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) //Store the chars in map with count 
	                             .entrySet()
	                             .stream()
	                             .filter(entry -> entry.getValue() > 1L)
	                             .map(entry -> entry.getKey())
	                             .findFirst()
	                             .get();
	      System.out.println(result8);   
	   
	      System.out.println("9.----------------------------");      
	    //9. Given a list of integers, sort all the values present in it using Stream functions?
	          
	     List<Integer> myList9 = Arrays.asList(10,15,8,49,25,98,98,32,15);

	      myList9.stream()
	             .sorted()
	             .forEach(System.out::println);
	      System.out.println("9a.----------------------------");  
	    //9a. Given a list of integers, find second largest?
          
		     List<Integer> myList9a = Arrays.asList(10,15,8,49,25,98,98,32,15);

		     Integer intt= myList9a.stream()
		             .sorted()
		             .skip(1)
		              .findFirst().get();
		     System.out.println(intt);
		 System.out.println("10.----------------------------");  
	    //10. Given a list of integers, sort all the values present in it in descending order using Stream functions?
	     List<Integer> myList10 = Arrays.asList(10,15,8,49,25,98,98,32,15);

	     myList10.stream()
	            .sorted(Collections.reverseOrder())
	            .forEach(System.out::println);       
	           
	           
	   //11. Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
	           
	     int[] nums = {10,15,8,49,25,98,32};
	     List<Integer> list11 = Arrays.stream(nums)
	                                   .boxed()
	                                   .collect(Collectors.toList());
	     Set<Integer> sett = new HashSet<>(list);
	     if(sett.size() == list11.size()) {
	      System.out.println("0");
	     } else {
	    	 System.out.println("1");
	     }
	     System.out.println("11.----------------------------"); 
	     
	   //12. Write a Java 8 program to find longest substring
		List<String> list12 = Arrays.asList("Java", "8","explained", "through", "programs");
		    
		String longest=list12.stream()
		           .reduce((word1,word2)-> word1.length()> word2.length()?word1:word2)
		           .get();
		     
		System.out.println(longest);
	           
	   //13. Write a Java 8 program to concatenate two Streams?
	    List<String> list1 = Arrays.asList("Java", "8");
	    List<String> list2 = Arrays.asList("explained", "through", "programs");
	    
	    Stream<String> concatStream = Stream.concat(list1.stream(), list2.stream());
	            
	    // Concatenated the list1 and list2 by converting them into Stream
	    
	    concatStream.forEach(str->System.out.print(str + " "));
	            
	    // Printed the Concatenated Stream
	           
	   //15. Write a Java 8 program to sort an array and then convert the sorted array into Stream?        
	     int arr[] = { 99, 55, 203, 99, 4, 91 };
	     Arrays.parallelSort(arr);
	           // Sorted the Array using parallelSort()
	            
	     Arrays.stream(arr).forEach(n -> System.out.print(n + " "));
	    /* Converted it into Stream and then        printed using forEach */


         //17. How to convert a List of objects into a Map by considering duplicated keys and store them in sorted order?

           List<Notes> noteLst = new ArrayList<>();
           noteLst.add(new Notes(1, "note1", 11));
           noteLst.add(new Notes(2, "note2", 22));
           noteLst.add(new Notes(3, "note3", 33));
           noteLst.add(new Notes(4, "note4", 44));
           noteLst.add(new Notes(5, "note5", 55));

           noteLst.add(new Notes(6, "note4", 66));
/*

           Map<String, Long> notesRecords = noteLst.stream()
                                        .sorted(Comparator.comparingLong(Notes::getId)
                                        .reversed()) // sorting is based on TagId 55,44,33,22,11
                                        .collect(Collectors.toMap
                                        		(Notes::getNoteName, 
                                        				Notes::getId,
                                        				(oldValue, newValue) ->
                                        		oldValue,LinkedHashMap::new));
                                        		*/
           //consider old value 44 for dupilcate key
           //it keeps order
         //  System.out.println("Notes : " + notesRecords);
    
           //18. How to count each element/word from the String ArrayList in Java8?
    
           List<String> names = Arrays.asList("AA", "BB", "AA", "CC");
           Map<String,Long> namesCount = names
                            .stream()
                            .collect(
                             Collectors.groupingBy(
                               Function.identity()
                             , Collectors.counting()
                             ));
           System.out.println(namesCount); 
    
    
    
    
           //
           //19.How to find only duplicate elements with its count from the String ArrayList in Java8?
           List<String> names19 = Arrays.asList("AA", "BB", "AA", "CC");
		
           Map<String,Long> namesCount19 = names19
	                       .stream()
	                       .filter(x->Collections.frequency(names, x)>1)
	                       .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	    
           System.out.println(namesCount19);
           System.out.println("----------------------------");
	   
	    
	    
	    
           //20.How to check if list is empty in Java 8 using Optional, 
           //if not null iterate through the list and print the object?
	    /*
           Optional.ofNullable(noteLst)
                     .orElseGet(Collections::emptyList) // creates empty immutable list: [] in case noteLst is null
                     .stream().filter(Objects::nonNull) //loop throgh each object and consider non null objects
                     .map(note -> Notes::getNoteName) // method reference, consider only tag name
                     .forEach(System.out::println); // it will print tag names
	*/
           System.out.println("----------------------------");
           
           //21.find the Maximum element in an array?
           int[] arrr= new int[]{12,19,20,88,00,9};
		
           System.out.println(Arrays.stream(arrr).max().getAsInt());
           System.out.println("----------------------------");
	    
	    
	    
           //22.Write a program to print the count of each character in a String?
           String s = "string data to count each character";
           Map<String, Long> map = Arrays.stream(s.split(""))
        		   .map(String::toLowerCase)
        		   .collect(Collectors.groupingBy(str -> str,LinkedHashMap::new, Collectors.counting()));
           map.forEach((k,v)->System.out.println(k+"="+v));
                
		
		
	}
}
