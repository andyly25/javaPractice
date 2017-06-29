package com.ajl;

/**
 * Polymorphism is the method or mechanism in oop that allows actions to act differently based on the
 * actual action is being performed upon.
 *
 * Output is beauty of polymorphism
 */

class Movie{
    private String name;

    public Movie(String name){
        this.name = name;
    }

    public String plot(){
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie{
    public Jaws(){
        super("Jaws");
    }
    public String plot(){
        return "Shark that eat lots of people";
    }
}

class IndependenceDay extends Movie{
    public IndependenceDay(){
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take over earth";
    }
}

class MazeRunner extends Movie{
    public MazeRunner(){
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids try and escape maze";
    }
}

class StarWars extends Movie{
    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "imperial forces try take over universe";
    }
}

class Forgetable extends Movie{
    public Forgetable() {
        super("Forgettable");
    }
    // no plot method
}

public class Main {

    public static void main(String[] args) {
	    for(int i = 1; i<11; i++){
	        Movie movie = randomMovie();
	        /**
	         Here movie.plot is doing a lot of work. Here Java is looking at the object called movie
             the var created, that was returned from random movie method. And then going down and looking into
             the object and seeing, has it got a plot method?
             We're actually assigning different functionality depending on the type of object we've created.
             All these objects are inherited from base movie class, but assigned a unique bit of functionality in
             each of those plot methods for each of those classes
             */
            System.out.println("Movie #" + i + " : " + movie.getName() + "\n" +
                                "plot " + movie.plot() + "\n");
        }
    }

    public static Movie randomMovie(){
        int randomNumber = (int)(Math.random()*5)+1; //returns a random number from 1-5
        System.out.println("Random number is " + randomNumber);
        switch(randomNumber){
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return  new Forgetable();
//            default:
//                return null;
        }
        return null;
    }
}



