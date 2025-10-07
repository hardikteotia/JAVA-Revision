/*Name, Date of joining, Phone Number, Aadhaar number*/

package com.EmployeesCore;

import java.time.LocalDate;

public class Employees {
	private static int totalEmployees=0;
	private static int nextEmpId = 100;
	
	private int empId;
	private String name;
	private LocalDate joiningDate;
	private long PhoneNo;
	private long aadharNumber;
	
	
	public Employees() {}
	
	public Employees(String name,
					 LocalDate joiningDate, long phoneNo,
					 long aadharNumber) {
	
		this.empId = nextEmpId++;
		this.name = name;
		this.joiningDate = joiningDate;
		PhoneNo = phoneNo;
		this.aadharNumber = aadharNumber;
		totalEmployees++;
	}
	
	
	public static int getTotalEmployees() {
		return totalEmployees;
	}
	public static void setTotalEmployees(int totalEmployees) {
		Employees.totalEmployees = totalEmployees;
	}
	public static int getNextEmpId() {
		return nextEmpId;
	}
	public static void setNextEmpId(int nextEmpId) {
		Employees.nextEmpId = nextEmpId;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(LocalDate joiningDate) {
		this.joiningDate = joiningDate;
	}
	public long getPhoneNo() {
		return PhoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		PhoneNo = phoneNo;
	}
	public long getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(long aadharNumber) {
		this.aadharNumber = aadharNumber;
	}


	@Override
	public String toString() {
		return "Employees [empId=" + empId + ", name=" + name + ", joiningDate=" + joiningDate + ", PhoneNo=" + PhoneNo
				+ ", aadharNumber=" + aadharNumber + "]";
	}
	


	
	
	
	
}
