/*
 * 1.3) Validates that the Shoe type is one of the predefined type.*/

package com.CustomShoeException;

public class InvalidShoeTypeException extends Exception{

	public InvalidShoeTypeException(String erroeMessage) {
		super(erroeMessage);
	}
	
}
