package com.cdac.core;

import java.time.LocalDate;

public class Customer {
    private int accountnumber;
    private String name;
    private String email;
    private int password;
    private Plans plan;
    private LocalDate date;
    private int Regamount;

    public Customer(){}

    public Customer(int accountnumber, String name, String email, int password, Plans plan, LocalDate date, int regamount) {
        this.accountnumber = accountnumber;
        this.name = name;
        this.email = email;
        this.password = password;
        this.plan = plan;
        this.date = date;
        Regamount = regamount;
    }

    public Customer(String email) {
        this.email = email;
    }

    public int getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(int accountnumber) {
        this.accountnumber = accountnumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public Plans getPlan() {
        return plan;
    }

    public void setPlan(Plans plan) {
        this.plan = plan;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getRegamount() {
        return Regamount;
    }

    public void setRegamount(int regamount) {
        Regamount = regamount;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "accountnumber=" + accountnumber +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password=" + password +
                ", plan=" + plan +
                ", date=" + date +
                ", Regamount=" + Regamount +
                '}';
    }

    @Override
    public boolean equals(Object o){
        if (o instanceof Customer){
            Customer c = (Customer) o;
            return this.email.equals(c.email);
        }
        return false;
    }
}