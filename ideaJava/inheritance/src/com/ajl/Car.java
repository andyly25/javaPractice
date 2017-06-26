package com.ajl;

/**
 * Created by janly on 6/26/17.
 */

public class Car extends  Vehicle{
    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;

    private int currentGear;

    public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changedGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.setcurrentgear(): changed to " + this.currentGear + " gear");
    }

    public void changeVelocity (int speed, int direction){
        move(speed, direction);
        System.out.println("Car.changeVelocity() " + speed + " direction " + direction);
    }

}

// My take 1
//public class Car extends Vehicle {
//    private int doors;
//
//    public Car(int wheels, int gears, int seats, int doors) {
//        super(1, gears, seats);
//        this.doors = doors;
//    }
//
//    public void steering(){
//
//    }
//    public void setChangeGears(){
//
//    }
//    @Override
//    public void moving(int speed){
//        System.out.println("car.move() is called");
//        super.moving(speed);
//    }
//}
