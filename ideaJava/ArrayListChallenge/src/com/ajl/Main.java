package com.ajl;

/**
 * If you uncomment the commented parts, it will be the solution that the instructor provided.
 * Note if you do so, you should comment out some of my code as well.
 */

//import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static Scanner s = new Scanner(System.in);
    private static MobilePhone phone = new MobilePhone();
    private static MobilePhone2 phone2 = new MobilePhone2("333 999 7771");

    public static void main(String[] args) {
        boolean quit = false;
//        startPhone();
//        printActions();
//
//        while(!quit){
//            System.out.println("\nEnter action: (6 to show options) ");
//            int action = s.nextInt();
//            s.nextLine();
//
//            switch (action){
//                case 0:
//                    System.out.println("\nShutting down...");
//                    quit = true;
//                    break;
//                case 1:
//                    phone2.printContacts();
//                    break;
//                case 2:
//                    addNewContact();
//                    break;
//                case 3:
//                    updateContact();
//                    break;
//                case 4:
//                    removeContact();
//                    break;
//                case 5:
//                    queryContact();
//                    break;
//                case 6:
//                    printActions();
//                    break;
//            }
//        }

        printInstructions();
        int input = 0;


        // Everything commented out is my version, now I'm to test out the solution
        while(!quit){


            try{
                System.out.println("Enter your choice");
                input = s.nextInt();
                s.nextLine();
                switch (input){
                    case 0:
                        printInstructions();
                        break;
                    case 1:
                        phone.printContacts();
                        break;
                    case 2:
                        newContact();
                        break;
                    case 3:
                        modifyContact();
                        break;
                    case 4:
                        removeContact();
                        break;
                    case 5:
                        queryContact();
                        break;
                    case 6:
                        quit = true;
                        break;
                    default:
                        System.out.println("Please input a number from 0-6");
                        break;
                }
            }catch (InputMismatchException e){
                System.out.println("Please enter NUMBERS only");
                // NOTE: when scanner throws InputMistmatchException, scanner will not pass the token
                // that caused the exception, so I need to consume the input, otherwise... infinite loop
                s.next();
            }

        }
    }

    public static void printInstructions(){
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print list of contacts");
        System.out.println("\t 2 - to add new contact");
        System.out.println("\t 3 - To modify contact");
        System.out.println("\t 4 - To remove contact");
        System.out.println("\t 5 - To search for contact");
        System.out.println("\t 6 - to quit app");
    }

    public static void newContact(){
        System.out.println("Enter new contact name: ");
        phone.storeContact(s.nextLine());
    }

    public static void modifyContact(){
        System.out.println("Enter contact you wish to modify: ");
        String oldContact = s.nextLine();
        if(phone.isThere(oldContact)){
            System.out.println("Enter what you'd like to change it to: ");
            String newContact = s.nextLine();
            phone.modifyContact(oldContact, newContact);
        }else{
            System.out.println("contact not found!");
        }
    }

    public static void removeContact(){
        System.out.println("Enter contact you wish to remove: ");
        String removal = s.nextLine();
        if(phone.isThere(removal)){
            phone.removeContact(removal);
        }else{
            System.out.println("Item not found! ");
        }
    }

    public static void queryContact(){
        System.out.println("Enter which contact you are looking for: ");
        String searching = s.nextLine();
        boolean searched = phone.isThere(searching);
        if(searched){
            System.out.println("The contact " + searching + " is there.");
        }else{
            System.out.println("Contact not found.");
        }

    }


//    //Here begins the solution's methods
//    private static void startPhone(){
//        System.out.println("Starting the phone...");
//    }
//
//    public static void printActions(){
//        System.out.println("\nAvailable actions: ");
//        System.out.println("\t 0 - To ShutDown.");
//        System.out.println("\t 1 - To print list of contacts");
//        System.out.println("\t 2 - to add new contact");
//        System.out.println("\t 3 - To modify contact");
//        System.out.println("\t 4 - To remove contact");
//        System.out.println("\t 5 - To query for contact");
//        System.out.println("\t 6 - to print list of available actions");
//        System.out.println("Choose your action: ");
//    }
//
//    private static void addNewContact(){
//        System.out.println("Enter new contact name: ");
//        String name = s.nextLine();
//        System.out.println("Enter phone number: ");
//        String phone = s.nextLine();
//        Contact newContact = Contact.createContact(name, phone);
//        if(phone2.addNewContact(newContact)){
//            System.out.println("New contact added: " + name + ", phone = " + phone);
//        }else{
//            System.out.println("cannot add, " + name);
//        }
//    }
//
//    private static void updateContact(){
//        System.out.println("Enter existing contact name");
//        String name = s.nextLine();
//        Contact existingContact = phone2.queryContact(name);
//        if(existingContact == null){
//            System.out.println("Contact not found.");
//            return;
//        }
//        System.out.println("Enter a new contact name: ");
//        String newName = s.nextLine();
//        System.out.println("Enter new contact phone number: ");
//        String newNumber = s.nextLine();
//        Contact newContact = Contact.createContact(newName, newNumber);
//        if(phone2.updateContact(existingContact, newContact)){
//            System.out.println("Update record success!");
//        }else{
//            System.out.println("Error in updating");
//        }
//    }
//
//    private static void removeContact() {
//        System.out.println("Enter existing contact name");
//        String name = s.nextLine();
//        Contact existingContact = phone2.queryContact(name);
//        if (existingContact == null) {
//            System.out.println("Contact not found.");
//            return;
//        }
//
//        if(phone2.removeContact(existingContact)){
//            System.out.println("Contact terminated");
//        }else{
//            System.out.println("Error deleting");
//        }
//    }
//
//    private static void queryContact() {
//        System.out.println("Enter existing contact name");
//        String name = s.nextLine();
//        Contact existingContact = phone2.queryContact(name);
//        if (existingContact == null) {
//            System.out.println("Contact not found.");
//            return;
//        }
//
//
//        System.out.println("NName: " + existingContact.getName() + " phone num is " + existingContact.getPhoneNumber());
//
//    }

}
