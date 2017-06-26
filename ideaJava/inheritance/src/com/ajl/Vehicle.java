package com.ajl;

/**
 * Created by janly on 6/26/17.
 */

public class Vehicle{
    private String name;
    private String size;

    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;
        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public void setCurrentVelocity(int currentVelocity) {
        this.currentVelocity = currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void setCurrentDirection(int currentDirection) {
        this.currentDirection = currentDirection;
    }

    public void steer(int direction){
        this.currentDirection += direction;
        System.out.println("Vehicle.steer(): steering at " + currentDirection + "degrees");
    }

    public void move(int velocity, int direction){
        currentVelocity = velocity;
        currentDirection = direction;
        System.out.println("Vehicle.move(0 moving at " + currentVelocity + " in direction " + currentDirection);
    }

    public void stop(){
        this.currentVelocity = 0;
    }


}

// attempt 1, was sorta off so I'll now follow along the solution
//public class Vehicle {
//    private int wheels;
//    private int gears;
//    private int seats;
//
//    private int currentVelocity;
//    private int currentDirection;
//
//    public Vehicle(int wheels, int gears, int seats) {
//        this.wheels = wheels;
//        this.gears = gears;
//        this.seats = seats;
//
//        this.currentVelocity = 0;
//        this.currentDirection = 0;
//    }
//
//    public void steer(int direction){
//        this.currentDirection += direction;
//        System.out.println("Vehicle.steer(): steering at " + currentDirection + "degrees");
//    }
//
//    public void move(int velocity, int direction){
//        currentVelocity = velocity;
//        currentDirection = direction;
//        System.out.println("Vehicle.move(0 moving at " + currentVelocity + " in direction " + currentDirection);
//    }
//
//    public void setWheels(int wheels) {
//        this.wheels = wheels;
//    }
//
//    public void setGears(int gears) {
//        this.gears = gears;
//    }
//
//    public void setSeats(int seats) {
//        this.seats = seats;
//    }
//
//    public int getCurrentVelocity() {
//        return currentVelocity;
//    }
//
//    public void setCurrentVelocity(int currentVelocity) {
//        this.currentVelocity = currentVelocity;
//    }
//
//    public int getCurrentDirection() {
//        return currentDirection;
//    }
//
//    public void setCurrentDirection(int currentDirection) {
//        this.currentDirection = currentDirection;
//    }
//
//    public int getWheels() {
//        return wheels;
//    }
//
//    public int getGears() {
//        return gears;
//    }
//
//    public int getSeats() {
//        return seats;
//    }
//
//    public void moving(int speed){
//        System.out.println("Vehicle.move() is called");
//    }
//}
