package com.jaemzware;

public class Hamburger {
    private String name;
    private String breadType;
    private String meatType;
    private double basePrice;
    private boolean hasPickle;
    private boolean hasLettuce;
    private boolean hasTomato;
    private boolean hasOnion;

    public Hamburger(String name, String breadType, String meatType, double basePrice) {
        this.name = name;
        this.breadType = breadType;
        this.meatType = meatType;
        this.basePrice = basePrice;
    }

    public void setHasPickle(boolean hasPickle) {
        this.hasPickle = hasPickle;
    }

    public void setHasLettuce(boolean hasLettuce) {
        this.hasLettuce = hasLettuce;
    }

    public void setHasTomato(boolean hasTomato) {
        this.hasTomato = hasTomato;
    }

    public void setHasOnion(boolean hasOnion) {
        this.hasOnion = hasOnion;
    }

    public double computePrice() {
        double totalPrice = 0.0;
        totalPrice += basePrice;
        if (hasPickle) {
            totalPrice += 0.50;
        }
        if (hasLettuce) {
            totalPrice += 0.25;
        }
        if (hasTomato) {
            totalPrice += 1.0;
        }
        if (hasOnion) {
            totalPrice += 1.5;
        }

        return totalPrice;
    }

    public StringBuilder ingredients() {
        StringBuilder retVal = new StringBuilder();
        retVal.append(breadType + "\n");
        retVal.append(meatType + "\n");
        if (hasPickle) {
            retVal.append("Pickle \n");
        }
        if (hasLettuce) {
            retVal.append("Lettuce \n");
        }
        if (hasTomato) {
            retVal.append("Tomato \n");
        }
        if (hasOnion) {
            retVal.append("Onion \n");
        }

        return retVal;
    }

}
