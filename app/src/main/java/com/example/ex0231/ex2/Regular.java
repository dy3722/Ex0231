package com.example.ex0231.ex2;

public class Regular extends Vehicles{ //1.4
    private int numberOfPassengers;

    public Regular(int number, int age, int numberOfWheels, String steeringType, int pollutantEmissionsPerMinute, int numberOfPassengers) {
        super(number, age, numberOfWheels, steeringType, pollutantEmissionsPerMinute);
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    @Override
    public double exhaust() //6
    {
        return super.exhaust() * 1.2;
    }

    public void noise() //7
    {
        System.out.println(80);
    }

    public void hitchhikers() //8
    {
        System.out.println(4);
    }

    @Override
    public String toString() {
        return super.toString() +
                "numberOfPassengers=" + numberOfPassengers + "\n";
    }
}
