package com.EmployeeService;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

import com.CustomEmployeeException.InvalidAadharNumberLengthException;
import com.CustomEmployeeException.InvalidPhoneNumberLengthException;
import com.EmployeesCore.Employees;
import com.EmployeesCore.FullTimeEmployee;
import com.EmployeesCore.PartTimrEmployee;

public class EmployeeServicesInterfaceImplementation implements EmployeeServicesInterface {

	Map<Integer, Employees> employeeMap = new HashMap<>();
	
	@Override
	public void AddFullTimeEmployee(String name, LocalDate joiningDate, long phoneNo, long aadharNumber,
			double monthlySalary) throws InvalidPhoneNumberLengthException{
		String tempLongVal = String.valueOf(phoneNo);
		if(tempLongVal.length()<10 || tempLongVal.length()>10) {
			throw new InvalidPhoneNumberLengthException("PhoneNumberInvalid!!");
		}
		else {
			Employees e = new FullTimeEmployee( name,  joiningDate,  phoneNo,  aadharNumber,
					 monthlySalary);
			employeeMap.put(e.getEmpId(), e);
		}
		
	}

	@Override
	public void AddPartTimeEmployee(String name, LocalDate joiningDate, long phoneNo, long aadharNumber,
			double hourlyRate) throws InvalidPhoneNumberLengthException{
		String tempLongVal = String.valueOf(phoneNo);
		if(tempLongVal.length()<10 || tempLongVal.length()>10) {
			throw new InvalidPhoneNumberLengthException("PhoneNumberInvalid!!");
		}
		else {
			Employees e = new PartTimrEmployee( name,  joiningDate,  phoneNo,  aadharNumber,
					hourlyRate);
			employeeMap.put(e.getEmpId(), e);
		}
		
		
	}

	@Override
	public void SearchEmployeeByAadhaarNo(long aadhaarNo) throws InvalidAadharNumberLengthException {
		
		String tempAadharNum = String.valueOf(aadhaarNo);
		if(tempAadharNum.length()<12 || tempAadharNum.length() >12) {
			throw new InvalidAadharNumberLengthException("Invalid Aadhaar number");
		}
		
			employeeMap.values().stream().filter(s->s.getAadharNumber()== aadhaarNo).
						forEach(s->System.out.println(s));
		
	}

	@Override
	public void DisplayAllEmpDetails() {
		employeeMap.values().forEach(s->System.out.println(s));		
	}

	@Override
	public void DisplayAllDetailsSortedDateOfJoining() {
		employeeMap.values().stream().sorted(Comparator.comparing(Employees::getJoiningDate)
				.reversed()).forEach(s->System.out.println(s));
		
	}

	@Override
	public void DeleteEmployee(int EmpId) {
			
		if(employeeMap.containsKey(EmpId)) {
			employeeMap.remove(EmpId);
		}
		
	}

	@Override
	public void DeleteEmployeeByAadhaar(long AadhaarNum) {
		Employees tempE = employeeMap.values().stream().
				filter(s->s.getAadharNumber()==AadhaarNum).findAny().orElseThrow(null);
		employeeMap.remove(tempE.getEmpId());
		
	}

}
