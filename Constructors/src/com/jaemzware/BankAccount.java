package com.jaemzware;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNumber;

    public BankAccount() {
        this("55555",2.50,"jon doe","jon@doe.com","800-555-1212");
        System.out.println("empty constructor called");
    }

    public BankAccount(String accountNumber, double balance, String customerName, String customerEmail, String customerPhoneNumber) {
        System.out.println("parameter constructor called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public BankAccount(String customerName, String customerEmail, String customerPhoneNumber) {
        this("99999",2.50,customerName,customerEmail,customerPhoneNumber);
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.customerEmail = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.customerPhoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getEmail() {
        return this.customerEmail;
    }

    public String getPhoneNumber() {
        return this.customerPhoneNumber;
    }

    public double depositFunds(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Amount deposited:" + depositAmount + " New balance:" + this.balance);
        return this.balance;
    }

    public double withdrawFunds(double withdrawlAmount) {
        if (this.balance - withdrawlAmount < 0) {
            System.out.println("insufficient funds to withdrawl " + withdrawlAmount + ", only " + this.balance + " available");
        } else {
            this.balance -= withdrawlAmount;
            System.out.println("Amount withdrawn:" + withdrawlAmount + " New balance:" + this.balance);
        }
        return this.balance;
    }
}
