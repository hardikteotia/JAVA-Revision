package exceptionTester;
import java.util.Scanner;

import ExceptionCorePackage.CoreClass;
/*
 * Asks the user to enter their account balance (e.g., 5000).

Then asks the user to enter the amount they want to withdraw.

If the withdrawal amount is more than the balance, throw a custom exception called InsufficientFundsException.

If the amount is valid, subtract it and show the remaining balance.

Use a try-catch block to handle the exception and show a friendly message.
 * */
public class ExceptionTesting {
	public static void main(String[] args) {
		
		int Amount;
		try(Scanner sc = new Scanner(System.in)){
		System.out.println("Enter the Balance in your account: ");
		CoreClass obj = new CoreClass(sc.nextInt());
		System.out.println("Enter a amount to withdraw: ");
		Amount = sc.nextInt();
		obj.withdraw(Amount);//it may throw the error
		}
		catch() {
			
		}
	}
}
