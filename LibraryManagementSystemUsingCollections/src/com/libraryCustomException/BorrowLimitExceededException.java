package com.libraryCustomException;

public class BorrowLimitExceededException extends Exception {
	public BorrowLimitExceededException(String errorMessage) {
		super(errorMessage);
	}
}
