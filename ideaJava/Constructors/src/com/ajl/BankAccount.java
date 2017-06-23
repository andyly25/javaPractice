package com.ajl;

/**
 * Created by janly on 6/23/17.
 * NOTE! Shortcut to generate a lot of the getter and setters easily is to click on:
 * Code -> Generate -> choose option getters and setters -> select all fields you want then voila! it's made for you
 */
public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String PhoneNumber;

    public BankAccount(){
        //This is how you pass some default values, note this has to be very first line called
        this("12345", 2.50, "Default Name", "Default Address",
                "Default Phone Number");
        System.out.println("Empty constructor called");
    }

    // SHORTCUT: can go to Code -> Generate -> Constructors -> choose your options
    // Here I can have first two items default and the rest from user
    public BankAccount(String customerName, String email, String phoneNumber) {
        this("asdf123", 6.50, customerName, email, phoneNumber );
    }

    // General rule of thumb, don't call setters or any method other than another constructor within these
    // constructors
    public BankAccount(String accountNumber, double balance, String customerName, String email, String PhoneNumber){
        System.out.println("account constructor with parameters");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.PhoneNumber = PhoneNumber;
    }

    public void setAccountNumber(String account){
        this.accountNumber = account;
    }

    public  void setBalance(double balance){
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.PhoneNumber = phoneNumber;
    }

    public String getAccountNumber(){
        return this.accountNumber;
    }

    public double getBalance(){
        return this.balance;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public void deposit(double funds){
        this.balance += funds;
        System.out.println("After deposit you have: " + this.balance);
    }

    public void withdraw(double funds){
        // <= won't work if we want exactly 0 left over
        if((this.balance - funds) < 0){
            System.out.println("Sorry, the amount you want withdrawn exceeds the amount: " + this.balance);
        }else{
            this.balance -= funds;
            System.out.println("After withdrawal ou now have " + this.balance);
        }
    }
}
