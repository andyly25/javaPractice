package com.ajl;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("Chase");
        bank.addBranch("something");
        bank.addCustomer("something", "bob", 30);
        bank.addCustomer("something", "bill", 212.12);
        bank.addCustomer("something", "baka", 999.99);

        bank.addBranch("American");
        bank.addCustomer("American", "sam", 55.55);

        bank.addCustomerTransaction("something", "bob", 28.71);
        bank.addCustomerTransaction("something", "bob", 12.31);
        bank.addCustomerTransaction("something", "baka", 8.71);

        bank.listCustomers("something", true);
        bank.listCustomers("American", true);

//        bank.addBranch("Mallo");

        if(!bank.addCustomer("Mallo", "bala", 4.22)){
            System.out.println("Mallo DOes not exist.");
        }

        if(!bank.addBranch("something")){
            System.out.println("something already exists");
        }

        if(!bank.addCustomerTransaction("something", "billybob", 12.41)){
            System.out.println("Customer doesn't exist");
        }
    }
}
