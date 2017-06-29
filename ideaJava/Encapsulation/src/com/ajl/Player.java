package com.ajl;

/**
 * Created by janly on 6/28/17.
 * we'll make this class without the use of encapsulation to show why encapsulation is a good thing
 */
public class Player {
    // since these fields are public and can be accessed outside, if any names changes, then problems for all files
    // using these variables
    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage){
        this.health = this.health - damage;
        if(this.health <= 0){
            System.out.println("Player knocked out");
            // reduce num of lives for player
        }
    }

    public int healthRemaining(){
        return this.health;
    }

}
