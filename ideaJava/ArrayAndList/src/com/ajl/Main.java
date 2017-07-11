package com.ajl;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * arrays is similar to a list in that it is a sequence of values
 */

public class Main {

    private static Scanner s = new Scanner(System.in);
    private static int[] baseData = new int[5];
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
//        System.out.println("Enter 10 ints: ");
//        getInput(baseData.length);
//        printArray(baseData);
//        resizeArray(baseData.length);

//        System.out.println("Enter how many ints you'd like ");
//        int someNumber = s.nextInt();
//        resizeArray(someNumber);
//        System.out.println("enter " + someNumber+  " ints: ");
//        getInput(someNumber);
//        printArray(baseData);


        System.out.println("Enter how many ints you like ");
        int num = s.nextInt();
        System.out.println("now enter " + num + " ints");
        getUserNeeds(num);

        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit){
            System.out.println("Enter your choice ");
            choice = s.nextInt();
            s.nextLine();
            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit = true;
                    break;
            }
        }
    }

    private static void getUserNeeds(int num){
        resizeArray(num);
        getInput(num);
        printArray(baseData);
    }

    private static void getInput(int someNumber){
        for(int i = 0; i < someNumber; i++){
            baseData[i] = s.nextInt();
        }
    }

    private static void printArray(int[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    private static void resizeArray(int someNumber){
        int[] original = baseData;
        baseData = new int[someNumber];
        if(original.length > baseData.length){
            for (int i =0; i < baseData.length; i++){
                baseData[i] = original[i];
            }
        }else {
            for (int i = 0; i < original.length; i++) {
                baseData[i] = original[i];
            }
        }
    }

    public static void printInstructions(){
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print list of grocery items");
        System.out.println("\t 2 - to add item to list");
        System.out.println("\t 3 - To modify an item in list");
        System.out.println("\t 4 - To remove an item from list");
        System.out.println("\t 5 - To search for item in list");
        System.out.println("\t 6 - to quit app");
    }

    public  static void addItem(){
        System.out.println("Please enter grocery item");
        groceryList.addGroceryItem(s.nextLine());
    }

    public static void modifyItem(){
        System.out.println("Current item name: ");
        String itemNo = s.nextLine();
        System.out.println("Enter replacement item: ");
        String newItem = s.nextLine();
        groceryList.modifyGroceryItem(itemNo, newItem);
    }

    public static void removeItem(){
        System.out.println("Enter item name: ");
        String itemNo = s.nextLine();
        groceryList.removeGroceryItem(itemNo);
    }

    public static void searchForItem(){
        System.out.println("Item to search for: ");
        String searchItem = s.nextLine();
        if(groceryList.onFile(searchItem)){
            System.out.println("Found " + searchItem + " in our grocery list");
        }else {
            System.out.println(searchItem + " is not in shopping list.");
        }
    }

    //copy one arraylist to another one
    public static void processArrayList(){
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(groceryList.getGroceryList());

        // you can even do this way which is a little faster.
        ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());

        // If you want to take the contents of the array lists and convert that back to a reg array.
        String [] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);
    }

}
