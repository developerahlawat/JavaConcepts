package com.javaconcept.java8.stream.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamGroupBy {
	
	public static void main(String[] args) { 
		List<String> fruitNames = Arrays.asList("apple", "apple", "banana", "apple", "orange", "banana", "papaya");
		
		//Traditional approach
		Map<String, Integer> fruitMap = new HashMap<>();
		for (String f : fruitNames) {
		    if (fruitMap.containsKey(f)) fruitMap.put(f, fruitMap.get(f) + 1);
		    else fruitMap.put(f, 1);
		}
		
		//streams group by
		Map<String, Long> result = fruitNames.stream()
		        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		result.forEach((k,v)->System.out.println(k+"-"+v));
		
		System.out.println("----------------------------");
		
        List<Products> productsList = new ArrayList<Products>();  
        //Adding Products  
        productsList.add(new Products(0,"Zee Laptop",28000));  
        productsList.add(new Products(1,"HP Laptop",25000));  
        productsList.add(new Products(2,"Dell Laptop",30000));  
        productsList.add(new Products(3,"Lenevo Laptop",28000));  
        productsList.add(new Products(4,"Sony Laptop",28000));  
        productsList.add(new Products(5,"Apple Laptop",90000));
        productsList.add(new Products(6,"Dell Laptop",80000)); 
        productsList.add(new Products(7,"Asus Laptop",28000));
        productsList.add(new Products(8,"Sony Laptop",28000)); 
        productsList.add(new Products(9,"Sony Laptop",28000));  

	   
        //1.Group By with Function
        Map<Integer, List<Products>> productsByPrice = productsList.stream()
                .collect(Collectors.groupingBy(Products::getPrice));
        
        productsByPrice.forEach((k,v)->System.out.println(k+"-"+v));
        System.out.println("----------------------------");
       
        //2.Group By with Function and Collector 
        Map<String, Integer> productByPriceSum = productsList.stream()
                .collect(Collectors.groupingBy(Products::getName,Collectors.summingInt(Products::getPrice)));
	
        productByPriceSum.forEach((k,v)->System.out.println(k+"-"+v));
        System.out.println("----------------------------");
        
        
        Map<Integer,List<String>> productBypriceNames = productsList.stream()
                 .collect(Collectors.groupingBy(
                		 Products::getPrice,
                		 Collectors.mapping(Products::getName, Collectors.toList())));
       
        productBypriceNames.forEach((k,v)->System.out.println(k+"-"+v));
        System.out.println("----------------------------");
        //use set to 
        Map<Integer,Set<String>> productBypriceNamess = productsList.stream()
                .collect(Collectors.groupingBy(
               		 Products::getPrice,
               		 Collectors.mapping(Products::getName, Collectors.toSet())));
      
       productBypriceNamess.forEach((k,v)->System.out.println(k+"-"+v));
       
       System.out.println("----------------------------");
       //3.Group By with Function, Supplier and Collector 
	   //print prices in sorted order,use TreeMap as supplier
       Map<Integer,Set<String>> productBypriceNamesss = productsList.stream()
               .collect(Collectors.groupingBy(
              		 Products::getPrice,
              		 TreeMap::new,
              		 Collectors.mapping(Products::getName, Collectors.toSet())));
     
      productBypriceNamesss.forEach((k,v)->System.out.println(k+"-"+v));
      
      System.out.println("----------------------------");
      //print data in insertion order,use LinkedHashMap as supplier
      
      Map<Integer,Set<String>> productBypriceNamessss = productsList.stream()
              .collect(Collectors.groupingBy(
             		 Products::getPrice,
             		 LinkedHashMap::new,
             		 Collectors.mapping(Products::getName, Collectors.toSet())));
    
     productBypriceNamessss.forEach((k,v)->System.out.println(k+"-"+v));
     
     System.out.println("----------------------------");
     
   ///////////////////////////////////////////////////////////////////////////////////////
     
     //Below Example to show multiple fields for group by
     
     Map<Integer,Map<String,Long>> productByPriceThenByName = 
    		 productsList.stream()
                          .collect(
                        		  Collectors.groupingBy(Products::getPrice,
            		                   Collectors.groupingBy(Products::getName,
            		                		   Collectors.counting())));
   
     productByPriceThenByName.forEach((k,v)->System.out.println(k+"-"+v));
    
    System.out.println("----------------------------");
    
  //Below Example to show multiple fields for group by if feilds are so many then better 
    // to use Apache commons Pair.of
   // Map<Pair<String, String>, Long>
   /* Map<Pair<String, String>,Long> productByPriceThenByNameUsingCommonsLib = 
   		 productsList.stream()
                         .collect(
                       		  Collectors.groupingBy(e -> Pair.of(e.getDesignation(), e.getGender()),
           		                		   Collectors.counting()));
  
    productByPriceThenByName.forEach((k,v)->System.out.println(k+"-"+v));
   */
   System.out.println("----------------------------");
	}
}
