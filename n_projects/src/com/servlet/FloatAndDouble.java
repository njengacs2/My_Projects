package com.servlet;

public class FloatAndDouble {

	public static void main(String[] args) {

		float myMinFloatValue = Float.MIN_VALUE;
		float myMaxFloatValue = Float.MAX_VALUE;

		System.out.println("Float minimun value = " + myMinFloatValue);
		System.out.println("Float maximun value = " + myMaxFloatValue);

		double myMinDoubleValue = Double.MIN_VALUE;
		double myMaxDoubleValue = Double.MAX_VALUE;

		System.out.println("double minimun value = " + myMinDoubleValue);
		System.out.println("double maximun value = " + myMaxDoubleValue);

		int myIntValue = 5 / 3;
		float myFloatValue = 5f / 3f;
		double myDoubleValue = 5.00 / 3.00;
		System.out.println("MyIntValue= " + myIntValue);
		System.out.println("MyFloatValue= " + myFloatValue);
		System.out.println("MyDoubleValue= " + myDoubleValue);

		double pound = 3;
		double kilogram = 0.45359237;
		double results = pound * kilogram;

		System.out.println("MyResults  = " + results);

	}

}
