package com.javaconcept.java12;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TeeingCollector {

	public static void main(String[] args) {
		
		double mean = Stream.of(1, 2, 3, 4, 5)
                .collect(Collectors.teeing(
                        summingDouble(i -> i),
                        counting(),
                        (sum, n) -> sum / n));

        System.out.println(mean);
		
		 List<Employee> employeeList = Arrays.asList(
                 new Employee(1, "A", 100),
                 new Employee(2, "B", 200),
                 new Employee(3, "C", 300),
                 new Employee(4, "D", 400)); 
		 
                //Use teeing() to find max and min salaried employees
         HashMap<String, Employee> result = employeeList.stream().collect( 
             Collectors.teeing(
             Collectors.maxBy(Comparator.comparing(Employee::getSalary)),
             Collectors.minBy(Comparator.comparing(Employee::getSalary)),
             (e1, e2) -> {
                 HashMap<String, Employee> map = new HashMap();
                 map.put("MAX", e1.get());
                 map.put("MIN", e2.get());
                 return map;
             }
     ));
         
         // Use teeing() to filter items and count them
         HashMap<String, Object> result1 = employeeList.stream().collect( 
                 Collectors.teeing(
                         Collectors.filtering(e -> e.getSalary() > 200, Collectors.toList()),
                         Collectors.filtering(e -> e.getSalary() > 200, Collectors.counting()),
                         (list, count) -> {
                             HashMap<String, Object> map = new HashMap();
                             map.put("list", list);
                             map.put("count", count);
                             return map;
                         }
                 ));

System.out.println(result);
System.out.println("-----------------------");
System.out.println(result1);
}
}



class Employee 
{
    private long id;
    private String name;
    private double salary;
 
    public Employee(long id, String name, double salary) {
        super();
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
 
    
 
    public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}



	@Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }
}
