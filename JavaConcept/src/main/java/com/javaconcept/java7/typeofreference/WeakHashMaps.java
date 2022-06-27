package com.javaconcept.java7.typeofreference;


import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;


public class WeakHashMaps {

public static void main(String[] args) {
		
		Employees obj1 = new Employees(1009, "Sam", 90000.00, "sam@infotech.com");
		Employees obj2 = new Employees(2009, "Ambay", 30000.00, "martin@infotech.com");
		Employees obj3 = new Employees(3009, "Joya", 50000.00, "joya@infotech.com");
		
		Department d1 = new Department(10001, "IT", "Boston");
		Department d2 = new Department(10002, "Finance", "Chennai");
		
		// Map<Employees, Department> empDeptMap = new HashMap<>();
		Map<Employees, Department> empDeptMap = new WeakHashMap<>();
		
		empDeptMap.put(obj1, d1);
		empDeptMap.put(obj2, d1);
		
		empDeptMap.put(obj3, d2);
		
		//empDeptMap.put(null, d1);
		//empDeptMap.put(e6, null);
		
		obj1 = null;
		obj2 = null;
		
		System.gc();
		
		Set<Entry<Employees, Department>> entrySet = empDeptMap.entrySet();
		Iterator<Entry<Employees, Department>> iterator = entrySet.iterator();
		while (iterator.hasNext()) {
			Map.Entry<Employees, Department> entry = (Map.Entry<Employees,Department>) iterator.next();
			Employees Employees = entry.getKey();
			Department department = entry.getValue();
			System.out.println(Employees);
			System.out.println(department);
			//empDeptMap.put(new Employees(5010, "Abrahim", 930000.00, "abrahim@infotech.com"), d2);
		}
	}
}