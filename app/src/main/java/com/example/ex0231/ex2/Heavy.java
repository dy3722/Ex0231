package com.example.ex0231.ex2;

public class Heavy extends Vehicles{ //1.2
    private int numberOfMaxTrailers;

    public Heavy(int number, int age, int numberOfWheels, String steeringType, int pollutantEmissionsPerMinute, int numberOfMaxTrailers) {
        super(number, age, numberOfWheels, steeringType, pollutantEmissionsPerMinute);
        this.numberOfMaxTrailers = numberOfMaxTrailers;
    }

    public int getNumberOfMaxTrailers() {
        return numberOfMaxTrailers;
    }

    public void setNumberOfMaxTrailers(int numberOfMaxTrailers) {
        this.numberOfMaxTrailers = numberOfMaxTrailers;
    }

    @Override
    public double exhaust() //4
    {
        return super.exhaust() + 500 * numberOfMaxTrailers;
    }

    @Override
    public String toString() {
        return super.toString() +
                "numberOfMaxTrailers=" + numberOfMaxTrailers + "\n";
    }
}
