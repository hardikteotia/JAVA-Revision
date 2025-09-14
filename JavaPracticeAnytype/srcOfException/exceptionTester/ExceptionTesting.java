package exceptionTester;
import customException.MyException;
import java.util.Scanner;

public class ExceptionTesting {
	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)){
		System.out.println("Enter two integers");
		int res = sc.nextInt()/sc.nextInt();
		
		
		}
		catch( Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}
}
