package com.ajl;

import java.util.ArrayList;

/**
 * Created by janly on 7/14/17.
 * This version will also store a phone number.
 * Following along the solution provided now
 */
public class MobilePhone2 {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone2(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    // We're sending in a contact object which has been created outside of this method
    public boolean addNewContact(Contact contact){
        if(findContact(contact.getName())>=0){
            System.out.println();
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        int foundPosition = findContact(oldContact);
        if(foundPosition<0){
            System.out.println(oldContact.getName() + ", was not found.");
            return false;
        }
        this.myContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + ", was replaced with " + newContact.getName());
        return true;
    }

    public boolean removeContact(Contact contact){
        int foundPosition = findContact(contact);
        if(foundPosition<0){
            System.out.println(contact.getName() + ", was not found.");
            return false;
        }
        this.myContacts.remove(foundPosition);
        System.out.println(contact.getName() + " was deleted");
        return true;
    }

    private int findContact(Contact contact){
        return this.myContacts.indexOf(contact);
    }

    // go through the contacts 1 by 1 and compare to see if we find a match
    private int findContact(String contactName){
        for(int i=0; i<this.myContacts.size(); i++){
            Contact contact = this.myContacts.get(i);
            if(contact.getName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }

    public String queryContact(Contact contact){
        if(findContact(contact)>=0){
            return contact.getName();
        }
        return null;
    }

    public Contact queryContact(String name) {
        int pos = findContact(name);
        if(pos >= 0){
            return this.myContacts.get(pos);
        }
        return null;
    }

    public void printContacts(){
        System.out.println("Contact list");
        for (int i=0; i<this.myContacts.size(); i++){
            System.out.println((i+1) + ". " +
                    this.myContacts.get(i).getName() + " ->" +
                    this.myContacts.get(i).getPhoneNumber());
        }
    }

}

