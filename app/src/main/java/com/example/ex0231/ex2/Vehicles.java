package com.example.ex0231.ex2;

public class Vehicles { //1.1
    private int number;
    private int age;
    private int numberOfWheels;
    private String steeringType;
    private int pollutantEmissionsPerMinute;

    public Vehicles(int number, int age, int numberOfWheels, String steeringType, int pollutantEmissionsPerMinute) {
        this.number = number;
        this.age = age;
        this.numberOfWheels = numberOfWheels;
        this.steeringType = steeringType;
        this.pollutantEmissionsPerMinute = pollutantEmissionsPerMinute;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public String getSteeringType() {
        return steeringType;
    }

    public void setSteeringType(String steeringType) {
        this.steeringType = steeringType;
    }

    public int getPollutantEmissionsPerMinute() {
        return pollutantEmissionsPerMinute;
    }

    public void setPollutantEmissionsPerMinute(int pollutantEmissionsPerMinute) {
        this.pollutantEmissionsPerMinute = pollutantEmissionsPerMinute;
    }

    public double exhaust() //3
    {
        return pollutantEmissionsPerMinute * 60;
    }

    public String toString() {
        return  "number=" + number + "\n" +
                ", age=" + age + "\n" +
                ", numberOfWheels=" + numberOfWheels + "\n" +
                ", steeringType='" + steeringType + "\n" +
                ", pollutantEmissionsPerMinute=" + pollutantEmissionsPerMinute + "\n";
    }
}
