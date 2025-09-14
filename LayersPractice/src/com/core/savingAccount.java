package com.core;

public class savingAccount extends Account{
	double interestRate;

	public savingAccount(String accountNumber, String customerName, double balance, String email) {
		super(accountNumber, customerName, balance, email);
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	
	//temp display
	@Override
	public void display() {
		System.out.println("in saving acc::acc number: "+ getAccountNumber()+" Name: "+getCustomerName());
	}
}
