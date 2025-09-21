package com.userinterface;
import com.core.*;
import com.exception.*;
//import com.exception.InvalidAccountException;

import java.util.Scanner;
import com.service.*;
//import com.service.bankServiceImplementation;

import com.validation.*;

public class BankTester {

	public static void main(String[] args) {
		
		
		int index = 0;
		int totalAccountsCounter = 0;
		boolean mainChoicesLoop = false;
		
		
		
		try(Scanner sc = new Scanner(System.in)){
			//outer try starts
			System.out.println("Enter the size of array: ");
			Account[] arrayOfReference = new Account[sc.nextInt()];
			bankService bankServiceObj = new bankServiceImplementation();
			
			try {
				//Inner try starts
				
				while(!mainChoicesLoop) {
					//here while loop starts
					
					System.out.println("Enter your choice here: "
							+ "\n1. Open Account"
							+ "\n2. Close Account"
							+ "\n3. Display AccountDetails"
							+ "\n4. Check Balance"
							+ "\n5. Withdraw Amount"
							+ "\n6. Exit the Application");
					
					switch(sc.nextInt()) {
						//here outer switch started
					
						case 1:{
							boolean subChoices=false;
							while(!subChoices) {
								//inner while starts
								System.out.println("which account you want to open:"
										+ "\na. saving "
										+ "\nb. current "
										+ "\nc. Go back previous menu");
								switch(sc.next().charAt(0)) {
									case 'a':
										//first before creating account it'll check for duplicate in service implementation
										System.out.println("For verification plz enter your email first");
										InputValidator.isValidEmail(sc.next(), arrayOfReference);
										System.out.println("----------------------");
										System.out.println("Enter details for saving acc.: AccountNumber CustomerName Balance and Email");
										bankServiceObj.CreateSavingAccount(sc.next(), 
												sc.next(), sc.nextDouble(), sc.next(),
												arrayOfReference, index);
										System.out.println("Your saving acc has been created");
										index++;
										totalAccountsCounter++;
										break;
										
									case 'b':
										//first before creating account it'll check for duplicate in service implementation
										System.out.println("For verification plz enter your email first");
										InputValidator.isValidEmail(sc.next(), arrayOfReference);
										System.out.println("----------------------");
										System.out.println("Enter details for saving acc.: AccountNumber CustomerName Balance and Email");
										bankServiceObj.CreateCurrentAccount(sc.next(),
												sc.next(),sc.nextDouble(),sc.next(), 
												arrayOfReference, index);
										System.out.println("Your current acc has been created");
										index++;
										totalAccountsCounter++;
										break;
										
									case 'c':
										subChoices=true;
										break;
										
									default: 
										System.out.println("Invalid Input");
										break;
								}
								
								//inner while ends
							}
							
							break;
						}
						
						case 2:{
							
							System.out.println("Option will be available with collections");
							break;
						}
						
						case 3:{
							bankServiceObj.display(arrayOfReference);
							break;
						}
						
						case 4:{
							System.out.println("Enter email:");
							bankServiceObj.checkBalance(arrayOfReference, sc.next());
							break;
						}
						
						case 5:{
							System.out.println("option under development");
							break;
						}
						
						case 6:{
							System.out.println("Exiting------");
							mainChoicesLoop = true;
							break;
						}
						default:
							System.out.println("Invalid Input");
							break;
					
					
						// here outer switch ended
					}
					
					//here while loop stops
				}
				
				//inner try ends
			}
//			catch(InsufficientFundsException e1) {
//				System.out.println(e1.getMessage());
//				
//			}
			catch(InvalidAccountException e2) {
				System.out.println(e2.getMessage());
			}
//			finally {
//				System.out.println("hiiiiiiii");
//			}
			
			//outer try ends
		}
	
	
	}

}
