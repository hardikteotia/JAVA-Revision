package com.EmployeesCore;

import java.time.LocalDate;

public class FullTimeEmployee extends Employees{
	
	private double monthlySalary;

	public FullTimeEmployee(String name, LocalDate joiningDate,
							long phoneNo, long aadharNumber, double monthlySalary) {
		
		super(name, joiningDate, phoneNo, aadharNumber);
		this.monthlySalary = monthlySalary;
	}

	@Override
	public String toString() {
		return "FullTimeEmployee [ "+super.toString()+" monthlySalary=" + monthlySalary + "]";
	}
	
	
	
	


	
	
	
}
