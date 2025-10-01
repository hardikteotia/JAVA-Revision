package com.libraryCore;

public class PremiumMembership extends Membership{

	public PremiumMembership(int memberId, String name) {
		super(memberId, name);
	}
	private int borrowedLimit = 4;


	public void borrowedLimit() {
		if(borrowedLimit > 0) {
			
		}
		
	}

}
