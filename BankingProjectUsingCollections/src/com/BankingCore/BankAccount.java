package com.BankingCore;

public class BankAccount {
	//Static Data Members
	public static long customerAccountNumbers = 711112001101L;
	public static int accountsCounter = 1;
	
	//Private Data Members
	private String customerName;
	private String customerEmail;
	private double accountBalance;
	
	//Static Method
	public static void accountNumberGenerator() {
		customerAccountNumbers+= accountsCounter;
	}
	
	
	public static long getCustomerAccountNumbers() {
		return customerAccountNumbers;
	}


	public String getCustomerName() {
		return customerName;
	}


	public double getAccountBalance() {
		return accountBalance;
	}


	@Override
	public String toString() {
		return "BankAccount [customerName=" + customerName + ", customerEmail=" + customerEmail + ", accountBalance="
				+ accountBalance + "]";
	}


	public String getCustomerEmail() {
		return customerEmail;
	}


	//BankConstructor
	public BankAccount(String customerName, String customerEmail, double customerBalance) {
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.accountBalance = customerBalance;
	}
	
	


	
	
	
	
	
}
