package com.libraryCustomException;

public class BookNotAvailableException extends Exception{

	public BookNotAvailableException(String errorMessage) {
		super(errorMessage);
	}
	
}
