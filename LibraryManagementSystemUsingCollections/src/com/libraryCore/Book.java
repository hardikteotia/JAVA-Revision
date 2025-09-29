//Book Class
//
//Fields: bookId, title, author, isAvailable
//
//Methods: getters, setters, toString()
//
//
//Fields: memberId, name, List<Book> borrowedBooks

package com.libraryCore;

public class Book {
	private int bookId;
	private String title;
	private String author;
	private boolean isAvailable;
	
	public Book(int bookId, String title, String author){
		this.bookId=bookId;
		this.title = title;
		this.author = author;
		this.isAvailable = true;
		
	}
	
	//getters and setters
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	
	//To string method
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + ", author=" + author + ", isAvailable=" + isAvailable
				+ "]";
	}
	
	
}
