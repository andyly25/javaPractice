package com.ajl;

/**
 * Created by janly on 6/27/17.
 */
public class Lamp {
    private int wattage;
    private int height;
    private String material;

    public Lamp(int wattage, int height, String material) {
        this.wattage = wattage;
        this.height = height;
        this.material = material;
    }

    public void light(){
        int watt = this.getWattage();
        System.out.println("Let there be light with this " + watt + " watt lightbulb");
    }

    public void turnOffLight(){
        pressSwitch();
        System.out.println("now the lights are off!");
    }

    public void pressSwitch(){
        System.out.println("flipping the switch! ");
    }

    public int getWattage() {
        return wattage;
    }

    public int getHeight() {
        return height;
    }

    public String getMaterial() {
        return material;
    }
}
