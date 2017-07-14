package com.ajl;

import java.util.ArrayList;

/**
 * Created by janly on 7/13/17.
 * this class holds an arraylist of contacts
 * has to be able to store, modify, remove and query contact names
 * this is the original one I made using the previous lesson as an example
 */

public class MobilePhone {
    private ArrayList<String> contacts = new ArrayList<String>();

    public void storeContact (String contact){
        contacts.add(contact);
    }

    public void modifyContact (String current, String contact){
        int pos = queryContact(current);
        if(pos>=0){
            contacts.set(pos, contact);
        }
    }

    public void modifyContact (int pos, String contact){
        if(pos>=0){
            contacts.set(pos, contact);
        }
    }

    public void removeContact (String contact){
        int pos = queryContact(contact);
        if(pos>=0){
            contacts.remove(pos);
        }
    }

    public void removeContact(int pos){
        if(pos>=0){
            contacts.remove(pos);
        }
    }

    public void printContacts (){
        System.out.println("Here is your " + contacts.size() + " contacts.");
        for(int i=0; i<contacts.size(); i++){
            System.out.println((i+1) + ". " + contacts.get(i) );
        }
    }

    private int queryContact(String contact){
        return contacts.indexOf(contact);
    }

    public boolean isThere(String contact){
        int pos = queryContact(contact);
        if(pos>=0) {
            return true;
        }else{
            return false;
        }
    }
}
