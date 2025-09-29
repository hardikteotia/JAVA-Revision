package com.BankingCore;

public class SavingAccount extends BankAccount {

	//DerivedClassConstructor	
	public SavingAccount(String customerName,
			String customerEmail, double customerBalance) {
		super(customerName, customerEmail, customerBalance);
	}

	@Override
	public String toString() {
		return "SavingAccount [ AccountNumber = "+BankAccount.getCustomerAccountNumbers()+" CustomerName = " + getCustomerName()+ 
				", CustomerEmail = " + getCustomerEmail()+ ", AccountBalance = " + getAccountBalance()+" ]";
	}
	
	
	
	
}
