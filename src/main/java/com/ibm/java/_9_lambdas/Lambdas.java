package com.ibm.java._9_lambdas;

import java.util.List;

public class Lambdas {
	
	public static void main(String[] args) {
		List<String> list = List.of("one", "two", "three"); //unmodifiable
		
		ConsumerPrinter consumerPrinter = new ConsumerPrinter();
		//pre-Java8
		list.forEach(consumerPrinter);
		
		list.forEach((String element) -> {System.out.println(element);});
		
		list.forEach(e -> System.out.println(e));//type inference
//		list.forEach(System.out::println);
	}
}
