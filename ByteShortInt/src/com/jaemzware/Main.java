package com.jaemzware;

public class Main {

    public static void main(String[] args) {
        byte b = 127;
        short s = 32767;
        int i = 500000;
        long l = 50000L + (10L * (b+s+i));
        short shortTotal = (short) (1000 + 10 * (b + s + i));
        System.out.println(l);
        System.out.println(shortTotal);
    }
}
