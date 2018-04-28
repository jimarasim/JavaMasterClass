package com.jaemzware;

public class Main {

    public static void main(String[] args) {
        for (double interest = 2; interest < 9; interest++) {
            System.out.println(String.format("%.2f", calculateInterest(10000, interest)));
        }

        for (double interest = 8; interest > 1; interest--) {
            System.out.println(String.format("%.2f", calculateInterest(10000, interest)));
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("i:" + i);
        }

        int primeNumbersFound = 0;
        for (int i=10; i < 50; i++) {
            if(isPrime(i)) {
                primeNumbersFound++;
                System.out.println(i + " is a prime number");
                if(primeNumbersFound==10) {
                    System.out.println("Three primes found");
                    break;
                }
            }
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= (long) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
