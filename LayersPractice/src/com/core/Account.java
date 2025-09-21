package com.core;

public class Account {
	
	private String accountNumber;
	private String customerName;
	private static double Balance;
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


	public static double getBalance() {
		return Balance;
	}


	public static void setBalance(double balance) {
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
	public boolean equals(Object temporaryObjForEmailChecking) {
		if(temporaryObjForEmailChecking instanceof Account) {
			String emailSentByUser = ((Account) temporaryObjForEmailChecking).getEmail();
			if(this.email.equals(emailSentByUser)) {
				return true;
			}
		}
		return false;
	}
	
	
}
