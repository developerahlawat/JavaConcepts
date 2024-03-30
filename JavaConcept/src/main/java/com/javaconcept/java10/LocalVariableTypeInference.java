package com.javaconcept.java10;

import java.util.List;

public class LocalVariableTypeInference {
	
	public static void main(String[] args) {
		
		var blogName = "howtodoinjava.com";
		var dataList = List.of(1,2,3,4,5);
		
    
	for ( var object : dataList){
	    System.out.println( object );
	}
	 
	for ( var i = 0 ; i < dataList.size(); i++ ){
	    System.out.println( dataList.get(i) );
	}
	
	/*public class Application {
	     
	    var firstName;    //Not allowed as class fields
	         
	    public Application(var param){    //Not allowed as parameter 
	  
	    }
	 
	    try{
	         
	    } catch(var ex){    //Not allowed as catch formal 
	 
	    }
	 
	    public var demoMethod(){  //Not allowed in method return type
	        return null;
	    }
	 
	    public Integer demoMethod2( var input ){  //Not allowed in method parameters
	        return null;
	    }*/
	}

}
