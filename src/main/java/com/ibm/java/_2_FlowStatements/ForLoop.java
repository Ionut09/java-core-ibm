package com.ibm.java._2_FlowStatements;

import java.util.Scanner;

public class ForLoop {
	
	public static void main(String[] args) {
		//get prime numbers from a range
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter start: ");
		int start = sc.nextInt(); //execution stops, waiting for input from keyboard
		System.out.println("Enter end: ");
		int end = sc.nextInt();
		
		for(int i = start; i<= end; ++i){
			if(isPrime(i)){
				System.out.println("Number " + i + " is prime");
			}
		}
	}
	
	static boolean isPrime(int n) {
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				System.out.println("Number " + n + " is not prime");
				return false;
			}
		}
		return true;
	}
}
