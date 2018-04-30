package com.jaemzware;

public class Main {

    public static void main(String[] args) {
//        BankAccount myAccount = new BankAccount("43413434",0.01,"James Fredson","james@fredson.com","888-555-1212");
        BankAccount myAccount = new BankAccount();
        System.out.println(myAccount.getAccountNumber());
        System.out.println(myAccount.getBalance());
        System.out.println(myAccount.getCustomerName());
        System.out.println(myAccount.getEmail());
        System.out.println(myAccount.getPhoneNumber());
        myAccount.withdrawFunds(1);
        myAccount.setBalance(100.00);

        myAccount.depositFunds(400.00);
        myAccount.withdrawFunds(501.00);
        myAccount.withdrawFunds(100.00);
        myAccount.withdrawFunds(myAccount.getBalance());

        BankAccount jimsAccount = new BankAccount("jim","jim@jim.com","222222222");

        VipCustomer defaultCustomer = new VipCustomer();
        VipCustomer bobCustomer = new VipCustomer("bob", "bob@bob.com");
        VipCustomer seanCustomer = new VipCustomer("sean",20000.00, "sean@sean.com");

        printVipInfo(defaultCustomer);
        printVipInfo(bobCustomer);
        printVipInfo(seanCustomer);


    }

    public static void printVipInfo(VipCustomer vipAccount) {
        System.out.println("NAME:" + vipAccount.getName());
        System.out.println("CREDIT LIMIT:" + vipAccount.getCreditLimit());
        System.out.println("EMAIL:" + vipAccount.getEmail());
    }
}
