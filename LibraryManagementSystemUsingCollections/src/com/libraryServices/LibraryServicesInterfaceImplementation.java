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
import com.libraryCustomException.InvalidMemberException;

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
	public void borrowBook(int bookId, int memberId) throws BookNotAvailableException, InvalidMemberException {
		boolean availCheck = booksList.stream()
			    			.anyMatch(book -> book.getBookId() == bookId && book.isAvailable());
		boolean originalMember = membersList.stream()
							.anyMatch(member->member.getMemberId() == memberId);
		/*“Go through the list of books. If you find any book that has the same ID as the one
		 * I'm looking for and it is available, then set availCheck to true.
		 * Otherwise, set it to false.”*/
		
		if(availCheck) {
			if(originalMember) {
				System.out.println("Before borrowing the book: ");
				booksList.stream().filter(bid -> bid.getBookId() == bookId).forEach(s -> System.out.println(s));
				System.out.println("--------------");
				booksList.stream().filter(bid -> bid.getBookId() == bookId).findAny().ifPresent(s->s.setAvailable(false));
				System.out.println("--------------");
				System.out.println("After borrowing the book");
				booksList.stream().filter(bid -> bid.getBookId() == bookId).forEach(s -> System.out.println(s));
			}
			else {
				throw new InvalidMemberException("Invalid Id");
			}
		}
		else {
			throw new BookNotAvailableException("Book's not available");
		}
	}

	@Override
	public void returnBook(int bookId) {
		booksList.stream().filter(bid->bid.getBookId() == bookId).forEach(s->s.setAvailable(true));
		System.out.println("Book returned");
		
	}

	@Override
	public void listAllBooksUnsortedManner() {
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
		booksList.stream().filter(s->s.isAvailable()==false).forEach(s->System.out.println(s));
		
	}

	@Override
	public void searchBookById(int bookId) throws BookNotAvailableException {
		boolean availCheck = booksList.stream()
    			.anyMatch(book -> book.getBookId() == bookId && book.isAvailable());
		if(availCheck) {
			System.out.println("Your book is here-----");
			booksList.stream().filter(s->s.getBookId()==bookId).forEach(s->System.out.println(s));
		}
		else {
			throw new BookNotAvailableException("Not Presented!!!");
		}
		
	}

	@Override
	public void removeTheBook(int bookId) throws BookNotAvailableException {
		// TODO Auto-generated method stub
		boolean availCheck =  booksList.stream()
								.anyMatch(book->book.getBookId() == bookId && book.isAvailable());
		if(availCheck) {
			booksList.removeIf(bid->bid.getBookId()==bookId);
			System.out.println("Book has been removed-----");
		}
		else {
			throw new BookNotAvailableException("Not Presented!!!");
		}
		
	}

	@Override
	public void listAllBooksSortedManner() {
		System.out.println("print sorted list--------");
		booksList.stream()
	    .sorted(Comparator.comparing(book -> book.toString()))
	    .forEach(System.out::println);
		
	}

	

	

}
