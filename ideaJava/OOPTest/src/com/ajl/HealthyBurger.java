package com.ajl;

/**
 * Created by janly on 6/29/17.
 */


public class HealthyBurger extends Hamburger{
    private double hprice;

    public HealthyBurger(String meat, double price) {
        super("Healthy", "Brown Rye", meat, price);
        this.hprice = price;
    }

    // while googling for efficiency I saw a question about a way to determine at least 2 of the the three is true
    // return a ^ b ? c : a   // this uses XOR
    // boolean atLeastTwo(boolean a, boolean b, boolean c){
    //      return a? (b || c) : (b && c); }
    // so how will I do this for only 2 or less add ons?
    // i decided just to do a simple array with a counter

    @Override
    public double getPrice() {
        return hprice;
    }

    @Override
    public double addAddOn(boolean lettuce, boolean tomato, boolean cheese, boolean onions) {
        int count = 0;
//        double price = getPrice();
        boolean[] addonsArray = {lettuce, tomato, cheese, onions};
        for(int i=0; i< addonsArray.length; i++){
            if(addonsArray[i]==true){
                count++;
            }
        }
        if(count <=2) {

            System.out.println("Hamburger before addons is: " + this.hprice);
            if(lettuce == true){
                System.out.println("add on lettuce for .25$");
                this.hprice += 0.25;
            }
            if(tomato == true){
                System.out.println("add on tomato for .25$");
                this.hprice += .25;
            }
            if(cheese == true){
                System.out.println("add on cheese for 1.00$");
                this.hprice += 1.00;
            }
            if(onions == true){
                System.out.println("add on onions for .50$");
                this.hprice += .50;
            }

            System.out.println("Hamburger with addons is now: " + this.hprice);
            return this.hprice;

        }else{
            System.out.println("Only 2 or less add ons sir/madame! burger price is still " + this.hprice);
            return this.hprice;
        }


    }
}
