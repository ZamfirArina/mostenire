package com.company;

public class Sunglasses extends Accesorii {
    private String material;
    private float latime;
    private float lungime;

    //Constructor
    Sunglasses(String model, String brand, float price, String color, String material, float latime, float lungime) {
        super(model, brand, price, color);
        this.material = material;
        this.latime = latime;
        this.lungime = lungime;
    }
    //getters
    public String getMaterial() {
        return this.material;
    }

    public float getLatime() {
        return this.latime;
    }

    public float getLungime() {
        return this.lungime;
    }

    //setters
    public void setMaterial(String material) {
        this.material = material;
    }

    public void setLatime(float latime) {
        this.latime = latime;
    }

    public void setLungime(float lungime) {
        this.lungime = lungime;
    }

    @Override
    public String toString() {
        return "Sunglasses{" +
                "Model :" + getModel() +
                ",  Brand : " + getBrand() +
                ", Price : " + getPrice() +
                ", Color : " + getColor() +
                ", Material : " + material +
                ", Latime: " + latime +
                ", Lungime = " + lungime + '}';
    }
}