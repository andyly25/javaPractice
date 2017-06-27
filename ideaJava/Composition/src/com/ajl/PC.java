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

    public void powerUp(){
//        getTheCase().pressPowerButton();
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo(){
        //fancy graphics
//        getMonitor().drawPixelAt(1200, 40, "pink");
        // can also do in this form
        monitor.drawPixelAt(1200, 40, "pink");
    }

//    // so now let's change all the public into private; now we don't need these
//    private Case getTheCase() {
//        return theCase;
//    }
//
//    private Monitor getMonitor() {
//        return monitor;
//    }
//
//    private Motherboard getMotherboard() {
//        return motherboard;
//    }
}
