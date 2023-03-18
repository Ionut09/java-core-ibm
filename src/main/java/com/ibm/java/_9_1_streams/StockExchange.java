package com.ibm.java._9_1_streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StockExchange {
	
	static Trader raoul = new Trader("Raoul", "Cambridge");
	static Trader mario = new Trader("Mario", "Milan");
	static Trader alan = new Trader("Alan", "Oxford");
	static Trader brian = new Trader("Brian", "London");
	
	static List<Transaction> transactions = List.of(
		new Transaction(brian, 2011, 300),
		new Transaction(raoul, 2012, 1000),
		new Transaction(raoul, 2011, 400),
		new Transaction(mario, 2012, 710),
		new Transaction(mario, 2012, 700),
		new Transaction(new Trader("raoul", "Cambridge"), 2012, 700),
		new Transaction(alan, 2013, 950)
	);
	
	/**
	 * 1. Find all transactions in the year 2011 and sort them by value (small to high).
	 * 2. What are all the unique cities where the traders work?
	 * 3. Find all traders from Cambridge and sort them by name.
	 * 4. Return a string of all traders’ names sorted alphabetically.
	 * 5. Are any traders based in Milan?
	 * 6. Print all transactions’ values from the traders living in Cambridge.
	 * 7. What’s the highest value of all the transactions?
	 * 8. Find the transaction with the smallest value.
	 */
	
	public static void main(String[] args) {
		System.out.println(ex1());
		System.out.println(ex4());
	}
	
	private static List<Transaction> ex1(){
		return transactions.stream() //sequence of elements
		            //intermediara
		            .filter((Transaction t) -> t.getYear() == 2011)
//					.sorted((t1, t2) -> t1.getValue() - t2.getValue())
                    //intermediara
					.sorted(Comparator.comparing((Transaction t)-> t.getValue())) //creaza un Comparator ce va folosi drept cheie de comparatie, valoarea Transaction
//					.sorted(Comparator.comparing((Transaction t)-> t.getValue()).reversed())
		             //terminala
					.collect(Collectors.toList());
	}
	
	// * 4. Return a string of all traders’ names sorted alphabetically.
	private static String ex4(){
		return transactions.stream()
		                   .map((Transaction t) -> t.getTrader())
		                   .map((Trader t) -> t.getName())
		                   .distinct()
		                   .sorted()
		                   //terminala
		                   .collect(Collectors.joining(","));
	}
	
	
}
