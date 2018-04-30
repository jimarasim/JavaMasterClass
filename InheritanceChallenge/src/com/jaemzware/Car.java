package com.jaemzware;

public class Car extends Vehicle{
    private int transmissionType;

    public Car(int color, int length, int width, int transmissionType) {
        super(color, length, width);
        this.transmissionType = transmissionType;
    }

    public int getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(int transmissionType) {
        this.transmissionType = transmissionType;
    }


    private void shiftGears(int gear){
        System.out.println("Car.shiftGears() called." + gear);
    }

    @Override
    public void move(int speed, int direction) {

        if(transmissionType != 0) {
            if(speed < 10) {
                shiftGears(1);
            } else if(speed >= 10 && speed < 20) {
                shiftGears(2);
            } else if(speed >= 20 && speed < 30) {
                shiftGears(3);
            } else {
                shiftGears(4);
            }
        }
        super.move(speed, direction);
    }
}
