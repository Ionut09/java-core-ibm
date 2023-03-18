package com.ibm.java._5_oop.inheritance;

public class Animal extends Object{
	private int height;
	private int weight;
	
//	public Animal(){}
	
	public Animal(int height, int weight) {
		this.height = height;
		this.weight = weight;
	}
	
	public void eat(){
		System.out.println("Animal eating...!!!");
	}
	
	public void sleep(){
		System.out.println("Animal snorring...!!!");
	}
	
	public int getHeight() {
		return height;
	}
	
	public int getWeight() {
		return weight;
	}
}
