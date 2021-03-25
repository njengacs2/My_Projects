package com.learnershub;

//Create getters and setters for each field
// Create two additional methods
// 1.  To allow the customer to deposit funds (this should increment the balance field).
// 2.  To allow the customer to withdraw funds.  This should deduct from the balance field,
// but not allow the withdrawal to complete if their are insufficient funds.
// You will want to create various code in the Main class (the one created by IntelliJ) to
// confirm your code is working.
// Add some System.out.println's in the two methods above as well.

public class BankAccount {

	private String accountNumber;
	private double balance;
	private String customerName;
	private String email;
	private String phoneNumber;

	// constructor without parameters

	public BankAccount() {
		this("123478", 2.50, "default name", "Default email addrress", "Default phone");
		System.out.println("Empty constractor called");

	}

	// constructor with parameters
	public BankAccount(String accountNumber, double balance, String customerName, String email, String phoneNumber) {
		System.out.println("Account constructor with parameters called");
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.customerName = customerName;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	public BankAccount(String customerName, String email, String phoneNumber) {
		this("444444", 100.50, "default name", "Default email addrress", "Default phone");
		this.customerName = customerName;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void deposit(double depositAmount) {
		this.balance += depositAmount;
		System.out.println("Deposit of  " + depositAmount + " is made. New balance is " + this.balance);

	}

	public void withdraw(double withdrawAmount) {

		if (this.balance - withdrawAmount < 0) {
			System.out.println("only " + balance + " available. Withdrawal can't be processed");
		} else {
			balance -= withdrawAmount;
			System.out.println("only " + withdrawAmount + " processed. Remaining balance is " + this.balance);
		}

	}

	public static void main(String[] args) {

		BankAccount myAccount = new BankAccount("123456", 0.00, "Bob", "myemail@bob.com", "(245) 124-5263");
		myAccount.deposit(1000.0);
		myAccount.withdraw(100.0);

		BankAccount jimAccount = new BankAccount("Jim", "jim@email.com", "222222");
		System.out.println(jimAccount.getAccountNumber() + " name " + jimAccount.getCustomerName());

	}

}
