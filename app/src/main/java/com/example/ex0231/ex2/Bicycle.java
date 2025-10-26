package com.example.ex0231.ex2;

public class Bicycle extends Light{ //1.7
    private boolean isBasket;

    public Bicycle(int number, int age, int numberOfWheels, String steeringType, int pollutantEmissionsPerMinute, boolean isEngine, boolean isBasket) {
        super(number, age, numberOfWheels, steeringType, pollutantEmissionsPerMinute, isEngine);
        this.isBasket = isBasket;
    }

    public boolean isBasket() {
        return isBasket;
    }

    public void setBasket(boolean basket) {
        isBasket = basket;
    }

    @Override
    public String toString() {
        return super.toString() +
                "isBasket=" + isBasket + "\n";
    }
}
