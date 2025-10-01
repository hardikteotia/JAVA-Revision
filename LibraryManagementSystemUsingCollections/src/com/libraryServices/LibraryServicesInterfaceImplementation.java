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
import java.util.Comparator;
import java.util.List;

import com.libraryCore.Book;
import com.libraryCore.Membership;
import com.libraryCustomException.BookNotAvailableException;

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
	public void borrowBook(int bookId, int memberId) throws BookNotAvailableException {
		boolean availCheck = booksList.stream()
			    			.anyMatch(book -> book.getBookId() == bookId && book.isAvailable());
		/*“Go through the list of books. If you find any book that has the same ID as the one
		 * I'm looking for and it is available, then set availCheck to true.
		 * Otherwise, set it to false.”*/
		
		if(availCheck) {
		System.out.println("Before borrowing the book: ");
		booksList.stream().filter(bid -> bid.getBookId() == bookId).forEach(s -> System.out.println(s.isAvailable()));
		booksList.stream().filter(bid -> bid.getBookId() == bookId).findAny().ifPresent(s->s.setAvailable(false));
		booksList.stream().filter(bid -> bid.getBookId() == bookId).forEach(s -> System.out.println(s));
		System.out.println("After borrowing the book");
		}
		else {
			throw new BookNotAvailableException("Book not available");
		}
	}

	@Override
	public void returnBook(int bookId, int memberId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listAllBooks() {
		booksList.forEach(b -> System.out.println(b));
		
		System.out.println("print sorted list--------");
		booksList.stream()
	    .sorted(Comparator.comparing(book -> book.toString()))
	    .forEach(System.out::println);
		System.out.println("print sorted list-------");
		booksList.sort(Comparator.comparing(book -> book.toString()).reversed());
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
