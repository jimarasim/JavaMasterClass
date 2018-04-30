package com.jaemzware;

public class Main {

    public static void main(String[] args) {
        //composition: skateboard has a relationship to deck, trucks and wheels, but does not inherit from them
	    Skateboard skateboard = new Skateboard(new Deck(30, 9), new Trucks(169), new Wheels(62, 95) );
        System.out.println("Skateboard. Deck:" +
	    skateboard.getDeck().getLength() + "x" +
        skateboard.getDeck().getWidth() + " Trucks:" +
        skateboard.getTrucks().getWidth() + " Wheels:" +
        skateboard.getWheels().getDurometer() + "," +
        skateboard.getWheels().getSize());

    }
}
