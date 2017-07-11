package com.ajl;

import java.util.ArrayList;

/**
 * Created by janly on 7/11/17.
 */
public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item){
        groceryList.add(item);
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void printGroceryList(){
        System.out.println("You have " + groceryList.size() + " items in grocery list.");
        for(int i=0; i<groceryList.size(); i++){
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(String currentItem, String newItem){
        int position = findItem(currentItem);
        if(position>=0){
            modifyGroceryItem(position, newItem);
        }
    }

    private void modifyGroceryItem(int pos, String newItem){
        groceryList.set(pos, newItem);
        System.out.println("Grocery item " + (pos+1) + " has been modified");
    }

    public void removeGroceryItem(String item){
        int position = findItem(item);
        if(position>=0){
            removeGroceryItem(position);
        }
    }

    private void removeGroceryItem(int pos){
        groceryList.remove(pos);
    }

    private int findItem(String searchItem){
        return groceryList.indexOf(searchItem);

    }

    public boolean onFile(String searchItem){
        int pos = findItem(searchItem);
        if(pos >=0){
            return true;
        }
        return false;
    }
}
