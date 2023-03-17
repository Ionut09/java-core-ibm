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
		"{[(])}" //-> "{[(])}" -> is not balanced
	};
	
	public static void main(String[] args) {
//		while, inlocuim (replace("()", "") perechile de paranteze cat timp mai gasim perechi (contains("()") || contains("[]") || ...)
	}
}
