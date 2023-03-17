package com.ibm.java._4_methods;

public class MethodsExamples {
	
	public static void main(String[] args) {
		sum(1, 2, 3);
		sum(1);
		sum(3);
		int[] uselessArray = new int[0];
		sum1(new int[]{1, 2, 3});
		sum1(new int[]{1});
		sum1(uselessArray);
	}
	
	private static int sum(int first) {
		return first;
	}
	
	private static int sum(int... args) {
		int sum = 0;
		for (int arg : args) {
			sum += arg;
		}
		return sum;
		//		System.out.println(sum); //Unreachable statement
	}

	private static int sum1(int[] args) {
		int sum = 0;
		for (int arg : args) {
			sum += arg;
		}
		return sum;
		//		System.out.println(sum); //Unreachable statement
	}
	
}
