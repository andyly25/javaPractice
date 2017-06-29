package com.ajl;

/**
 * Encapsulation is the mechanism that allows you to restrict access to certain componenet sin the objects you are
 * creating, so you can protect the members of a class from external access
 */

public class Main {

    public static void main(String[] args) {

//        Player player = new Player();
//        player.name = "Tim";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("remaining health: " + player.healthRemaining());
//
//        damage = 11;
//        // since program can be accessed in ways you don't want to be, others can cheat your system.
//        player.health = 200;
//        player.loseHealth(damage);
//        System.out.println("remaining health: " + player.healthRemaining());


        // Doing this way let us create private functions that we dont want to be exposed to other classes
        // and we can change those names anytime without affecting the other code.
        EnhancedPlayer player = new EnhancedPlayer("Bob", 150, "sword");
        System.out.println("player health is: " + player.getHealth());

        Printer printer = new Printer(40,4, false);
        printer.fillToner(80);
        printer.fillToner(40);
        printer.printPages(5);
        printer.addPages(4);
        printer.setDuplex();
        printer.printPages(11);
        printer.getNumPages();
    }
}
