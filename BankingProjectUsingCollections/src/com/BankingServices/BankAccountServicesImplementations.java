package com.BankingServices;

import java.util.List;

import com.BankingCore.BankAccount;
import com.BankingCore.CurrentAccount;
import com.BankingCore.SavingAccount;
import com.BankingCustomException.InsufficientFundException;
import com.BankingCustomException.InvalidAccountException;

//import jdk.internal.misc.FileSystemOption;

public class BankAccountServicesImplementations implements BankAccountServices {

	//for creating current account
	@Override
	public void openCurrentAccount(String customerNAme, String customerEmail, double accountBalance,
			List<BankAccount> accountsList) {
		accountsList.add(new CurrentAccount(customerNAme, customerEmail, accountBalance));
		
	}
	//for creating saving accounts
	@Override
	public void openSavingAccount(String customerName, String customerEmail, double accountBalance,
			List<BankAccount> accountsList) {
		accountsList.add(new SavingAccount(customerName, customerEmail, accountBalance));
		
	}
	//to display account details
	@Override
	public void displayAccountDetails(String emailForValidation, List<BankAccount> accountsList) throws
	InvalidAccountException{
		
		for(BankAccount i : accountsList) {
			if(i.getCustomerEmail().equalsIgnoreCase(emailForValidation)) {
				System.out.println(i.toString());
				return;
				
			}
		}
		throw new InvalidAccountException("No account existed");
		
	}
	

	
	

}
