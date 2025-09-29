package com.BankingCore;
import com.BankingCore.BankAccount;
public class CurrentAccount extends BankAccount{

	public CurrentAccount(String customerName,
			String customerEmail, double customerBalance) {
		super(customerName, customerEmail, customerBalance);
		
	}

	@Override
	public String toString() {
		return "CurrentAccount [AccountNumber = "+BankAccount.getCustomerAccountNumbers()+" CustomerName = " + getCustomerName()+ 
				", CustomerEmail = " + getCustomerEmail()+ ", AccountBalance = " + getAccountBalance()+" ]";
	}

}
