package com.cdac.service;

import com.cdac.core.Customer;
import com.cdac.core.Plans;
import com.cdac.exception.CustomerException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import static com.cdac.validation.CustomerValidation.*;

public class CustomerServiceImpl implements CustomerServiceInterface{
    List<Customer> customerList = new ArrayList<>();


    @Override
    public String RegisterUser(int accountnumber, String name, String email, int password, String plan, String date, int regamount) throws CustomerException {
        Customer c = validateuser(accountnumber,name,email,password,plan,date,regamount,customerList);
        customerList.add(c);
        return "Customer registered succesfully!!!";
    }

    @Override
    public void displayAllCustomers() {
        customerList.forEach(customer -> System.out.println(customer));
    }

    @Override
    public String login(String email, int password) throws CustomerException {
        Customer c = validatelogin(email,password,customerList);
        return "Login Succesfull , Welcome "+c.getName();
    }

    @Override
    public String changepassword(String email, int oldpassword, int newpassword) throws CustomerException {
        Customer existingValidCustomer = validatelogin(email,oldpassword,customerList);
        existingValidCustomer.setPassword(newpassword);
        return "Password Changed succesfully";
    }

    @Override
    public void deleteCustomer(String email, int password) throws CustomerException {
        Customer c = validatelogin(email,password,customerList);
        customerList.remove(c);
        System.out.println("Customer deleted succesfully");
    }
}