package com.ibm.java._5_oop.inheritance;

public class Lion extends Animal implements Carnivore {
	
	public Lion(int height, int weight) {
		super(height, weight);
	}
	
	public void eat() {
		hunt();
		System.out.println("Lion enjoys his pray!");
	}
	
	public void hunt() {
		System.out.println("Lion goes for hunt!!!");
	}
	
	@Override
	public boolean lovesMeat() {
		defaultMethod();
		return Carnivore.meatLover;
	}
}
