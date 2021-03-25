package com.learnershub;

public class TheForStatement {

	// using the for statement, call the calculateInterest method with
	// the amount of 10000 with an interestRate of 2,3,4,5,6,7, and 8
	// and print the results to the console window.

	// How would you modify the for loop above to do the same thing as
	// shown but to start from 8% and work back to 2%

	public static double calculateInterest(double amount, double interestRate) {
		return (amount * (interestRate / 100));
	}

	// ****************************************************************************************

	// Create a for statement using any range of numbers
	// Determine if the number is a prime number using the isPrime method
	// if it is a prime number, print it out AND increment a count of the
	// number of prime numbers found
	// if that count is 3 exit the for loop
	// hint: Use the break; statement to exit

	public static boolean isPrime(int n) {

		if (n == 1) {
			return false;
		}

		for (int i = 2; i <= n / 2; i++) {
			if (n % 1 == 0) {
				return false;
			}
		}
		return true;
	}

	// ****************************************************************************************
	// *****************************CHALLENGE**************************************************
	// ****************************************************************************************

	public static boolean isOdd(int number) {

		if ((number > 0) && (number % 2 != 0)) {
			return true;
		} else {
			return false;
		}
	}

	public static int sumOdd(int start, int end) {
		if (end < start || start < 0 || end < 0) {
			return -1;
		}
		int sum = 0;
		for (int i = start; i <= end; i++) {
			if (isOdd(i)) {
				sum += i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {

		System.out.println(sumOdd(1, 100));

		for (int i = 2; i < 9; i++) {
			System.out
					.println("10,000 at " + i + " interest = " + String.format("%.2f", calculateInterest(10000.0, i)));

		}

		System.out.println("***************************************************************");

		for (int i = 8; i >= 2; i--) {
			System.out
					.println("10,000 at " + i + " interest = " + String.format("%.2f", calculateInterest(10000.0, i)));

		}

		System.out.println("***************************************************************");

		int count = 0;
		for (int i = 10; i < 50; i++) {
			if (isPrime(i)) {
				count++;
				System.out.println("Number " + i + " is a prime number");
				if (count == 10) {
					System.out.println("Exiting for loop");
					break;
				}
			}
		}

		// Create a for statement using a range of numbers from 1 to 1000 inclusive.
		// Sum all the numbers that can be divided with both 3 and also with 5.
		// For those numbers that met the above conditions, print out the number.
		// break out of the loop once you find 5 numbers that met the above conditions.
		// After breaking out of the loop print the sum of the numbers that met the
		// above conditions.
		// Note: Type all code in main method

		int count2 = 0;
		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			if ((i % 3 == 0) && (i % 5 == 0)) {
				count2++;
				sum += i;
				System.out.println("Found number = " + i);
			}

			if (count == 5) {
				break;
			}
		}

		System.out.println("Sum = " + sum);

	}

}
