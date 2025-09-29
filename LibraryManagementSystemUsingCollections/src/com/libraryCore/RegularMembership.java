package com.libraryCore;

public class RegularMembership extends Membership{

	private int borrowedLimit = 2;
	public RegularMembership(int memberId, String name) {
		super(memberId, name);
	}
	

	public void borrowedLimit() {
		if(borrowedLimit > 0) {
			//borrow the book
			
			
		}
		
	}

}
