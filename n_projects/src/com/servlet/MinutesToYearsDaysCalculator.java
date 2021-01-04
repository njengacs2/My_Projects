package com.servlet;

public class MinutesToYearsDaysCalculator {

	public static void printYearsAndDays(long minutes) {

		long days = (minutes / 60 / 24);
		long year = (days / 365);
		long remainingDays = (days % 365);

		if (minutes < 0) {
			System.out.println("invalid value");
		} else {
			System.out.println(minutes + " min = " + year + " y and " + remainingDays + " d");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printYearsAndDays(1051200);

	}

}
