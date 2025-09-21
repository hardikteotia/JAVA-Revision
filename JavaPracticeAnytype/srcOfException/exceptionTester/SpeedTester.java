package exceptionTester;
import java.util.Scanner;

import ValidationPackage.VehicleValidation;
import customException.SpeedOutOfRangeException;
public class SpeedTester {

	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)){
			
			try {
				System.out.println("Enter the speed");
				VehicleValidation.speedValidation(sc.nextInt());//of throws error then go to catch block
				System.out.println("Keep going youre Going great");
			}
			catch (SpeedOutOfRangeException e){
				
//				System.out.println(e.toString());
				System.out.println(e.getMessage());
			}
			
			
		}
	}

}
