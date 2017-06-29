package com.ajl;

/**
 * Created by janly on 6/28/17.
 * neat trick in this IDE is if you refactor a variable name, all instances of that variable is changed as well
 */
public class EnhancedPlayer {
    private String name;
    private int health;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if(health >0 && health<=100){
            this.health = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage){
        this.health = this.health - damage;
        if(this.health <= 0){
            System.out.println("Player knocked out");
            // reduce num of lives for player
        }
    }

    public int getHealth() {
        return health;
    }
}
