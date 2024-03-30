package com.javaconcept.java13;

public class EnhancedSwitch{  
	   
	    public static void main(String ar[])   
	{  
	        int choice = 2;  
	        switch (choice) {  
	        case 1:  
	            System.out.println(choice);  
	            break;  
	        case 2:  
	            System.out.println(choice);  
	            break;  
	        case 3:  
	            System.out.println(choice);  
	            break;  
	        default:  
	            System.out.println("integer is greater than 3");  
	        } 
	        
	        // from java 13 onwards - multi-label case statements  
	        switch (choice) {  
	        case 1, 2, 3:  
	            System.out.println(choice);  
	            break;  
	        default:  
	            System.out.println("integer is greater than 3");  
	        }  
	       
	        
	        // switch expressions, use yield to return, in Java 12 it was break  
	        int x = switch (choice) {  
	        case 1, 2, 3:  
	            yield choice;  
	        default:  
	            yield -1;  
	        };  
	        System.out.println("x = " + x);  
	    }  
	    
//	    enum Day {  
//	        SUN, MON, TUE  
//	    };  
//	   
//	    
//	    public String getDay(Day d) {  
//	        String day = switch (d) {  
//	        case SUN -> "Sunday";  
//	        case MON -> "Monday";  
//	        case TUE -> "Tuesday";  
//	        };  
//	        return day;  
//	    }  
	 

}
