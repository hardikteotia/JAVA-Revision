package com.service;
import com.core.Account;
import com.exception.InvalidAccountException;
public interface bankService {
	
	
/*createAccount(Account account)

deposit(String accNum, double amount)

withdraw(String accNum, double amount)

Account getAccount(String accNum)

void displayAllAccounts()*/
	
	
	
	public void CreateSavingAccount(String accountNumber, String customerName, double balance, String email, Account[] array, int index);
	
	public void CreateCurrentAccount(String accountNumber, String customerName,double balance,String email,Account[] array, int index);
	
	public void withdraw(String accountNumber, double amount, Account[] referencedArray);
	
	public void deposit(String accountNumber, double amount);
	
	public void checkBalance(Account[] array, String email) throws InvalidAccountException;
	
//	public void displayAccounts(Account[] array);
	
	public void display(Account[] array);
}
