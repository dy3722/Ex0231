package com.example.ex0231.ex1;

public class Electronics extends Product{
    private String brand;

    public Electronics(String name, double price, String description, String brand) {
        super(name, price, description);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " and the brand is: " + this.brand;
    }
}
