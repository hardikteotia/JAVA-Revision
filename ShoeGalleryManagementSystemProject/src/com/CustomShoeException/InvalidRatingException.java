/*
 * 1.1) Throws an exception if ratings are not between 1 and 10.
*/

package com.CustomShoeException;

public class InvalidRatingException extends Exception{

	public InvalidRatingException(String errorMessage) {
		super(errorMessage);
	}
	
}
