package com.ajl;

/**
 * Created by janly on 6/27/17.
 */
public class Bedroom {
    private Closet closet;
    private Bed bed;
    private Lamp lamp;

    public Bedroom(Closet closet, Bed bed, Lamp lamp) {
        this.closet = closet;
        this.bed = bed;
        this.lamp = lamp;
    }

    public void prepareForSleep(){
        bed.makeBed();
        lamp.turnOffLight();
    }

    public Closet getCloset() {
        return closet;
    }

    public Bed getBed() {
        return bed;
    }

    public Lamp getLamp() {
        return lamp;
    }
}
