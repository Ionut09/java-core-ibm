package com.ibm.java._9_lambdas;

import java.util.function.Consumer;

public class ConsumerPrinter implements Consumer<String> {
	
	@Override
	public void accept(String s) {
		System.out.println(s);
	}
}
