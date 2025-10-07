

package com.EmployeeTester;

import java.time.LocalDate;
import java.util.Scanner;

import com.CustomEmployeeException.InvalidAadharNumberLengthException;
import com.CustomEmployeeException.InvalidPhoneNumberLengthException;
import com.EmployeeService.EmployeeServicesInterface;
import com.EmployeeService.EmployeeServicesInterfaceImplementation;

public class Tester1 {
	
	public static void main(String [] args) {
		
		boolean loopFlag = false;
		EmployeeServicesInterface serviceObj =  new EmployeeServicesInterfaceImplementation();
		System.out.println("Welcome to the Employees Manager MENU-------\n");
		System.out.println("Enter your choices: \n"
				+ "1. Add Full time employee\n"
				+ "2. Add Part time employee\n"
				+ "3. Delete an employee by Id\n"
				+ "4. Search Employee details by aadhaar number\n"
				+ "5. Display All employees details\n"
				+ "6. Display All employees details sorted on Date of Joining\n"
				+ "7. DeleteEmployee by AadhaarNumber\n"
				+ "8. Exit");
		try(Scanner sc = new Scanner(System.in)){
			
			while(!loopFlag) {
				// while starts
					try {
						//inner try starts
						System.out.println("Enter the values:");
						switch(sc.nextInt()) {
							//switch starts
							case 1:
								System.out.println("Enter details: name, joiningDate "
										+ "phoneNo, aadharNumber, monthlySalary");
								serviceObj.AddFullTimeEmployee(sc.next(), LocalDate.parse(sc.next()),
										sc.nextLong(), sc.nextLong(), sc.nextDouble());
								System.out.println("Employee Added");
								break;
								
							case 2:
								System.out.println("Enter details: name, joiningDate "
										+ "phoneNo, aadharNumber, HourlyRate");
								serviceObj.AddPartTimeEmployee(sc.next(), LocalDate.parse(sc.next()),
										sc.nextLong(), sc.nextLong(), sc.nextDouble());
								System.out.println("Employee Added");
								break;
								
							case 3:
								System.out.println("Enter Employee ID: ");
								serviceObj.DeleteEmployee(sc.nextInt());
								System.out.println("Employee Deleted");
								break;
								
							case 4:
								System.out.println("Enter aadhar number: ");
								serviceObj.SearchEmployeeByAadhaarNo(sc.nextLong());
								break;
								
							case 5:
								System.out.println("All Employees are-------");
								serviceObj.DisplayAllEmpDetails();
								break;
								
							case 6:
								System.out.println("Details in Sorted Order Employee DOJ------");
								serviceObj.DisplayAllDetailsSortedDateOfJoining();
								break;
							
							case 7:
								System.out.println("Enter aadhaar number: ");
								serviceObj.DeleteEmployeeByAadhaar(sc.nextLong());
								break;
								
							case 8:
								loopFlag = true;
								System.out.println("Byeeee");
								break;	
								
							default:
								System.out.println("Invalid Input!!!!!");
								break;
							//switch ends
						}
						//inner try ends
					}
					catch(InvalidPhoneNumberLengthException ph) {
						System.out.println(ph.getMessage());
					}
					catch(InvalidAadharNumberLengthException ad) {
						System.out.println(ad.getMessage());
					}
				//while ends
			}
				
		}
		
		
	}
}
