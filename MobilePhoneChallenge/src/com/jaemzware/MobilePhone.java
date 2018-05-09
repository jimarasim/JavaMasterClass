package com.jaemzware;

public class MobilePhone {
    private Contacts contacts = new Contacts();

    public void store(String name, String phoneNumber){
        contacts.storeContact(name, phoneNumber);
    }

    public void modify(String existingName, String newName, String newNumber){
        contacts.modifyContact(existingName, newName, newNumber);
    }

    public void remove(String existingName) {
        contacts.removeContact(existingName);
    }

    public void query(String name) {
        String number = contacts.queryNumber(name);
        System.out.println(number);
    }

    public void print() {
        contacts.printContacts();
    }
}
