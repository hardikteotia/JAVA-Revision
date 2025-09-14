package com.validation;

import com.core.Account;
import com.exception.InvalidAccountException;

public class InputValidator extends Exception{
	
	public static boolean isValidAmount() {
		
		
		
		return true;
	}
	
	public static void isValidEmail(String email, Account[] referencedArray)throws InvalidAccountException {
		
		Account temp = new Account(email);
		for(Account i: referencedArray) {
//			if(referencedArray!=null) {
//				i.equals(temp);
//			}
			if(i.equals(temp)) {
				throw new InvalidAccountException("Email already existed");
			}
			
		}
		
	}
	
	
	
}
