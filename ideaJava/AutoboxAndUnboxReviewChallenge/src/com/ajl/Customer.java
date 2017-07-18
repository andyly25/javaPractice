package com.ajl;

import java.util.ArrayList;

/**
 * Created by janly on 7/18/17.
 */
public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialTrans) {
        this.name = name;
        // remember to initialize the arraylist
        this.transactions = new ArrayList<Double>();
        addTransaction(initialTrans);
    }

    public void addTransaction(double amount){
        this.transactions.add(amount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
