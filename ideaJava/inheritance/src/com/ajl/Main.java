package com.ajl;

/*
* Inheritance you can relate with animals
* You don't have to call the code in the super class, but you would do that to init. or to perform that basic
* functionality in that basic class.
 */

public class Main {

    public static void main(String[] args) {

        // commented out for the challenge
//        Animal animal = new Animal("Animal", 1, 1, 5, 5);
//        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 40, "curly" );
//        // NOTE: we can use the eat method even though it's not in our dog file, it's inherited from Animal class
//        dog.eat();
//        dog.walk();
//        dog.run();

        Honda honda = new Honda(40);
        honda.accelerate(20);
        honda.steer(45);
        honda.accelerate(40);
        honda.accelerate(-30);
    }
}
