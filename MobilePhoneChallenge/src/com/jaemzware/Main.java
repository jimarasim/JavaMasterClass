package com.jaemzware;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone();

    public static void main(String[] args) {
	    while(true) {
	        System.out.println("0: exit, 1: store, 2: modify, 3: remove, 4: query, 5: print");

	        String strchoice = scanner.nextLine();
	        int choice;

	        try{
	            choice = Integer.parseInt(strchoice);
            } catch (Exception ex) {
                System.out.println("INVALID OPTION");
                continue;
            }

	        if(choice == 0) {
	            break;
            } else {
                switch (choice) {
                    case 1:
                        storeNumber();
                        break;
                    case 2:
                        modifyNumber();
                        break;
                    case 3:
                        removeNumber();
                        break;
                    case 4:
                        queryNumber();
                        break;
                    case 5:
                        printNumbers();
                        break;
                    default:
                        System.out.println("INVALID OPTION");
                        break;
                }
            }
        }
    }

    private static void storeNumber(){
        System.out.println("ENTER NAME:\r");
        String name = scanner.nextLine();
        System.out.println("ENTER NUMBER:\r");
        String number = scanner.nextLine();

        mobilePhone.store(name,number);

    }
    private static void modifyNumber(){
        System.out.println("ENTER EXISTING NAME:\r");
        String existingName = scanner.nextLine();
        System.out.println("ENTER NEW NAME:\r");
        String newName = scanner.nextLine();
        System.out.println("ENTER NEW NUMBER:\r");
        String newNumber = scanner.nextLine();

        mobilePhone.modify(existingName, newName, newNumber);
    }
    private static void removeNumber(){
        System.out.println("ENTER EXISTING NAME:\r");
        String existingName = scanner.nextLine();

        mobilePhone.remove(existingName);
    }
    private static void queryNumber(){
        System.out.println("ENTER NAME:\r");
        String name = scanner.nextLine();

        mobilePhone.query(name);
    }
    private static void printNumbers(){
        mobilePhone.print();
    }



}
