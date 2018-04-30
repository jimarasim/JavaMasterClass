package com.jaemzware;

public class Vehicle {
    private int color;
    private int length;
    private int width;

    public Vehicle(int color, int length, int width) {
        this.color = color;
        this.length = length;
        this.width = width;
    }

    public void wheelDirection(int direction) {
        System.out.println("Car.wheelDirection() called." + direction);
    }

    public void move(int speed, int direction) {
        System.out.println("Vehicle.move() called.");
    }
}
