package ValidationPackage;

import customException.InsufficientFundsException;

public class BankBalanceValidation {
	
	
	private static double balance;
	
	public BankBalanceValidation(double Balance) {
		this.balance = Balance;
	}
	
	public static double getBalance() {
		return balance;
	}


	public static void setBalance(double incommingBalance) {
		balance = incommingBalance;
	}


	public static void checkBalance(double withdrawlAmount) throws InsufficientFundsException{
		if(withdrawlAmount > balance ) {
			throw new InsufficientFundsException(" withdrawl Amount is more than the minimum Balance");
		}
		else {
			setBalance(getBalance()-withdrawlAmount);
		}
	}
}
