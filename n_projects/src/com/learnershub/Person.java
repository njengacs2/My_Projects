package com.learnershub;

public class Person {

	private String firstName;
	private String lastName;
	private int age;

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFirstName() {

		return this.firstName;

	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLastName() {

		return this.lastName;
	}

	public void setAge(int age) {

		if (age < 0 || age > 100) {
			this.age = 0;
		} else {
			this.age = age;
		}

	}

	public int getAge() {
		return this.age;
	}

	public boolean isTeen() {
		if (age > 12 && age < 20) {
			return true;
		} else {
			return false;
		}
	}

	public String getFullName() {
		// return this.firstName + " " + this.lastName;
		return String.join(" ", firstName, lastName).trim();
	}

	public static void main(String[] args) {
		Person person = new Person();
		person.setFirstName(""); // firstName is set to empty string
		person.setLastName(""); // lastName is set to empty string
		person.setAge(10);
		System.out.println("fullName= " + person.getFullName());
		System.out.println("teen= " + person.isTeen());
		person.setFirstName("John"); // firstName is set to John
		person.setAge(18);
		System.out.println("fullName= " + person.getFullName());
		System.out.println("teen= " + person.isTeen());
		person.setLastName("Smith"); // lastName is set to Smith
		System.out.println("fullName= " + person.getFullName());

	}

}
