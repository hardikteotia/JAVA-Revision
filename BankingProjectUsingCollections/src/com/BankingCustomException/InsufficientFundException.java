package com.BankingCustomException;

public class InsufficientFundException extends Exception{

	public InsufficientFundException(String errorMessage) {
		super(errorMessage);
	}
	
}
