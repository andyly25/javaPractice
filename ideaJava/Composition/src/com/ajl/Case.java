package com.ajl;

/**
 * Created by janly on 6/27/17.
 */
public class Case {
    private String model;
    private String manufacturer;
    private String powerSupply;
    private Dimensions dimenstions;

    public Case(String model, String manufacturer, String powerSupply, Dimensions dimenstions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dimenstions = dimenstions;
    }

    public void pressPowerButton() {
        System.out.println("Power button pressed");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public Dimensions getDimenstions() {
        return dimenstions;
    }
}
