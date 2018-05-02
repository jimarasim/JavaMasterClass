package com.jaemzware;

class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public void startEngine() {
        System.out.println("turn key to start engine");
    }

    public void accelerate() {
        System.out.println("press gas pedal to accelerate");
    }

    public void brake() {
        System.out.println("press brake pedal");
    }
}

class Toyota extends Car {
    public Toyota() {
        super("Toyota Camry", 6);
    }
}

class Tesla extends Car {
    public Tesla() {
        super("Tesla Space", 8);
    }

    @Override
    public void startEngine() {
        System.out.println("push button to start engine");
    }
}

class Subaru extends Car {
    public Subaru() {
        super("Subaru Forester", 4);
    }
}

public class Main {

    public static void main(String[] args) {
	    Car[] cars = new Car[3];
	    cars[0] = new Toyota();
	    cars[1] = new Tesla();
	    cars[2] = new Subaru();

	    for(Car car: cars) {
	        car.startEngine();
	        car.accelerate();
	        car.brake();
        }
    }
}
