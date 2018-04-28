package com.jaemzware;

public class Main {

    public static void main(String[] args) {

        int value = 5;

        switch(value) {
            case 1:
                System.out.println("value is 1");
                break;
            case 2:
                System.out.println("value is 2");
                break;
            case 3:
                System.out.println("value is 3");
                break;
            case 4: case 5: case 6:
                System.out.println("was 4 5 or 6");
                break;
            default:
                System.out.println("value is not 1 2 or 3");
                break;
        }

        checkForCharacters('A');
        checkForCharacters('B');
        checkForCharacters('C');
        checkForCharacters('D');
        checkForCharacters('E');
        checkForCharacters('#');
        checkForCharacters('\u0032');

        checkMonth("january");
        checkMonth("february");
        checkMonth("JANUARY");

    }

    public static void checkForCharacters(char c) {
        switch(c) {
            case 'A':
                System.out.println("you sent A");
                break;
            case 'B':
                System.out.println("you sent B");
                break;
            case 'C':
                System.out.println("you sent C");
                break;
            case 'D':
                System.out.println("you sent D");
                break;
            case 'E':
                System.out.println("you sent E");
                break;
            default:
                System.out.println("you did not send one of the predefined characters:" + c);
                break;

        }
    }

    public static void checkMonth(String month) {
        switch(month.toLowerCase()) {
            case "january":
                System.out.println("sent january");
                break;
            case "february":
                System.out.println("sent february");
                break;
            default:
                System.out.println("not january of february");
                break;
        }
    }
}
