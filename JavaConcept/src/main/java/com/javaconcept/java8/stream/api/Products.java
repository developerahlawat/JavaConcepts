package com.javaconcept.java8.stream.api;

public class Products{  
    int id;  
    String name;  
    Integer price;  
    public Products(int id, String name, Integer price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
          
    public int getId() {  
        return id;  
    }  
    public String getName() {  
        return name;  
    }  
    public Integer getPrice() {  
        return price;  
    }

	@Override
	public String toString() {
		return "Products [id=" + id + ", name=" + name + ", price=" + price + "]";
	} 
    
}  