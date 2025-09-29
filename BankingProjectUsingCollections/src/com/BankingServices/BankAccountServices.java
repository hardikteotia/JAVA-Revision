package com.BankingServices;

import java.util.List;

import com.BankingCore.BankAccount;
import com.BankingCustomException.InsufficientFundException;
import com.BankingCustomException.InvalidAccountException;

public interface BankAccountServices {
	
	public void openCurrentAccount(String customerName,
			String customerEmail, double accountBalance,
			List<BankAccount> accountsList);
	
	public void openSavingAccount(String customerName,
			String customerEmail, double accountBalance,
			List<BankAccount> accountsList);
	
	public void displayAccountDetails(String emailForValidation,
			List<BankAccount> accountsList) throws InvalidAccountException;
	
}
