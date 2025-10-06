package com.cdac.validation;

import com.cdac.core.Customer;
import com.cdac.core.Plans;
import com.cdac.exception.CustomerException;

import java.time.LocalDate;
import java.util.List;

public class CustomerValidation {
    public static Customer validateuser(int accountnumber, String name,
                                        String email, int password, String plan,
                                        String date, int regamount, List<Customer> customerList) throws CustomerException {
        validateDuplicateEmial(email,customerList);
        validateEmialSyntax(email);
        validatePlanCost(plan,regamount);
        Customer c = new Customer(accountnumber,name,email,password,Plans.valueOf(plan), LocalDate.parse(date),regamount);
        return c;
    }

    public static Customer validatelogin(String email, int password,List<Customer> customerList) throws CustomerException {
        Customer temp = new Customer(email);
        int index = customerList.indexOf(temp);
        if (index == -1){
            throw new CustomerException("Customer not found with entered email");
        }
        Customer c = customerList.get(index);
        if (!(c.getPassword()==password)){
            throw new CustomerException("Invalid password!!");
        }
        return c;
    }

    private static void validatePlanCost(String plan, int regamount) throws CustomerException {
        Plans myplan = Plans.valueOf(plan);
        if (!(myplan.getPlanvalue() == regamount)){
            throw new CustomerException("Plan amount does not match");
        }
    }
    private static void validateEmialSyntax(String email) throws CustomerException {
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        if (!(email.matches(regex))){
           throw new CustomerException("Enter a valid email syntax");
        }
    }

    private static void validateDuplicateEmial(String email, List<Customer> customerList) throws CustomerException {
        Customer temp = new Customer(email);
        if (customerList.contains(temp)){
            throw new CustomerException("Duplicate Customer found with entered email");
        }
    }
}