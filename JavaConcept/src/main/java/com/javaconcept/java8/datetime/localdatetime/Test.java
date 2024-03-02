package com.javaconcept.java8.datetime.localdatetime;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

	public static void main(String[] args) {
		String strMain ="2020-08-13 19:11:52.353::Swathi Singh::maintain social distance#2020-08-13 19:11:40.444::Swathi Singh::maintain social distance#2020-08-13 19:10:54.844::Swathi Singh::maintain social distance#2020-08-13 19:06:41.301::Swathi Singh::maintain social distance"; 
		 strMain = strMain.replaceAll("\\::", "#");		
		String[] arrSplit = strMain.split("\\#");
		    for (int i=0; i < arrSplit.length; ){
		    	StringBuilder p_time =new StringBuilder();
				StringBuilder p_username =new StringBuilder();
				StringBuilder p_msg =new StringBuilder();
				//if(i)
				System.out.print(i);
		      System.out.println(arrSplit[i]);
i=i+3;
//     	      System.out.println(p_time);
//		      System.out.println(p_username);
//		      System.out.println(p_msg);
		  
		    }
		   
		    
//		    String content = "2020-08-13 19:11:52.353::Swathi Singh::maintain social distance#2020-08-13 19:11:40.444::Swathi Singh::maintain social distance#2020-08-13 19:10:54.844::Swathi Singh::maintain social distance#2020-08-13 19:06:41.301::Swathi Singh::maintain social distance";
//		    Pattern pattern = Pattern.compile("[a-g](?:\\(\\d+\\))?");
//		    List<String> res = new ArrayList<>();
//		    Matcher matcher = pattern.matcher(content);
//		    while (matcher.find()){
//		        res.add(matcher.group(0)); 
//		    } 
//		    System.out.println(res);
//		    
//		    String ugly = "john - & + $ ? . @ boy";
//		    String words = ugly.replaceAll("[^\\w\\s]", "");
//		    System.out.println(words);
//		  
	
	
	
//	 String s = " ;String; String; String; String, String; String;;String;String; String; String; ;String;String;String;String"; //String[] strs = s.split("[,\\s\\;]"); 
//     String[] strs = s.split("[,\\;]");
//     System.out.println("Substrings length:" + strs.length);
//     for (int i = 0; i < strs.length; i++) {
//         System.out.println("Str[" + i + "]:" + strs[i]);
//     }
 }

	}
