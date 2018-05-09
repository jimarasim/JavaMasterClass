package com.jaemzware;

public class Main {

    public static void main(String[] args) {
	    Hamburger hamburger = new Hamburger("Regular", "Plain Bun", "Beef", 5.0);
	    HealthyBurger healthyBurger = new HealthyBurger(true,true);
	    DeluxeBurger deluxeBurger = new DeluxeBurger();

	    hamburger.setHasLettuce(true);
	    hamburger.setHasTomato(true);
	    hamburger.setHasPickle(true);
	    healthyBurger.setHasOnion(true);

	    System.out.println(hamburger.ingredients().toString() +  hamburger.computePrice());
        System.out.println(deluxeBurger.ingredients().toString() +  deluxeBurger.computePrice());
        System.out.println(healthyBurger.ingredients().toString() +  healthyBurger.computePrice());
    }
}
