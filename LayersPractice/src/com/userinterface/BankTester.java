package com.userinterface;
import com.core.*;
import java.util.Scanner;
import com.service.bankService;
import com.service.bankServiceImplementation;
//import com.data.*;
import com.validation.*;

public class BankTester {

	public static void main(String[] args) {
		
		
		int index = 0;
		int counter = 0;
		boolean mainChoices = false;
		try(Scanner sc = new Scanner(System.in)){
			
			
			
//			ArrayOfReference AORobj =  new ArrayOfReference();//an object is being created to access the function(giving size)
			
			System.out.println("Enter the size of array: ");
			Account[] arrayOfReference = new Account[sc.nextInt()];
			bankService bankserviceObj = new bankServiceImplementation();

//			AORobj.givingSizeToArray(sc.nextInt());
			while(!mainChoices) {
				System.out.println("Enter your choice: 1. open account 2. close account(not working for now) "
						+ " 3. Display Account Details"
						+ " 4. Check Balance 5. Exit");
				switch(sc.nextInt()) {
				
				case 1:
					
					boolean subChoices=false;
					
					while(!subChoices) {
						
							System.out.println("which account you want to open: a. saving b. current c. Go back previous menu");
							
							switch(sc.next().charAt(0)) {
							
							case 'a':
								//first before creating account it'll check for duplicate in service implementation
								System.out.println("Enter details for saving acc.: AccountNumber CustomerName Balance and Email");
								bankserviceObj.CreateSavingAccount(sc.next(), sc.next(), sc.nextDouble(),sc.next(), arrayOfReference, index);
								System.out.println("Enter email first: ");
								InputValidator.isValidEmail(sc.next(), arrayOfReference);
								System.out.println("Your saving acc has been created");
								index++;
								break;
								
							case 'b':
								System.out.println("Enter details for current acc.: AccountNumber CustomerName Balance and Email");
								//first before creating account it'll check for duplicate in service implementation

								bankserviceObj.CreateCurrentAccount(sc.next(), sc.next(),sc.nextDouble(),sc.next(), arrayOfReference, index);
								System.out.println("Your current acc has been created");
								index++;
								break;
								
							case 'c':
								subChoices = true;
								break;
								
							}
					
						}
					
					
				case 2:
					//close account UI
					break;
					
				case 3: 
					
					bankserviceObj.displayAccounts(arrayOfReference);
					
					break;
					
				case 4:
					System.out.println();
					break;
				
				
				case 5:
					System.out.println("Exiting!!");
					mainChoices = true;
					break;
				
				default :
					System.out.println("Invalid input");
					}
			}
		
			
		}
		catch(Exception e) {
			System.out.println("There's an exception: " + e.getMessage());
			
		}
	
	
	}

}
