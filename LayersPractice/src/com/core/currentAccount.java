package com.core;

public class currentAccount extends Account{
	private double overdraftLimit;

	public currentAccount(String accountNumber, String customerName, double balance, String email) {
		super(accountNumber, customerName, balance, email);
	}

	public double getOverdraftLimit() {
		return overdraftLimit;
	}

	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}
	
	
	//temp display method
	@Override
	public void display() {
		System.out.println("in current acc::acc number: "+ getAccountNumber() + " Name: " + getCustomerName());
	}
	
	
}
