package com.ajl;

/**
 * Created by janly on 6/29/17.
 */
public class DeluxeBurger extends Hamburger{
    private boolean chips;
    private boolean soda;
    private double dprice;

    public DeluxeBurger() {
        super("Deluxe Burger", "Wheat", "beef", 12.25);
        this.dprice = 12.25;
    }

    @Override
    public double getPrice() {
        return this.dprice;
    }

    public double addAddOn(boolean chips, boolean soda){
//        double price = getPrice();
        System.out.println("Hamburger before addons is: " + this.dprice);
        if(chips == true){
            System.out.println("add on chips for: $1.25" );
            this.dprice += 1.25;
        }
        if(soda == true){
            System.out.println("add on soda for: $2.00" );
            this.dprice += 2.00;
        }
        System.out.println("Hamburger after addons is: " + this.dprice);
        return this.dprice;
    }
}
