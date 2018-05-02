package com.jaemzware;

public class HealthyBurger extends Hamburger {
    private boolean hasKale;
    private boolean hasCucumber;

    public HealthyBurger(boolean hasKale, boolean hasCucumber) {
        super("Healthy Burger", "Brown Rye", "Black Bean Patty", 7.99);
        this.hasKale = hasKale;
        this.hasCucumber = hasCucumber;
    }

    public void setHasKale(boolean hasKale) {
        this.hasKale = hasKale;
    }

    public void setHasCucumber(boolean hasCucumber) {
        this.hasCucumber = hasCucumber;
    }

    @Override
    public double computePrice() {
        double total = super.computePrice();

        if(hasKale) {
            total += 0.45;
        }
        if(hasCucumber) {
            total += 0.35;
        }

        return total;
    }

    @Override
    public StringBuilder ingredients() {
        StringBuilder ingredients = super.ingredients();

        if(hasKale) {
            ingredients.append("Kale" + "\n");
        }
        if(hasCucumber) {
            ingredients.append("Cucumber" + "\n");
        }

        return ingredients;
    }
}
