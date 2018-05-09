package com.jaemzware;

import java.util.Scanner;

public class Main {

    private static int arrayLength = 5;

    public static void main(String[] args) {
	// write your code here

        int[] intArray = getIntegers();
        printArray(intArray);
        intArray = sortIntegers(intArray);
        printArray(intArray);
    }

    public static int[] getIntegers() {
        Scanner scanner = new Scanner(System.in);
        int[] intArray = new int[arrayLength];

        System.out.println("ENTER "+intArray.length+" NUMBERS \r");

        for(int i=0; i<intArray.length;i++) {
            intArray[i] = scanner.nextInt();
        }

        return intArray;
    }

    public static void printArray(int[] intArray) {
        String outputString = "";
        for(int i=0; i<intArray.length; i++) {
            outputString += intArray[i] + " ";
        }
        System.out.println(outputString);
    }

    public static int[] sortIntegers(int[] intArray) {
        int[] retArray = new int[intArray.length];

        for(int h=0; h<retArray.length; h++) {

            int highestNumber = 0;
            int highestIndex = 0;
            for (int i = 0; i < intArray.length; i++) {
                if (intArray[i] > highestNumber) {
                    highestNumber = intArray[i];
                    highestIndex = i;
                }
            }
            retArray[h] = highestNumber;
            intArray[highestIndex] = 0;
        }

        return retArray;
    }
}
