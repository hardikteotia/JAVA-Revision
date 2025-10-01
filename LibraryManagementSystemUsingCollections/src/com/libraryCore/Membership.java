//Abstract method: borrowLimit()
//
//RegularMember / PremiumMember
//
//Subclasses with different borrow limits (e.g., 2 for Regular, 5 for Premium)


package com.libraryCore;

import java.util.ArrayList;
import java.util.List;

public class Membership{
	private int memberId;
	private String name;
	
	List<Book> borrowedBooksbyMembers = new ArrayList<>();
	
	public Membership(int memberId, String name) {
		this.memberId = memberId;
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "Membership [memberId=" + memberId + ", name=" + name + "]";
	}


	public int getMemberId() {
		return memberId;
	}
	public String getName() {
		return name;
	}
	
//	public abstract void borrowedLimit();
	
}
