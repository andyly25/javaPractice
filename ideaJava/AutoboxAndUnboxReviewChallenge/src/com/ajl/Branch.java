package com.ajl;

import java.util.ArrayList;

/**
 * Created by janly on 7/18/17.
 * Here Branch contains two things: Name and an arraylist of customers
 */
public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    // Checks to see if this is a new customer, if it is, we add into the arraylist and return true
    public boolean newCustomer(String customerName, double initAmount){
        if(findCustomer(customerName)==null){
            this.customers.add(new Customer(customerName, initAmount));
            return true;
        }
        return false;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    // Here if the customer exists, we will add the customer's transaction amount in
    public boolean addCustomerTransaction(String customerName, double amt){
        Customer existingCustomer = findCustomer(customerName);
        if(existingCustomer != null){
            existingCustomer.addTransaction(amt);
            return true;
        }
        return false;
    }

    // here we create a function to check within our arraylist and see if the customer's name is within
    private Customer findCustomer (String customerName){
        for(int i=0; i<this.customers.size(); i++){
            Customer checkedCustomer = this.customers.get(i);
            if(checkedCustomer.getName().equals(customerName)){
                return checkedCustomer;
            }
        }
        return null;
    }
}
