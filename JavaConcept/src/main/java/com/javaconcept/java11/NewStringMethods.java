package com.javaconcept.java11;

import java.util.stream.Collectors;

public class NewStringMethods {
	
	public static void main(String args[]) 
    { 
        String str1 = ""; 
        System.out.println(str1.isBlank()); 
  
        String str2 = "GeeksForGeeks"; 
        System.out.println(str2.isBlank()); 
     
        System.out.println("<---------------------------------->");
        
        String str3 = "Geeks\nFor\nGeeks"; 
        System.out.println(str3 
                               .lines() 
                               .collect( 
                                   Collectors.toList())); 
        
        System.out.println("<---------------------------------->");

        String str = "GeeksForGeeks"; 
        System.out.println(str.repeat(4)); 
        
        System.out.println("<---------------------------------->");
        
        String str5 = " GeeksForGeeks"; 
        System.out.println(str5.stripLeading());
        
        System.out.println("<---------------------------------->");
        
        String str6 = "GeeksForGeeks "; 
        System.out.print(str6.stripTrailing()); 
        
        System.out.println("<---------------------------------->");
        
        String str7 = " GeeksForGeeks "; 
        System.out.println(str7.strip()); 
    } 

}
