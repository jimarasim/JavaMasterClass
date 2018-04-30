package com.jaemzware;

public class Skateboard {
    private Deck deck;
    private Trucks trucks;
    private Wheels wheels;

    public Skateboard(Deck deck, Trucks trucks, Wheels wheels) {
        this.deck = deck;
        this.trucks = trucks;
        this.wheels = wheels;
    }

    public Deck getDeck() {
        return deck;
    }

    public Trucks getTrucks() {
        return trucks;
    }

    public Wheels getWheels() {
        return wheels;
    }
}
