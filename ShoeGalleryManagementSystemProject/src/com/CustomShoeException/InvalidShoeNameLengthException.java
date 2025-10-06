/*
 * 1.2) Validates that the Name has a length between 3 and 20 characters.
*/

package com.CustomShoeException;

public class InvalidShoeNameLengthException extends Exception{

	public InvalidShoeNameLengthException(String errorMessage) {
		super(errorMessage);
	}

}
