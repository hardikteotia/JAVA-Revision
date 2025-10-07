package com.CustomEmployeeException;

public class InvalidPhoneNumberLengthException extends Exception{

	public InvalidPhoneNumberLengthException(String errorMessage) {
		super(errorMessage);
	}
	
}
