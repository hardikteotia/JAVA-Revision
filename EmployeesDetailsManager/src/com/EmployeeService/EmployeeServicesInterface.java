/*
 * 1. Add Full time employee\n"
				+ "2. Add Part time employee\n"
				+ "3. Delete an employee by Id\n"
				+ "4. Search Employee details by aadhaar number\n"
				+ "5. Display All employees details\n"
				+ "6. Display All employees details sorted on Date of Joining\n*/

package com.EmployeeService;

import java.time.LocalDate;

import com.CustomEmployeeException.InvalidAadharNumberLengthException;
import com.CustomEmployeeException.InvalidPhoneNumberLengthException;

public interface EmployeeServicesInterface {
	
	public void AddFullTimeEmployee(String name, LocalDate joiningDate,
			long phoneNo, long aadharNumber, double monthlySalary) 
					throws InvalidPhoneNumberLengthException;
	
	public void AddPartTimeEmployee(String name, LocalDate joiningDate, long phoneNo, long aadharNumber,
			double hourlyRate) throws InvalidPhoneNumberLengthException;
	
	public void DeleteEmployee(int EmpId);
	
	public void DeleteEmployeeByAadhaar(long AadhaarNum);
	
	public void SearchEmployeeByAadhaarNo(long aadhaarNo) throws InvalidAadharNumberLengthException;
	
	public void DisplayAllEmpDetails();
	
	public void DisplayAllDetailsSortedDateOfJoining();
	
	
}
