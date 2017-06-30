package com.ajl;

/**
 * create a base class called Car
 * have a few fields appropriate for the car class: engine, cylinders, wheels, etc
 * Constructors should init cylinders (number of) and name, and set wheels to 4
 * and engine to true. Cylinder and names would be passed parameters
 *
 * create appropriate getters
 *
 * create methods like startEngine, accelerate, and brake
 *
 * show a message for each in base class
 * Now create 3 sub classes for your fav vehicles
 * override approp methods to demonsrate polymorph. in use
 * put all classes in the one java file.
 */

class Car{
    private boolean engine;
    private int cylinders;
    private int wheels;
    private String name;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.name = name;
    }

    public void startEngine(){
        if(this.engine == false){
            this.engine = true;
            System.out.println("Rev rev engine now started!");
        }
    }

    public void accelerate(){
        System.out.println("Accelerating!");
    }

    public void brake(){
        System.out.println("Braking!");
    }

    public int getCylinders() {
        System.out.println("cylinders dunno!!");
        return cylinders;
    }

    public String getName() {
        System.out.println("grabbing name! " );
        return name;
    }

}

// My gosh... my knowledge of cars is very lacking
// SHORTCUT: if you select Honda and go to refactor and Copy, you can copy the entire class
class Honda extends Car{
    public Honda(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void startEngine() {
        System.out.println("Honda is revving up!");
    }

    @Override
    public void accelerate() {
        System.out.println("Honda accelerate");
    }

    @Override
    public void brake() {
        System.out.println("Honda brake");
    }
}

class Toyota extends Car{
    public Toyota(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void startEngine() {
        System.out.println("toyota start");
    }



    @Override
    public void brake() {
        System.out.println("toyota brake");
    }
}

class Lexus extends Car{
    public Lexus(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void startEngine() {
        System.out.println("lexus start");
    }

    @Override
    public void accelerate() {
        System.out.println("lexus accel");
    }


}


public class Main {

    public static void main(String[] args) {
	    Car car = new Car(4, "regular car");
	    car.startEngine();
	    car.accelerate();
	    car.brake();

	    // SHORTCUT: you can refactor the variable name and those 4 statements below will all change
	    Honda honda = new Honda(6, "honda");
	    honda.startEngine();
	    honda.accelerate();
	    honda.brake();

	    Toyota toyota = new Toyota(5, "toyota");
	    toyota.startEngine();
	    toyota.accelerate();
	    toyota.brake();

	    Lexus lexus = new Lexus(8, "lexus");
	    lexus.startEngine();
	    lexus.accelerate();
	    lexus.brake();



    }
}
