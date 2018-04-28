package com.jaemzware;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 500);
        System.out.println("new score is " + newScore);
        calculateScore(8000);
        calculateScore();

        System.out.println(calcFeetAndInchesToCentimeters(0, 13));
        System.out.println(calcFeetAndInchesToCentimeters(157));

    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("no player name no player score");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if(feet < 0) {
            return -1;
        } else if ((inches < 0) || (inches > 12)) {
            return -1;
        } else {
            return ((feet * 12) + inches) * 2.54;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if(inches < 0) {
            return -1;
        }

        double feet = inches / 12;
        double newInches = inches - feet * 12;

        return calcFeetAndInchesToCentimeters(feet, newInches);
    }

}
