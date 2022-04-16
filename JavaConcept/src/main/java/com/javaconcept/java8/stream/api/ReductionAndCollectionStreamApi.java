package com.javaconcept.java8.stream.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReductionAndCollectionStreamApi {

	public static void main(String[] args) {

		List<Integer> integers = new ArrayList<>();
		
		integers.add(10);
		integers.add(20);
		integers.add(30);
		
		Integer sum = integers.stream().reduce(100,(x,y)->x+y);
		System.out.println(sum);
		
		
		System.out.println("-------------------------------");
		
		List<String> list = new ArrayList<>();
		list.add("Sean");
		list.add("Martin");
		list.add("Frank");
		
		List<String> collect = list.stream().map(element->element.toUpperCase()).collect(Collectors.toList());
		
		collect.forEach(System.out::println);
		System.out.println("-------------------------------");
		
		
		 // creating a list of Strings
        List<String> words = Arrays.asList("GFG", "Geeks", "for",
                                           "GeeksQuiz", "GeeksforGeeks");
  
        // The lambda expression passed to
        // reduce() method takes two Strings
        // and returns the longer String.
        // The result of the reduce() method is
        // an Optional because the list on which
        // reduce() is called may be empty.
        Optional<String> longestString = words.stream()
                                   .reduce((word1, word2)
                             -> word1.length() > word2.length()
                                           ? word1 : word2);
  
        // Displaying the longest String
        longestString.ifPresent(System.out::println);
        System.out.println("-------------------------------");
        // String array
        String[] array = { "Geeks", "for", "Geeks" };
  
        // The result of the reduce() method is
        // an Optional because the list on which
        // reduce() is called may be empty.
        Optional<String> String_combine = Arrays.stream(array)
                                           .reduce((str1, str2)
                                           -> str1 + "-" + str2);
  
        // Displaying the combined String
        if (String_combine.isPresent()) {
            System.out.println(String_combine.get());
        }
        

        System.out.println("-------------------------------");
       // To get the product of all elements
        // in given range excluding the
        // rightmost element
        int product = IntStream.range(2, 8)
                     .reduce((num1, num2) -> num1 * num2)
                     .orElse(-1);
  
        // Displaying the product
        System.out.println("The product is : " + product);
    }
		
	}


