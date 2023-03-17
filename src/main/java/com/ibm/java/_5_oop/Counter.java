package com.ibm.java._5_oop;

public class Counter {
	
	static int staticContor; //il referentiem cu numele clasei
	//de instance (instance variables)
	int instanceContor;      //il referentiem cu un obiect
	
	public static void main(String[] args) {
		Counter.staticContor++;
		Counter.staticContor++;
		Counter.staticContor++;
		Counter o1 = new Counter();
		o1.staticContor++;
		o1.instanceContor += 10;
//		Counter.instanceContor += 10; //Non-static field 'instanceContor' cannot be referenced from a static context
		
		System.out.println("o1.staticContor = " + o1.staticContor);
		System.out.println("o1.instanceContor = " + o1.instanceContor);
		Counter o2 = new Counter();
		o2.instanceContor -= 100;
		System.out.println("o2.staticContor = " + o2.staticContor);
		System.out.println("o2.instanceContor = " + o2.instanceContor);
		Counter o3 = new Counter();
		System.out.println("o3.staticContor = " + o3.staticContor);
		System.out.println("o3.instanceContor = " + o3.instanceContor);
		
	}
}
