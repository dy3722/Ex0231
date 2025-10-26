package com.example.ex0231.ex2;

public class MyTruck extends Truck{ //2 - second
    private String color;

    public MyTruck(int number, int age, int numberOfWheels, String steeringType, int pollutantEmissionsPerMinute, int numberOfMaxTrailers, int maxLoadingWeight, String color) {
        super(number, age, numberOfWheels, steeringType, pollutantEmissionsPerMinute, numberOfMaxTrailers, maxLoadingWeight);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() +
                "color=" + color + "\n";
    }
}
