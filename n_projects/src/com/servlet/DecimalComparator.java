/*
 * Write a method areEqualByThreeDecimalPlaces with two parameters of type double.
 * The method should return boolean and it needs to return true if two double numbers are 
 * the same up to three decimal places. Otherwise, return false.
*/
package com.servlet;

public class DecimalComparator {

	public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {

		int firstnum = (int) (num1 * 1000);
		int secondnum = (int) (num2 * 1000);

		if (firstnum == secondnum) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
