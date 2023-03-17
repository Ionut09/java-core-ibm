package com.ibm.java._5_oop;

public class Encapsulation {
	
	public static void main(String[] args) {
		int age = 5;
		age = 200;
		
		Student ion = new Student("1234", "Ion", 20, "FILS");
//		ion.age = -10; --> no longer accessible
//		System.out.println(ion.age);
		ion.setAge(-10);
		ion.setAge(21);
		System.out.println(ion.getAge());
	}
}
