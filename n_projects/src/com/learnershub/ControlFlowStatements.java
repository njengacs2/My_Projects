package com.learnershub;

public class ControlFlowStatements {

	// SWITCH STATEMENTS

	/*
	 * //Write a method called printNumberInWord. The method has one parameter
	 * number which is the whole number. The method needs to print "ZERO", "ONE",
	 * "TWO", ... "NINE", "OTHER" if the int parameter number is 0, 1, 2, .... 9 or
	 * other for any other number including negative numbers. You can use if-else
	 * statement or switch statement whatever is easier for you.
	 */

	public static void printNumberInWord(int number) {

		switch (number) {

		case 0:
			System.out.println("ZERO");
			break;
		case 1:
			System.out.println("ONE");
			break;
		case 2:
			System.out.println("TWO");
			break;
		case 3:
			System.out.println("THREE");
			break;
		case 4:
			System.out.println("FOUR");
			break;
		case 5:
			System.out.println("FIVE");
			break;
		case 6:
			System.out.println("SIX");
			break;
		case 7:
			System.out.println("SEVEN");
			break;
		case 8:
			System.out.println("EIGHT");
			break;
		case 9:
			System.out.println("NINE");
			break;
		default:
			System.out.println("OTHER");

		}

	}
// ******************************************************************************************

//	Write a method isLeapYear with a parameter of type int named year. 
//	The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
//	If the parameter is not in that range return false.
//	Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is, otherwise return false.
//	A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.

	public static boolean isLeapYear(int year) {

		if (!(year >= 1 && year <= 9999)) {
			return false;
		} else if (year % 4 != 0) {
			return false;
		} else if (year % 100 != 0) {
			return true;
		} else if (year % 400 == 0) {
			return true;
		} else {
			return false;
		}

	}

	public static int getDaysInMonth(int month, int year) {
		if (((month < 1) || (month > 12)) || ((year < 1) || (year > 9999))) {
			return -1;
		}
		if (isLeapYear(year) && month == 2) {
			return 29;
		}
		switch (month) {
		case 11:
		case 9:
		case 4:
		case 6:
			return 30;

		case 2:
			return 28;
		default:
			return 31;
		}
	}

	public static void main(String[] args) {

		printNumberInWord(9);
		// ***************************
		System.out.println(isLeapYear(-1600));
		System.out.println(getDaysInMonth(-1, 2020));

	}

}
