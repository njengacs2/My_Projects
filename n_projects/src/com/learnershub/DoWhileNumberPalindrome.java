package com.learnershub;

public class DoWhileNumberPalindrome {

	public static boolean isPalindrome(int number) {

		int reverse = 0;
		int num = number;

		while (number != 0) {
			int lastDigit = number % 10;
			reverse = reverse * 10;
			reverse += lastDigit;
			number /= 10;

		}

		if (num == reverse) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome(1121));

	}

}
