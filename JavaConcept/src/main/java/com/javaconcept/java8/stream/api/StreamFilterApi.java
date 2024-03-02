package com.javaconcept.java8.stream.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StreamFilterApi {  
 
    public static void main(String[] args) {  
        List<Products> productsList = new ArrayList<Products>();  
        //Adding Products  
        productsList.add(new Products(1,"HP Laptop",25000));  
        productsList.add(new Products(2,"Dell Laptop",30000));  
        productsList.add(new Products(3,"Lenevo Laptop",28000));  
        productsList.add(new Products(4,"Sony Laptop",28000));  
        productsList.add(new Products(5,"Apple Laptop",90000));  
       
        
//        List<Float> productPriceList = new ArrayList<Float>();  
//        for(Product product: productsList){  
//              
//            // filtering data of list                              // filtering data without using stream
//            if(product.price<30000){  
//                productPriceList.add(product.price);    // adding price to a productPriceList  
//            }  
//        } 
//        System.out.println(productPriceList);   // displaying data  
        
        
		
		  List<Integer> productPriceList =productsList.stream()
				                           .filter(p ->p.price < 30000)// filtering data // filtering data using stream //
		                                  .map(p->p.price) // fetching price // 
		                                  .collect(Collectors.toList()); // collecting as list // 
		  productPriceList.forEach(System.out::println); 
        
		  
		  
		  System.out.println("----------------------------------");
        // This is more compact approach for filtering data   
           productsList.stream()
                         .filter(product -> product.price == 30000)
                         .forEach(product -> System.out.println(product.name));
           
           
       
           System.out.println("----------------------------------");
           // Stream iterrating example
           
           Stream.iterate(1,element->element+1)
   		.filter(element->element%5==0)
   		.limit(5)
   		.forEach(System.out::println);
           
           
           System.out.println("----------------------------------");
           // by using reduce() Method in Collection to summ data
       
           Integer totalPrice = productsList.stream()  
               .map(product->product.price)  
               .reduce(0,(sum, price)->sum+price);   // accumulating price  
           System.out.println(totalPrice);  
  
   
   
   
       // More precise code   
        float totalPrice2 = productsList.stream()  
               .map(product->product.price)  
               .reduce(0,Integer::sum);   // accumulating price, by referring method of Float class  
        System.out.println(totalPrice2);  
        
   
        System.out.println("----------------------------------");
         //Sum by using Collectors Methods
        
        // Using Collectors's method to sum the prices.  
        double totalPrice3 = productsList.stream()  
                        .collect(Collectors.summingDouble(product->product.price));  
        System.out.println(totalPrice3);  
        
        System.out.println("----------------------------------");
        // Find Max and Min Product Price
       
        // max() method to get max Product price   
        Products productA = productsList.stream()  
                        .max((product1, product2)->   
                        product1.price > product2.price ? 1: -1).get();  
          
        System.out.println(productA.price);  
        
        
        // min() method to get min Product price  
        Products productB = productsList.stream()  
                .max((product1, product2)->   
                product1.price < product2.price ? 1: -1).get();  
        System.out.println(productB.price);  
          
        System.out.println("----------------------------------");
        //count() Method in Collection
        
        // count number of products based on the filter  
        long count = productsList.stream()  
                    .filter(product->product.price<30000)  
                    .count();  
        System.out.println(count);  
        
        System.out.println("----------------------------------");
        //Convert List into Set
        
        // Converting product List into Set  
        Set<Integer> productPriceList5 = productsList.stream()  
            .filter(product->product.price < 30000)   // filter product on the base of price  
            .map(product->product.price)  
            .collect(Collectors.toSet());   // collect it as Set(remove duplicate elements)  
        System.out.println(productPriceList5);  
        
        System.out.println("----------------------------------"); 
        // Convert List into Map
        
        // Converting Product List into a Map  
        Map<Integer,String> productPriceMap =   
            productsList.stream()  
                        .collect(Collectors.toMap(p->p.id, p->p.name));  
              
        System.out.println(productPriceMap);  
        
        
        System.out.println("----------------------------------"); 
        
       // Method Reference in stream
        List<Integer> productPriceList6 =   
                productsList.stream()  
                            .filter(p -> p.price > 30000) // filtering data  
                            .map(Products::getPrice)         // fetching price by referring getPrice method  
                            .collect(Collectors.toList());  // collecting as list  
        
        System.out.println(productPriceList6);  
    }  
    
}  