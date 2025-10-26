package com.example.ex0231.ex2;

public class Cart extends Light{ //1.8
    private int chargingTime;

    public Cart(int number, int age, int numberOfWheels, String steeringType, int pollutantEmissionsPerMinute, boolean isEngine, int chargingTime) {
        super(number, age, numberOfWheels, steeringType, pollutantEmissionsPerMinute, isEngine);
        this.chargingTime = chargingTime;
    }

    public int getChargingTime() {
        return chargingTime;
    }

    public void setChargingTime(int chargingTime) {
        this.chargingTime = chargingTime;
    }

    @Override
    public double exhaust() //6
    {
        return super.exhaust() * 1.1;
    }
    public void hitchhikers() //8
    {
        System.out.println(1);
    }

    @Override
    public String toString() {
        return super.toString() +
                "chargingTime=" + chargingTime + "\n";
    }
}
