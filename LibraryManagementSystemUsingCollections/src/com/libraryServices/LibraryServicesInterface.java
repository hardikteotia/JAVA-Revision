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



public interface LibraryServicesInterface {
	
	
	public void addBook(int bookId, String title, String author);//completed
	
	public void registerMember(int memberId, String name);//completed
	
	public void borrowBook(int bookId, int memberId);
	
	public void returnBook(int bookId, int memberId);
	
	public void listAllBooks();//completed
	
	public void listAllMembers();//completed
	
	public void listBorrowedBooks(int memberId);
}
