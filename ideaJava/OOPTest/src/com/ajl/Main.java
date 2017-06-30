package com.ajl;

/**
 * help a fictitious company called Bills Burgers manage their process of selling hamburgers.
 * This app will help Bull select types of burgers, some of additional items to be added to
 * the burgers and pricing.
 * We want to create a base hamburger, but also two other types of burgers that are popular.
 * Basic should have: bread roll type, meat, and up to 4 additonal addons (e.g. lettuce, tomato, ...)
 * that can be selected by customer .
 * Each of these items gets charged an additional price so you need some way to track how many items got added to
 * calculate the price (for base burger and all addons)
 * This burger has a base price and addons separately priced.
 * Create a hamburger class to deal with all the above.
 * The constructor should only include roll type, meat, and price.
 * Create 2 additional burgers:
 * a) healthy burger: (brown rye bread roll), plus 2 addition items
 * b) deluxe burger: chips and drinks as addition, and no extra additions
 */

public class Main {

    public static void main(String[] args) {
	    Hamburger basic = new Hamburger("basic", "wheat", "beef", 6.50);
	    basic.addAddOn(true, false,true, true);
        System.out.println("your order will be: " + basic.getPrice() + "$\n");

        HealthyBurger healthy = new HealthyBurger("chicken", 7.50);
        healthy.addAddOn(true,true, true, true);
        healthy.addAddOn(false, true, true, false);
        System.out.println("Your order will be: " + healthy.getPrice() + "\n");

        DeluxeBurger del = new DeluxeBurger();
        del.addAddOn(true, true);
        System.out.println("your order is: " + del.getPrice()+"\n");
    }
}
