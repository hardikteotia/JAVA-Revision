package com.validation;

import com.core.*;
import com.exception.*;

public class InputValidator extends Exception{
	
	public static void isValidAmount() {
		
		
	}
	
	public static void isValidEmail(String email, Account[] referencedArray) throws InvalidAccountException {
		
		Account temp = new Account(email);
		for(Account i: referencedArray) {
			if(i!=null) {
				if(i.equals(temp)) {
					throw new InvalidAccountException("Email already existed");
				}
			}
		}
	}
		public static Account forBalanceCheck(String email, Account[] referencedArray) throws InvalidAccountException {
			
			Account temp = new Account(email);
			for(Account i: referencedArray) {
				if(i!=null) {
					if(i.equals(temp)) {
						return i;
					}
				}
			}
		throw new InvalidAccountException("No account exist");
//		return;
		
	}
	
	
	
}
