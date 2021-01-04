package com.servlet;

public class BarkingDog {

	public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

		if (hourOfDay < 0 || hourOfDay > 23) {
			return false;
		} else if (barking == true && hourOfDay < 8 || hourOfDay > 22) {

		} else {
			return false;
		}
		return barking;
	}

	public static void main(String[] args) {

		BarkingDog.shouldWakeUp(false, -0);

	}

}
