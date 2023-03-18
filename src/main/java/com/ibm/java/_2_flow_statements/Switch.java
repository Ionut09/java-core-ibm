package com.ibm.java._2_flow_statements;

import java.time.Month;
import java.util.Scanner;

public class Switch {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first: ");
		int first = sc.nextInt(); //execution stops, waiting for input from keyboard
		System.out.println("Enter second: ");
		int second = sc.nextInt();
		System.out.println("Enter operation: ");
		String operation = sc.next(); // +-/*%
		
		computeOperation(first, second, operation);
		
		System.out.println("calculateDaysForMonth(Month.MAY, true) = " + calculateDaysForMonth(Month.MAY, true));
		System.out.println("calculateDaysForMonth(Month.AUGUST, true) = " + calculateDaysForMonth(Month.AUGUST, true));
		System.out.println("calculateDaysForMonth(Month.OCTOBER, true) = " + calculateDaysForMonth(Month.OCTOBER, true));
		System.out.println("calculateDaysForMonth(Month.FEBRUARY, true) = " + calculateDaysForMonth(Month.FEBRUARY, true));
	}
	
	static int calculateDaysForMonth(Month month, boolean leapYear) {
		int days;
		switch (month) {
			case JANUARY:
			case MARCH:
			case MAY:
			case JULY:
			case AUGUST:
			case OCTOBER:
			case DECEMBER: {
				days = 31;
				break;
			}
			case APRIL:
			case JUNE:
			case SEPTEMBER:
			case NOVEMBER: {
				days = 30;
				break;
			}
			case FEBRUARY: {
				if (leapYear) {
					days = 29;
				} else {
					days = 28;
				}
				break;
			}
			default:
				throw new IllegalArgumentException("Bad month");
		}
		return days;
	}
	
	static void computeOperation(int first, int second, String operation) {
		int result = 0;
		switch (operation) {
			case "+": {
				result = first + second;
				break;
			}
			case "-": {
				result = first - second;
				break;
			}
			case "*": {
				result = first * second;
				break;
			}
			case "/": {
				result = first / second;
				break;
			}
			default: {
				System.out.println("Bad operation! \nPlease use one of: +-/*");
			}
		}
		System.out.println(first + operation + second + "=" + result);
	}
	
//	static int calculateDaysForMonthWithEnhancedSwitch(Month month, boolean leapYear) {
//		switch (month) {
//			case JANUARY, MARCH, MAY, JULY, AUGUST, OCTOBER, DECEMBER -> {
//				return 31;
//			}
//			case APRIL, JUNE, SEPTEMBER, NOVEMBER -> {
//				return 30;
//			}
//			case FEBRUARY -> {
//				if (leapYear) {
//					return 29;
//				} else {
//					return 28;
//				}
//			}
//			default -> throw new IllegalArgumentException("Bad month");
//		}
//	}
}
