package com.ibm.java._6_strings;

public class StringImmutabllity {
	
	public static void main(String[] args) {
		String str = "abcdef";
		String upperStr = str.toUpperCase();
		System.out.println(str); //ramane neschimbat pt ca este immutabil
		System.out.println(upperStr);
		
		upperStr = upperStr.substring(2, 5); //practica comuna
		System.out.println(upperStr);
		
	}
}
