package com.ibm.java._3_arrays;

import java.util.Arrays;

public class ArrayExample {
	
	public static void main(String[] args) {
		int[] input = {3, 6, 22, 99, 11, 12, 21};
		getEvenNumbersFromArray(input);
		
		int i = 5;
		//		System.out.println(i++); //5
		//		System.out.println(i);   //6
		System.out.println(++i); //6
		System.out.println(i);   //6
	}
	
	public static void getEvenNumbersFromArray(int[] input) {
		int[] evenElements = new int[input.length];
		int i = 0;
		for (int element : input) {
			if (element % 2 == 0) {
				evenElements[i] = element;
				i++;
			}
		}
		System.out.println("evenElements -> " + Arrays.toString(evenElements));
		
		evenElements = new int[input.length]; //[0, 0, 0, 0, 0, 0, 0]
		for (int j = 0; j < input.length; ++j) {
			if (input[j] % 2 == 0) {
				evenElements[j] = input[j];
			}
		}
		System.out.println("evenElements -> " + Arrays.toString(evenElements));
	}
}
