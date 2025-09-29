/*
 * 
 *

Register a Member
→ Choose between RegularMember or PremiumMember
→ Enter member details (ID, name, contact, etc.)

Borrow a Book
→ Enter Member ID
→ Enter Book ID
→ Check availability and member validity
→ Throw BookNotAvailableException or InvalidMemberException if applicable

Return a Book
→ Enter Member ID
→ Enter Book ID
→ Update book quantity and member's borrowed list

View All Books
→ Display all available books with their details

View All Members
→ Display all registered members and their types

Search Book by ID / Title
→ Let user enter either ID or title
→ Show book if found, else notify

Remove Book by ID
→ Allow admin/user to remove a book from the system

Exit Application*/



package com.libraryUserInterface;

import java.util.Scanner;

import com.libraryCustomException.BookNotAvailableException;
import com.libraryServices.LibraryServicesInterface;
import com.libraryServices.LibraryServicesInterfaceImplementation;

public class LibraryTester {
	public static void main(String [] args) {
		
		boolean outerFlag = false;
		LibraryServicesInterface serviceObj = new LibraryServicesInterfaceImplementation();
//		int choices;
		try(Scanner sc = new Scanner(System.in)){
			//outer try 
			
				try {
					//inner try
					
					System.out.println("Enter your choices: \n"
							+ "1. Add a Book\r\n"
							+ "2. Register a Member\r\n"
							+ "3. Borrow a Book\r\n"
							+ "4. Return a Book\r\n"
							+ "5. View all Books\r\n"
							+ "6. View all Members\r\n"
							+ "7. Search book by Id\r\n"
							+ "8. Remove Book by Id\r\n"
							+ "9. Exit the application...\r\n");
					
					while(!outerFlag) {
						//While starts here
						
							switch(sc.nextInt()) {
							
								case 1: 
									System.out.println("Enter Book Id, Title, author");
									serviceObj.addBook(sc.nextInt(), sc.next(), sc.next());
									System.out.println("Book Added---");
 									break;
 									
								case 2: 
									System.out.println("Enter Your Id and Name");
									serviceObj.registerMember(sc.nextInt(), sc.next());
									System.out.println("Member Added---");
									break;
									
								case 3:
									System.out.println("Enter Book Id");
									serviceObj.borrowBook(sc.nextInt(),sc.nextInt());
									break;
									
								case 4:
									
									break;
									
								case 5:
									System.out.println("----Books are----");
									serviceObj.listAllBooks();
									break;
									
								case 6:
									System.out.println("----Members are----");
									serviceObj.listAllMembers();
									break;
									
								case 7:
									
									break;
									
								case 8:
									
									break;
								
								case 9:
									outerFlag = true;
									System.out.println("ok byeeeee-----:D");
									break;
									
								default :
									System.out.println("Wrong Input-----");
									break;
							
							}
						
						//while ends here
					}
					
					//inner try ends here
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
				}
			
			//outer try ends here
		}
		
		
	}
}
