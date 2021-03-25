package com.learnershub;

public class GreatestCommonDivisor {

	public static int getGreatestCommonDivisor(int num1, int num2) {

		if (num1 < 10 || num2 < 10) {
			return -1;
		}

		if (num2 == 0) {
			return num1;
		}
		while (num2 != 0) {
			int number = num2;
			num2 = num1 % num2;
			num1 = number;
		}
		return num1;
	}

	public static void main(String[] args) {
		System.out.println(getGreatestCommonDivisor(12, 30));

	}

}
