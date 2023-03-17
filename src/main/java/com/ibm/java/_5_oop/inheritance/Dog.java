package com.ibm.java._5_oop.inheritance;

public class Dog extends Animal {
	
	private String breed;
	
	public Dog(String breed, int height, int weight) {
		//		super();  --> asta primim default
		super(height, weight);
		this.breed = breed;
	}
	
	public String getBreed() {
		return breed;
	}
	
	public void eat() {
		System.out.println("Dog of breed: " + breed + ", eats Pedigree!!");
	}
}
