package com.ibm.java._5_oop.inheritance;

public interface Carnivore {
	
	//este public static final in mod implicit
	boolean meatLover = true;
	
	//este public abstract in mod implicit
	boolean lovesMeat();
	
	public default void defaultMethod(){
		helperMethod();
		System.out.println("Inside default method");
	}
	
	public static void staticMethod(){
		System.out.println("Inside static method");
	}
	
	private void helperMethod(){
		System.out.println("Inside helper method");
	}
}
