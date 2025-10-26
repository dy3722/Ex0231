package com.example.ex0231.ex2;

public class Truck extends Heavy{ //1.6
    private int maxLoadingWeight;

    public Truck(int number, int age, int numberOfWheels, String steeringType, int pollutantEmissionsPerMinute, int numberOfMaxTrailers, int maxLoadingWeight) {
        super(number, age, numberOfWheels, steeringType, pollutantEmissionsPerMinute, numberOfMaxTrailers);
        this.maxLoadingWeight = maxLoadingWeight;
    }

    public int getMaxLoadingWeight() {
        return maxLoadingWeight;
    }

    public void setMaxLoadingWeight(int maxLoadingWeight) {
        this.maxLoadingWeight = maxLoadingWeight;
    }

    @Override
    public double exhaust() //5
    {
        return super.exhaust() * 1.5;
    }

    @Override
    public String toString() {
        return super.toString() +
                "maxLoadingWeight=" + maxLoadingWeight + "\n";
    }
}
