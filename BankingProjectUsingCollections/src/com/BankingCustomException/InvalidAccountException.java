package com.BankingCustomException;

public class InvalidAccountException extends Exception{

	public InvalidAccountException(String errorMessage) {
		super(errorMessage);
	}
	
}
