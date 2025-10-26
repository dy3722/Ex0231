package com.example.ex0231.ex2;

public class MyCar extends Regular{ //2 - first
    private String color;

    public MyCar(int number, int age, int numberOfWheels, String steeringType, int pollutantEmissionsPerMinute, int numberOfPassengers, String color) {
        super(number, age, numberOfWheels, steeringType, pollutantEmissionsPerMinute, numberOfPassengers);
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
