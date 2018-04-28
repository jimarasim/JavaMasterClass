package com.jaemzware;

public class Main {

    public static void main(String[] args) {
        int myIntValue = 5 / 2;
        //float has width of 34
        float myFloatValue = 5f / 3f;
        //  double width of 64
        double myDoubleValue = 5d / 3d;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue =" + myDoubleValue);

        double numberOfPounds = 200d;
        double poundsPerKilogram = 0.45359237d;
        double numberOfKilograms = numberOfPounds * poundsPerKilogram;

        System.out.println(numberOfKilograms);

        double pi = 3.141_592_7d;

    }
}
