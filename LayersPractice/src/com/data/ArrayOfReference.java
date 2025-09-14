package com.data;

import com.core.Account;

public class ArrayOfReference {
	
	public Account [] referencedArray;
	
	public void givingSizeToArray(int size) {
		referencedArray = new Account [size];
	}
	
}
