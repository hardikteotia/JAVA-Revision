package exceptionTester;

import java.util.Scanner;

import ValidationPackage.pollutionValidation;
import customException.MyPollutionCustomException;

public class pollutionTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(Scanner sc = new Scanner(System.in)){
			try {
				System.out.println("Enter the pollution level: ");
				pollutionValidation.ValidatePolution(sc.nextInt());
				System.out.println("your vehicle is under pollution level");
			}
			catch (MyPollutionCustomException e) {
				System.out.println(e.getMessage());
			}
		}
		

	}

}
