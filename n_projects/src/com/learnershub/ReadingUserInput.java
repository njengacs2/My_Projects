package com.learnershub;

import java.util.Scanner;

public class ReadingUserInput {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your year of birth: ");

		boolean hasNextInt = scanner.hasNextInt(); // checks if the input is correct like if letter the input is not
													// correct

		if (hasNextInt) {
			int yearOfBirth = scanner.nextInt();
			scanner.nextLine(); // handles Enter key

			System.out.println("Enter your name: ");
			String name = scanner.nextLine();
			int age = 2020 - yearOfBirth;

			if (age >= 0 && age <= 100) {
				System.out.println("Your name is: " + name + " and you are " + age + "years old.");
			} else {
				System.out.println("Invalid year of birth");
			}

		} else {
			System.out.println("Unable to parse year of birth.");
		}

		scanner.close();
	}

}
