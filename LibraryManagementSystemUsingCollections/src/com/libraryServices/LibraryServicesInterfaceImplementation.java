/*
 * ibraryServicesImplementation

Use ArrayList to store books and members.

Throw custom exceptions when:

Book is unavailable.

Invalid member tries to borrow.

Borrow limit is exceeded.
*/

package com.libraryServices;

import java.util.ArrayList;
import java.util.List;

import com.libraryCore.Book;
import com.libraryCore.Membership;

public class LibraryServicesInterfaceImplementation implements LibraryServicesInterface{
	
	List<Book> booksList = new ArrayList<>();//list of books
	List<Membership> membersList = new ArrayList<>();//list of members
	
	
	@Override
	public void addBook(int bookId, String title, String author) {
		
		booksList.add(new Book(bookId, title, author));
		
	}//completed

	@Override
	public void registerMember(int memberId, String name) {
		membersList.add(new Membership(memberId,name));
		
	}//completed

	@Override
	public void borrowBook(int bookId, int memberId) {
		
		
	}

	@Override
	public void returnBook(int bookId, int memberId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listAllBooks() {
		booksList.forEach(b -> System.out.println(b));
		
	}//completed
	
	@Override
	public void listAllMembers() {
		membersList.forEach(m -> System.out.println(m));
		
	}//completed

	@Override
	public void listBorrowedBooks(int memberId) {
		// TODO Auto-generated method stub
		
	}

	

	

}
