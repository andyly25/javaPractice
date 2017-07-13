package com.ajl;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static Scanner s = new Scanner(System.in);
    private static MobilePhone phone = new MobilePhone();

    public static void main(String[] args) {
        boolean quit = false;
        printInstructions();
        int input = 0;
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
}
