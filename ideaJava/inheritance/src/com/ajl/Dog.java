package com.ajl;

/**
 * Created by janly on 6/26/17.
 */
public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    // removing the int brain and int body from args and using 1 for the super, since we know for sure dogs
    // should have 1 brain and 1 body
    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        // super calls the constructor that is for the class that we're extending from.
        // extends allows to inherit from Animal class
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    // this @Override reminds you that we're overriding a method that is in the superclass
    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }

    private void chew() {
        System.out.println("Dogs chew food");
    }

    public void walk(){
        System.out.println("Dog.walk() called");
        // super.move says only execute the move method in the super class
        move(5);
    }

    public void run(){
        System.out.println("Dog.run() called");
        move(10);
    }

    private void moveLegs(int speed){
        System.out.println("Dog.moveLegs() called");
    }

    @Override
    public void move(int speed){
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }
}
