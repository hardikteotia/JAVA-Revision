package com.libraryCustomException;

public class InvalidMemberException extends Exception{

	public InvalidMemberException(String errorMessage) {
		super(errorMessage);
	}
	
}
