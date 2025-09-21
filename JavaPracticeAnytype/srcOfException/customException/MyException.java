package customException;

public class MyException extends Exception{
	
	public MyException(String message) {
		super(message);
	}
	
	public void InsufficientFunds() {
		System.out.println("In LowBalanceFunction!!!");
	}
	
}
