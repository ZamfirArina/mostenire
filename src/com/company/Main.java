package com.company;

public class Main {

    public static void main(String[] args) {
        Accesorii  Crossbody = new Handbag("Casual", "Parfois", 1500, "Bordo", "piele naturala", 35);
        Accesorii Polaroid  = new Sunglasses("Clasic","Polaroid",2000,"Black","Plastic",54,145);
        System.out.println(Crossbody.toString());
        System.out.println(Polaroid.toString());
    }
}
