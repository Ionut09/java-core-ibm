package com.ibm.java._5_oop;

public class Student {
	
	private String id;
	private String name;
	private int age;
	private String faculty;

	public Student() {}
	
	public Student(String id, String name, int age, String faculty) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.faculty = faculty;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if (age < 0 || age > 120) {
			//			throw new IllegalArgumentException("Wrong age value: " + age + " !");
			System.out.println("Wrong age value: " + age + " !");
			return;
		}
		this.age = age;
	}
	
	public String getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getFaculty() {
		return faculty;
	}
}
