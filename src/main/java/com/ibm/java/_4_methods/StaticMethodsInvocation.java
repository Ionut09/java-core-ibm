package com.ibm.java._4_methods;

import com.ibm.java._3_arrays.ArrayExample;
import java.util.Collections;
import java.util.List;

public class StaticMethodsInvocation {
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 45, 6};
		ArrayExample.getEvenNumbersFromArray(arr); //e static-aaaa
//		Collections.sort(List.of(1,2,3,4));
		System.out.println("ceva"); //println e ne-static-aaaa
	}
}
