package com.learnershub;

//Create a new class VipCustomer
// it should have 3 fields name, credit limit, and email address.
// create 3 constructors
// 1st constructor empty should call the constructor with 3 parameters with default values
// 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
// 3rd constructor should save all fields.
// create getters only for this using code generation of intellij as setters wont be needed
// test and confirm it works.

public class VipCustomer {

	public VipCustomer() {
		this("defaul name", 255.5, "default email address");
		System.out.println("Empty constractor called");

	}

	public VipCustomer(String name, double creditLimit) {
		this(name, creditLimit, "unknown@email.com");

	}

	public VipCustomer(String name, double creditLimit, String emailAddress) {
		System.out.println("Account constructor with parameters called");
		this.name = name;
		this.creditLimit = creditLimit;
		this.emailAddress = emailAddress;
	}

	private String name;
	private double creditLimit;
	private String emailAddress;

//********************************************
	public static void main(String[] args) {
		VipCustomer myCustomer = new VipCustomer("Kim", 500.0, "kim@email.com");
		System.out.println("Name :" + myCustomer.getName() + " and his credit is : " + myCustomer.getCreditLimit());
	}

//********************************************
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

}
