/*
 * We'll say that a number is "teen" if it is in the range 13 -19 (inclusive).
 * Write a method named hasTeen with 3 parameters of type int.
 * The method should return boolean and it needs to return true if one of the 
 * parameters is in range 13(inclusive) - 19 (inclusive). Otherwise return false.
 */
package com.servlet;

public class TeenNumberChecker {

	public static boolean hasTeen(int teen1, int teen2, int teen3) {

		if ((teen1 >= 13) && (teen1 <= 19) || (teen2 >= 13) && (teen2 <= 19) || (teen3 >= 13) && (teen3 <= 19)) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean isTeen(int teen) {

		if ((teen >= 13) && (teen <= 19)) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hasTeen(15, 12, 20);
		System.out.println();
	}

}
