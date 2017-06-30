package com.ajl;

/**
 * Created by janly on 6/29/17.
 */
public class Hamburger {
    private String name;
    private String breadRoll;
    private String meat;
    private boolean lettuce;
    private boolean tomato;
    private boolean cheese;
    private boolean onions;
    private double price;

    public Hamburger(String name, String breadRoll, String meat, double price) {
        this.name = "Hamburger";
        this.breadRoll = breadRoll;
        this.meat = meat;
        this.price = price;
    }


    public double addAddOn (boolean lettuce, boolean tomato, boolean cheese, boolean onions){
        // this will be inelegant with a lot of if statements
        System.out.println("Hamburger before addons is: " + this.price);
        if(lettuce == true){
            System.out.println("add on lettuce for .25$");
            this.price += 0.25;
        }
        if(tomato == true){
            System.out.println("add on tomato for .25$");
            this.price += .25;
        }
        if(cheese == true){
            System.out.println("add on cheese for 1.00$");
            this.price += 1.00;
        }
        if(onions == true){
            System.out.println("add on onions for .50$");
            this.price += .50;
        }
        System.out.println("Hamburger with addons is now: " + this.price);
        return this.price;
    }

    public void changeMeat(String meat){
        this.meat = meat;
    }

    public double getPrice() {
        return price;
    }
}
