package com.example.ex0231.ex2;

public class Tractor extends Heavy{ //1.5
    private String typeOfTrailers;

    public Tractor(int number, int age, int numberOfWheels, String steeringType, int pollutantEmissionsPerMinute, int numberOfMaxTrailers, String typeOfTrailers) {
        super(number, age, numberOfWheels, steeringType, pollutantEmissionsPerMinute, numberOfMaxTrailers);
        this.typeOfTrailers = typeOfTrailers;
    }

    public String getTypeOfTrailers() {
        return typeOfTrailers;
    }

    public void setTypeOfTrailers(String typeOfTrailers) {
        this.typeOfTrailers = typeOfTrailers;
    }

    @Override
    public String toString() {
        return super.toString() +
                "typeOfTrailers=" + typeOfTrailers + "\n";
    }
}
