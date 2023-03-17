package com.ibm.java._5_oop.inheritance;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Zoo {
	
	public static void main(String[] args) {
		Dog rex = new Dog("German sheppard", 80, 40);
		System.out.println("rex.getHeight() = " + rex.getHeight());
		System.out.println("rex.getWeight() = " + rex.getWeight());
		System.out.println("rex.getBreed() = " + rex.getBreed());
		rex.eat();
		rex.sleep();
		
		Lion lion = new Lion(100, 200);
		System.out.println("lion.getHeight() = " + lion.getHeight());
		System.out.println("lion.getWeight() = " + lion.getWeight());
		lion.hunt();
		lion.sleep();
		lion.eat();
		
		//polymorphism
		System.out.println("\n\npolymorphism ===========================");
		Animal a = new Animal(120, 200);
		a = lion; //many forms
		a = rex;
		//codul client
		a.eat();
		
		Animal dog = new Dog("Saint Bernard", 90, 100);
		System.out.println("----");
		polimorphicCall(rex);
		polimorphicCall(lion);
		polimorphicCall(new Animal(800, 2000));
		
		Carnivore carnivore = new Tiger(110, 250);
		System.out.println("Tiger loves meat");
		System.out.println(carnivore.lovesMeat());
		
		System.out.println("Lion loves meat");
		carnivore = new Lion(100, 200);
		System.out.println(carnivore.lovesMeat());
		
		List<Integer> list = new ArrayList<>();
		list = new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.remove(2);
		System.out.println(list);
		
	}
	
	private static void polimorphicCall(Animal a) {
		a.eat();
	}
}
