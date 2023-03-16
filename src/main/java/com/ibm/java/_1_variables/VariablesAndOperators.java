package com.ibm.java._1_variables;

//com.ibm.java._1_variables.VariablesAndOperators --> fully qualified name of the class
public class VariablesAndOperators {
	
	public static void main(String[] args) {
		byte a = 5;
		short b = 6;
		char cDefinedExplicitChar = 'a';
		char cDefinedThroughCodePoint = 97;
		int c = 97;
		System.out.println("cDefinedExplicitChar = " + cDefinedExplicitChar);
		System.out.println("cDefinedThroughCodePoint = " + cDefinedThroughCodePoint);
		
		//		cDefinedThroughCodePoint.sout ->   System.out.println(cDefinedExplicitChar);
		//		cDefinedThroughCodePoint.soutv ->  System.out.println("cDefinedThroughCodePoint = " + cDefinedThroughCodePoint);
		
		System.out.println('a' + 1);          // 98
		System.out.println((char) ('a' + 1));  // b
		
		/*
			Print all capital letters from alphabet.
		 */
		
		char start = 'A';
		//		int count = 'Z' - 'A';
		for (int i = 0; i < 26; i++) {
			System.out.print((char) (start + i));
			if (i == 25) { //format code -> Ctrl + Alt + L
				break;
			}
			System.out.print(", ");
		}
		
		long d = 25;
		short s = (short) d;
		
		d = 123456787333L;
		
		float f = 3.5f;//F
		double dd = 3.5;
		dd = f;
		
		System.out.println(8 * 2 + " just a string "); //16 just a string
		System.out.println(" just a string " + 8 * 2); //just a string 16
		System.out.println(" just a string " + (8 - 2)); //just a string 6
		System.out.println("String: " + 'B'); // String: B
		System.out.println("String: " + 'B' + 1); // String: B1
		System.out.println("String: " + ('B' + 1)); // String: 67
		System.out.println("String: " + (char) ('B' + 1)); // String: C
		
		boolean bool = true; //1
		
		System.out.println(!bool); // false -> 0
		// dd = 3.5;
		System.out.println(bool && (dd > 3)); // true
		System.out.println(bool || (dd > 3)); // true
		
		//c = 97
		System.out.println(bool || (c++ < 100)); //true --> nu va evalua membrul drept: (c++ < 100)
		System.out.println(c);
		
		String str = null;
		if ((str != null) && (str.length() > 10)) {
			System.out.println("My string: " + str + " is longer than 10 chars");
		} else {
			System.out.println("My string: " + str + " is not longer than 10 chars");
		}
		
		int i = 5;
		i = i + 2;
		i += 2;
		
		//false
		boolean isEven = i % 2 == 0;
		boolean isOdd = i % 2 != 0; //!isEven
		if (isEven) { //e mai bun dpdv readability, folosim Ctrl+Alt+V pt a introduce o variabila
			System.out.println(i + "is even");
		} else {
			System.out.println(i + "is odd");
		}
		
		//		if (i % 2 == 0) {
		//			System.out.println(i + "is even");
		//		} else {
		//			System.out.println(i + "is odd");
		//		}
		int anInt = (i = 2); // i=2, anInt=2
		System.out.println("anInt = " + anInt);
		
		double root = Math.sqrt(16); //4
		double pow = Math.pow(2, 4); //16
		//		Math.log()
		double log = Math.log10(1000);//3
		
		//		byte  -> Byte
		//		short -> Short
		//		int -> Integer
		//		...
		//		long  -> Long
		//		double -> Double
		
		//conversion String <==> primitives
		String num = "10";
		int intFromStr = Integer.parseInt(num);
		int sum = 5 + intFromStr; //15
		System.out.println("sum = " + sum);
		double parsedDouble = Double.parseDouble("10.5d");
		System.out.println("parsedDouble = " + parsedDouble);
		System.out.println("parsedFloat = " + Float.valueOf("3.5f"));
		System.out.println("parsedFloat = " + Float.parseFloat("3.5"));
		
		Float floatAsObj = 2.5f;        //obiect
		float floatAsPrimitive = 2.5f; //primitive
		floatAsObj += 2;
		floatAsObj.intValue(); //-> //partea intreaga
		floatAsPrimitive = floatAsObj; //unboxing     -> autoboxing
		floatAsObj = floatAsPrimitive; // boxing
		
		float convertFromObj = floatAsObj.floatValue();     //inainte de Java 5
		Float convertFromPrimitive = new Float(3.5f); //inainte de Java 5
	}
}
