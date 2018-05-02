package com.jaemzware;

public class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super("Deluxe Burger", "Sesameseed Bun", "Beef Patty", 9.99);
    }

    @Override
    public double computePrice() {
        double total = super.computePrice();

        total += 3.0; //price for deluxe

        return total;
    }

    @Override
    public StringBuilder ingredients() {
        StringBuilder ingredients = super.ingredients();

        ingredients.append("Fries" + "\n");
        ingredients.append("Pop" + "\n");

        return ingredients;
    }
}
