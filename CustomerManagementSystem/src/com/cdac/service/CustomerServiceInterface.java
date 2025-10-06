package com.cdac.service;

import com.cdac.core.Plans;
import com.cdac.exception.CustomerException;

import java.time.LocalDate;

public interface CustomerServiceInterface {
    public String RegisterUser(int accountnumber, String name,
                             String email, int password, String plan, String date, int regamount) throws CustomerException;

    public void displayAllCustomers();

    public String login(String email, int password) throws CustomerException;

    public String changepassword(String email, int oldpassword , int newpassword) throws CustomerException;

    public void deleteCustomer(String email,int password) throws CustomerException;

}