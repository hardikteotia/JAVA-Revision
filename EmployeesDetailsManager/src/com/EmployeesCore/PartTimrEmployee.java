

package com.EmployeesCore;

import java.time.LocalDate;

public class PartTimrEmployee extends Employees{
	private double hourlyRate;

	public PartTimrEmployee(String name, LocalDate joiningDate, long phoneNo, long aadharNumber, double hourlyRate) {
		super(name, joiningDate, phoneNo, aadharNumber);
		this.hourlyRate = hourlyRate;
	}

	@Override
	public String toString() {
		return "PartTimrEmployee [ " + super.toString() + "hourlyRate=" + hourlyRate + "]";
	}
	
	
}
