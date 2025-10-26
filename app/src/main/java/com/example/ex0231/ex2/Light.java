package com.example.ex0231.ex2;

public class Light extends Vehicles{ //1.3
    private boolean isEngine;

    public Light(int number, int age, int numberOfWheels, String steeringType, int pollutantEmissionsPerMinute, boolean isEngine) {
        super(number, age, numberOfWheels, steeringType, pollutantEmissionsPerMinute);
        this.isEngine = isEngine;
    }

    public boolean isEngine() {
        return isEngine;
    }

    public void setEngine(boolean engine) {
        isEngine = engine;
    }

    @Override
    public String toString() {
        return super.toString() +
                "isEngine=" + isEngine + "\n";
    }
}
