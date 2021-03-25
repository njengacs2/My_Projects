package com.learnershub;

public class WhileAndDoWhileStatements {

	public static boolean isEvenNumber(int number) {
		if ((number % 2 == 0)) {
			return true;
		} else {
			return false;
		}
	}

	// **********************************************************
	public static int sumDigits(int number) {

		if (number < 10) {
			return -1;
		}

		int sum = 0;

		// 125 -> 125 / 10 = 12 -> 12*10 = 120 -> 125 - 120 = 5

		while (number > 0) {
			// extract the least-significant digit
			int digit = number % 10;
			sum += digit;

			// drop the least-significant digit
			number /= 10;
		}
		return sum;
	}

	// *************************************************************

	public static void main(String[] args) {

		System.out.println("The sum of the digits in number 125 is " + sumDigits(125));
		System.out.println("The sum of the digits in number -125 is " + sumDigits(-125));
		System.out.println("The sum of the digits in number 4 is " + sumDigits(4));
		System.out.println("The sum of the digits in number 32123 is " + sumDigits(32123));

		int count = 1;
		// while (count != 6) {
		// System.out.println("Count value is " + count);
		// count++;
		// }
		//
		// for (int i = 1; i < 6; i++) {
		// System.out.println("Count value is " + i);
		// }

		do {
			System.out.println("Count value is " + count);
			count++;
		} while (count != 6);

		System.out.println("************isEvenNumber method****************");

		int number = 4;
		int finishNumber = 20;
		int evenNumbersFound = 0;

		while (number <= finishNumber) {
			number++;
			if (!isEvenNumber(number)) {
				continue;
			}
			System.out.println("Even Number " + number);

			evenNumbersFound++;
			if (evenNumbersFound >= 5) {
				break;
			}
		}

		System.out.println("Total even numbers found = " + evenNumbersFound);
	}

}
