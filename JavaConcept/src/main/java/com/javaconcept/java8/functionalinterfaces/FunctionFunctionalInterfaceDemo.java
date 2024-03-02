package com.javaconcept.java8.functionalinterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionFunctionalInterfaceDemo {

	public static void main(String[] args) {

		List<Students> list = new ArrayList<>();
		
		list.add(new Students("Martin", 23));
		list.add(new Students("Andrew", 20));
		list.add(new Students("Sean", 21));
		
		for (Students student : list) {
			System.out.println(student.customShow(s->s.getName()+"\t"+s.getAge()));
		}
		
		Function<Students, String> styleOne = s->{
			String result ="Name :"+s.getName()+" and Age:"+s.getAge();
			return result;
		};
		
		System.out.println("-------------------------------------------------");
		for (Students student : list) {
			System.out.println(student.customShow(styleOne));
		}
		
		Function<Students, String> styleTwo = s->"Name :"+s.getName()+" and Age:"+s.getAge();
		
		System.out.println("-------------------------------------------------");
		for (Students student : list) {
			System.out.println(student.customShow(styleTwo));
		}
	}

}
