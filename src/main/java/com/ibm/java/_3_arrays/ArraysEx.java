package com.ibm.java._3_arrays;

import java.util.Arrays;

public class ArraysEx {
	
	public static void main(String[] args) {
		
		int[] arr = new int[3];
		arr[0] = 5;
		arr[1] = 6;
		arr[2] = 7;
		System.out.println(Arrays.toString(arr));
		
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = i * i;
		}
		
		String arrayAsString = Arrays.toString(arr);
		System.out.println(arrayAsString);
		for (int tempVar : arr) {
			System.out.print(tempVar + " ");
		}
		
		String[][] matrix = new String[][]
			                    {
				                    {"1", "2"},
				                    {"3", "4"}
			                    };
		
		
	}
}
