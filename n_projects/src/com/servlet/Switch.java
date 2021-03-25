package com.servlet;

public class Switch {

	public static void printDayOfTheWeek(int day) {

		switch (day) {

		case 0:
			System.out.println("Sunday");
			break;
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Invalid day");
			break;

		}
	}

	public static void main(String[] args) {

		printDayOfTheWeek(9);
//
//		char charVariable = 'B';
//
//		switch (charVariable) { case 'B':
//			System.out.println("The character is either A or B or C or D or E"); break;
//
//		default:
//			System.out.println("The character is NOT either A or B or C or D or E");
//			break;
//
//		}

	}
}
