package com.ibm.java._6_strings;

public class BalancedBrackets {
	
	String[] strings = {
		"()",
		"[](){}", // -> is balanced
		"[()]", //->"[]" ->"" -> is balanced
		"{[()]}", // -> is balanced
		"([{{[(())]}}])", //-> is balanced
		"abc[](){}", // -> is balanced
		"{{[]()}}}}",  // is not balanced
		"{[(])}", //-> "{[(])}" -> is not balanced
		"sbjsjkkjs86w8268  ",
		null
	};
	
	public static void main(String[] args) {
		//		while, inlocuim (replace("()", "") perechile de paranteze cat timp mai gasim perechi (contains("()") || contains("[]") || ...)
		
		BalancedBrackets brackets = new BalancedBrackets();
		for (String input : brackets.strings) {
			String output = "String: " + input + (brackets.isBalanced(input) ? " is balanced" : " is not balanced");
			//			if (brackets.isBalanced(input)) {
			//				output += " is balanced";
			//			} else {
			//				output += " is not balanced";
			//			}
			System.out.println(output);
		}
	}
	
	/**
	 * String input may only contain alphabetic characters and parantheses "[](){}", // -> is balanced
	 */
	private boolean isBalanced(String input) {
		if (input == null || input.isEmpty() || input.length() == 1) {
			return false;
		}
		
		input = input.trim();
		while (input.contains("()")
			       || input.contains("[]")
			       || input.contains("{}")) {
			input = input.replace("()", "");
			input = input.replace("[]", "");
			input = input.replace("{}", "");
		}
		
		input = input.replaceAll("[a-zA-Z0-9]+", "");
		
		return input.isEmpty();
		//		if (input.isEmpty()) {
		//			return true;
		//		} else {
		//			return false;
		//		}
	}
}
