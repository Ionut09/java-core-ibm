package com.ibm.java._5_oop;

public class Upb {
	
	public static void main(String[] args) {
		Student vasile = new Student("1234", "Vasile", 20, "FILS");
		//		System.out.println(vasile.id);
		//		System.out.println(vasile.name);
		//		System.out.println(vasile.age);
		//		System.out.println(vasile.faculty);
		System.out.println(vasile.getId());
		System.out.println(vasile.getName());
		System.out.println(vasile.getAge());
		System.out.println(vasile.getFaculty());
		
		
		vasile = new Student();
		//		vasile = andrei;
		vasile = null; // vechiul obiect va fi eligibil pentru GC
		System.gc(); //hint pentru GC, dar nu inseamna ca e garantat ca va rula
		
	}
}
