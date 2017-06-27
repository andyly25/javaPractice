package com.ajl;

/**
 * Created by janly on 6/27/17.
 * created a new class called PC: it has a case, a field, and motherboard.
 * if you used Inheritance you can only do so from one class at a time as opposed to composition.
 */
public class PC {
    // case is a reserved keyword btw
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public Case getTheCase() {
        return theCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }
}
