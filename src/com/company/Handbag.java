package com.company;
//Mostenirea
public class Handbag extends Accesorii{
    private String material;
    private float marimea;

    //Constructor
    Handbag(String model, String brand, float price, String color, String material, float marimea) {
        super(model, brand, price, color);
        this.material = material;
        this.marimea = marimea;
    }

    //getters
    public String getMaterial() {
        return this.material;
    }

    public float getMarimea() {
        return this.marimea;
    }

    //setters
    public void setMaterial(String material) {
        this.material = material;
    }

    public void setMarimea(float marimea) {
        this.marimea = marimea;
    }

    @Override
    public String toString() {
        return "Handbag{"+
                "Model :" +getModel()+
                ",  Brand : " +getBrand()+
                ", Price : " +getPrice()+
                ", Color : " +getColor()+
                ", Material : " +material+
                ", Marimea: " +marimea+ '}';
    }
}