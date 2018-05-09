package com.jaemzware;

import java.util.ArrayList;

public class Contacts {
    private ArrayList<String> names = new ArrayList<String>();
    private ArrayList<String> phoneNumbers = new ArrayList<String>();

    public void storeContact(String name, String phoneNumber) {
        if(this.names.contains(name)) {
            System.out.println("Contact already exists");
            return;
        }

        this.names.add(name);
        this.phoneNumbers.add(phoneNumber);
        System.out.println(name + " added with number " + phoneNumber);

    }

    public void modifyContact(String existingName, String newName, String newNumber) {
        if(!names.contains(existingName)) {
            System.out.println("Not an existing contact");
            return;
        }

        int locator = names.indexOf(existingName);
        names.set(locator,newName);
        phoneNumbers.set(locator,newNumber);

        System.out.println(newName + " modified with number: " + newNumber);
    }

    public void removeContact(String existingName) {
        if(!names.contains(existingName)) {
            System.out.println("Not an existing contact");
            return;
        }
        int index = names.indexOf(existingName);
        names.remove(index);
        phoneNumbers.remove(index);

        System.out.println("CONTACT:" + existingName + " removed");
    }

    public void printContacts() {
        for(int i=0; i<names.size(); i++) {
            System.out.println("NAME:" + names.get(i) + " NUMBER:" + phoneNumbers.get(i));
        }
    }

    public String queryNumber(String name) {
        if(this.names.contains(name)) {
            int index = this.names.indexOf(name);
            return phoneNumbers.get(index);
        }
        else {
            System.out.println("Not a contact");
            return "";
        }
    }
}
