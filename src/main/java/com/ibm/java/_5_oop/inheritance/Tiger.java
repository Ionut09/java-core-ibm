package com.ibm.java._5_oop.inheritance;

public class Tiger extends Animal implements Carnivore {
	
	public Tiger(int height, int weight) {
		super(height, weight);
	}
	
	@Override
	public boolean lovesMeat() {
		return true;
	}
}
