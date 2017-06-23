package com.ajl;

public class Main {

    public static void main(String[] args) {
        // we can treat Car like a data type; this is how we define an obj of type car
        // Note you have to initialize as well.
        Car porsche = new Car();
        Car volvo = new Car();
        // when you do porsche.---- a list of methods and vars will appears, they are inherited from a base java class
        // if you change private to public in the Car class, you can access that variable
        // another alternative is to create a method in the object class to change the variable
        System.out.println("Model is " + porsche.getModel());
        porsche.setModel("Carrera");
        System.out.println("Model is " + porsche.getModel());
    }
}
