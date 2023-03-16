package com.ibm.java._2_FlowStatements;

public class WhileLoop {
	
	public static void main(String[] args) {
		isPalindrom(12345);
		isPalindrom(62326);
		isPalindrom(271627177);
		isPalindrom(0);
	}
	
	/**
	 * 1221  -> true 12212 -> false 62326 -> true
	 *
	 * @param input
	 */
	static void isPalindrom(int input) {
		//		1221 -> 1 (1221 % 10) 1221 / 10==> 122
		//		122 -> 2 (122 % 10) 1221 / 10 ==> 12
		int copy = input;
		int reversed = 0;
		while (input > 0) {
			int digit = input % 10;
			input = input / 10;
			reversed = reversed * 10 + digit;
		}
		if (copy == reversed) {
			System.out.println(copy + " is palindrom");
		} else {
			System.out.println(copy + " is not palindrom");
		}
	}
}
