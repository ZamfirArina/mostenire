package com.company;
// classa Parinte pentru classa Geanta
public class Accesorii {
    private String model;
    private String brand;
    private float price;
    private String color;

    //Constructor
    Accesorii(String model, String brand, float price, String color) {
        this.model = model;
        this.brand = brand;
        this.price = price;
        this.color = color;

    }

    //getters
    public String getModel() {
        return this.model;
    }

    public String getBrand() {
        return this.brand;
    }

    public float getPrice() {
        return this.price;
    }

    public String getColor() {
        return this.color;
    }

    //setters
    public void setModel(String model) {
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

}