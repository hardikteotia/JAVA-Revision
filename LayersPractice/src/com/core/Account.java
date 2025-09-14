package com.core;

public class Account {
	
	private String accountNumber;
	private String customerName;
	private double Balance;
	private String email;
	
	
	public Account(String accountNumber, String customerName, double Balance, String email) {
		this.accountNumber = accountNumber;
		this.customerName = customerName;
		this.email = email;
		this.Balance = Balance;
	}


	public Account(String email2) {
		this.email=email2;
	}
	public String getAccountNumber() {
		return accountNumber;
	}

	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Account(double Balance) {
		this.Balance = Balance;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}


	public double getBalance() {
		return Balance;
	}


	public void setBalance(double balance) {
		Balance = balance;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


//	@Override
//	public String toString() {
//		return "Account [accountNumber=" + accountNumber + ", customerName=" + customerName + ", Balance=" + Balance
//				+ "]";
//	}
//	
	public void display() {}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Account) {
			this.email.equals(((Account) obj).getEmail());
			return true;
		}
		return false;
	}
	
	
}
