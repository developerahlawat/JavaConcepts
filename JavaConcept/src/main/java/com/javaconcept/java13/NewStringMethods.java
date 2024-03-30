package com.javaconcept.java13;

public class NewStringMethods {
	  public static void main(String[] args)   
	    {  
	        String output = """  
	                Name: %s  
	                Phone: %d  
	                Salary: $%.2f  
	                """.formatted("Peter", 123456789, 2000.5555);  
	        System.out.println(output);  
	        
	        System.out.println("-----------------------");
	        
			
	        String htmlTextBlock = "<html>   \n"+  
	                                    "\t<body>\t\t \n"+  
	                                        "\t\t<p>Hello</p>  \t \n"+  
	                                    "\t</body> \n"+  
	                                "</html>";  
	        System.out.println(htmlTextBlock.replace(" ", "*"));  
	        System.out.println(htmlTextBlock.stripIndent().replace(" ", "*"));  
	       
	        System.out.println("-----------------------");
	        
			
	        String str1 = "Hi\t\nHello' \" /u0022 Pankaj\r";  
	        System.out.println(str1);  
	        System.out.println(str1.translateEscapes());  
	          
	    }  
	  

}
