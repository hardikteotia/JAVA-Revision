/*
 * LibraryServices Interface

addBook(Book book)

registerMember(Member member)

borrowBook(int bookId, int memberId)

returnBook(int bookId, int memberId)

listAllBooks()

listBorrowedBooks(int memberId)
*/

package com.libraryServices;

import com.libraryCustomException.BookNotAvailableException;
import com.libraryCustomException.InvalidMemberException;

public interface LibraryServicesInterface {
	
	
	public void addBook(int bookId, String title, String author);//completed
	
	public void registerMember(int memberId, String name);//completed
	
	public void borrowBook(int bookId, int memberId) throws BookNotAvailableException, InvalidMemberException;
	
	public void returnBook(int bookId);
	
	public void listAllBooksUnsortedManner();//completed
	
	public void listAllBooksSortedManner();
	
	public void listAllMembers();//completed
	
	public void listBorrowedBooks(int memberId);
	
	public void searchBookById(int bookId) throws BookNotAvailableException;
	
	public void removeTheBook(int bookId) throws BookNotAvailableException;
}
