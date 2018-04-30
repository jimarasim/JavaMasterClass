package com.jaemzware;

public class Main {

    public static void main(String[] args) {
	    int count = 0;
	    while(count != 5) {
            System.out.println("count value:" + count);
            count++;
        }

        while(true) {
	        if(count == 10) {
	            break;
            }
            System.out.println("count:" + count);
            count++;
        }

        do{
            System.out.println("count do while:" + count);
            count++;
        }while(count < 20);

        System.out.println("isEvenNumber 34:" + isEvenNumber(34));
        System.out.println("isEvenNumber 35:" + isEvenNumber(35));

        int number = 4, bigNumber = 20, evenNumbers = 0;
        while(number <= bigNumber) {
            number++;
            if(!isEvenNumber(number)){
                continue;
            }

            System.out.println("even number: " + number);
            if(++evenNumbers == 5) {
                break;
            }
        }

        System.out.println("even numbers found:"  + evenNumbers);
    }

    public static boolean isEvenNumber(int n) {
        return n%2==0?true:false;
    }
}
