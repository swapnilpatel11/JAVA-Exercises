package com.company;

public class Main {

    public static void main(String[] args) {
        Car porshe = new Car();
        Car toyota = new Car();

        System.out.println("This car is " + porshe.getModel());

        porshe.setModel("Carrera");
        System.out.println("This car is " + porshe.getModel());

        toyota.setModel("Corolla");
        System.out.println("This car is " + toyota.getModel());
    }
}
