package com.javaconcept.java8.stream.infinite;

import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InfiniteStreamTest {

	public static void main(String[] args) {
	Supplier<UUID>	randomUUIDs = UUID::randomUUID;
	Stream<UUID> generate = Stream.generate(randomUUIDs);
	
	List<UUID> collect = generate.skip(10).limit(10).collect(Collectors.toList());
		
	collect.forEach(System.out::println);
	
	System.out.println("-----------------------------");
	
	Stream<Integer> iterate = Stream.iterate(0, i->i+1);
	iterate.limit(10).forEach(System.out::println);
	System.out.println("-----------------------------");
	
	//IntStream stream = IntStream.iterate(0, i -> i >= 0, i -> i + 2);

	//IntStream.iterate(0, i-> i < 10,  i -> i + 2).forEach(System.out::println);
	//IntStream.range(6, 10).forEach(System.out::println); 
	  
    // Displaying the elements in range 
    // including the lower bound but 
    // excluding the upper bound 
    //stream.forEach(System.out::println); 
} 
	

}
