package com.service;
import com.exception.*;
import com.core.*;
public class bankServiceImplementation implements bankService {
	
	//function to create saving account
	@Override
	public void CreateSavingAccount(String accountNumber, String customerName, double balance, String email, Account[] referencedArray, int index) {
		
		referencedArray[index] = new savingAccount(accountNumber, customerName, balance, email);
		
	}
	//function to create current account

	@Override
	public void CreateCurrentAccount(String accountNumber, String customerName, double balance,String email, Account[] referencedArray, int index) {
		
		referencedArray[index] = new currentAccount(accountNumber, customerName, balance, email);
		
	}

	@Override
	public void withdraw(String accountNumber, double amount) {
		
		
	}
	@Override
	public void deposit(String accountNumber, double amount) {
		
		
	}
	@Override
	public void displayAccounts(Account [] referencedArray) {

		for(Account i : referencedArray) {
			if(i!=null) {
				System.out.println(i);
			}
		}
		
	}

	
	
	public void checkBalance(Account[] referencedArray) {
		Account balanceObj = null;
		System.out.println("Your balance is: "+ balanceObj.getBalance() + " Name: "+balanceObj.getCustomerName());
		
		
	}

	
}
