package com.BankingUserInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.BankingCore.BankAccount;
import com.BankingCustomException.InsufficientFundException;
import com.BankingCustomException.InvalidAccountException;
import com.BankingServices.BankAccountServices;
import com.BankingServices.BankAccountServicesImplementations;

public class BankAccountTester {

	public static void main(String[] args) {
		
		//Creating an List<ArrayList>
		List<BankAccount> accounts = new ArrayList<>();
		
		System.out.println("---Welcome to the Console based HDFC Banking---");
		
		try(Scanner sc = new Scanner(System.in)){
			//outer try block started from here
			
			try {
				//inner try block starts from here
				boolean outerChoices = false;
				BankAccountServices servicesObj =  new BankAccountServicesImplementations();
				
				while(!outerChoices) {
					//outerChoices loop starts here
					
					System.out.println("Enter your choice\n"
							+ "1. Open Account\r\n"
							+ "2. Close Account\r\n"
							+ "3. Display Account Details\r\n"
							+ "4. Check Balance\r\n"
							+ "5. Withdraw Amount\r\n"
							+ "6. Exit the Application"
							);
					switch(sc.nextInt()) {
						// outer switch starts from here
						
					case 1: 
							boolean innerChoice = false;
							while(!innerChoice) {
								//inner while starts from here
								System.out.println("Select your account type to open"
										+ "\na. Saving account"
										+ "\nb. Current account"
										+ "\nc. Go to the previous menu");
								switch(sc.next().charAt(0)) {
									//inner switch starts from here
									case 'a':
//										System.out.println("Enter email for validation");
										//method calling for email validation
										System.out.println("Enter Name, email, Minimum amount(2000)");
										servicesObj.openSavingAccount(sc.next(),
												sc.next(),
												sc.nextDouble(),
												accounts);
										System.out.println("Your Saving Account has been created!!!");
										break;
										
									case 'b':
//										System.out.println("Enter email for validation");
										//method calling for email validation
										System.out.println("Enter Name, email, Minimum amount(2000)");
										servicesObj.openCurrentAccount(sc.next(),
												sc.next(),
												sc.nextDouble(),
												accounts);
										System.out.println("Your Current Account has been created!!!");
										break;
										
									case 'c':
										innerChoice = true;
										break;
										
									default:
										System.out.println("INVALID INPUT");
										break;
									//inner switch ends here
								}
								//inner while ends here
							}
						break;
						
					case 2:
						System.out.println("Option Under development");
						break;
					case 3: 
						System.out.println("Enter your email for validation");
						servicesObj.displayAccountDetails(sc.next(), accounts);
						break;
					case 4: 
						break;
					case 5: 
						break;
						
					case 6:
						outerChoices= true;
						System.out.println("THANK YOU--PROGRAM EXITING...:D");
						break;
						
					default:
						System.out.println("INVALID INPUT!!!");
						break;
					
						// outer switch ends here
					}
					
					//outerChoices loop ends here
				}
				
				//inner try block ends here
			}
			catch(InvalidAccountException e ) {
				System.out.println(e.getMessage());
			}
			
			//outer try block ended here
		}
		
	}

}
