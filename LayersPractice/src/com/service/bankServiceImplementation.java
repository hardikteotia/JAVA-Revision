package com.service;
import com.exception.*;
import com.core.*;
import com.validation.*;
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
	public void withdraw(String email, double amount, Account[] referencedArray ) {
		
		
	}
	@Override
	public void deposit(String accountNumber, double amount) {
		
		
	}
//	@Override
//	public void displayAccounts(Account [] referencedArray) {
//
//		for(Account i : referencedArray) {
//			if(i!=null) {
//				System.out.println(i.toString());
//			}
//		}
//		
//	}

	
	
	public void checkBalance(Account[] referencedArray, String emailForCheckingBalance) throws InvalidAccountException{
//		Account balanceCheckingObject = new Account(emailForCheckingBalance);
//		InputValidator emailChecker =  new InputValidator();
		Account Acc = InputValidator.forBalanceCheck(emailForCheckingBalance, referencedArray);
		
		System.out.println("Your balance is: "+ Acc.getBalance() + " Name: "+Acc.getCustomerName());
		
		
	}

	@Override
	public void display(Account[] array) {
		for(Account i: array) {
			if(i!=null) {
				i.display();
			}
		}
		
	}

	
}
