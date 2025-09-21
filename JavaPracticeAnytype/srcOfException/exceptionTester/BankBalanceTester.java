package exceptionTester;
import java.util.Scanner;

import ValidationPackage.BankBalanceValidation;
import customException.InsufficientFundsException;

//import ExceptionCorePackage.CoreClass;
/*
 * Asks the user to enter their account balance (e.g., 5000).

Then asks the user to enter the amount they want to withdraw.

If the withdrawal amount is more than the balance, throw a custom exception called InsufficientFundsException.

If the amount is valid, subtract it and show the remaining balance.

Use a try-catch block to handle the exception and show a friendly message.
 * */
public class BankBalanceTester {
	public static void main(String[] args) {
		
		
		try(Scanner sc = new Scanner(System.in)){
			
			try {
				System.out.println("Enter the Balance in your account: ");
				BankBalanceValidation b1 = new BankBalanceValidation(sc.nextDouble());
				System.out.println("Your updated balance is: " + b1.getBalance());
				System.out.println("Enter a amount to withdraw: ");
				BankBalanceValidation.checkBalance(sc.nextDouble());
				System.out.println("Amount has been debited "
						+ "your updated balance is: "+b1.getBalance());
			}
			catch(InsufficientFundsException e) {
				System.out.println(e.getMessage());
			}
		
		}
	}
}
