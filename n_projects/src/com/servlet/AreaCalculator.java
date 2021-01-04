package com.servlet;

public class AreaCalculator {

	public static double area(double radius) {

		double areaOfACircle = 3.14159 * (radius * radius);

		if (radius < 1) {
			return -1.0;
		} else {
			return areaOfACircle;
		}
	}

	public static double area(double x, double y) {
		double areaOfATriangle = (x * y);

		if (x < 1 || y < 1) {
			return -1.0;
		} else {
			return areaOfATriangle;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(area(10.0));
		System.out.println(area(10.0, 5.0));
	}

}
