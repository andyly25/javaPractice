package com.ajl;

/**
 * Composition is modeling parts of the greater whole.
 * So when thinking if we are to use inheritance or composition consider how many different classes that
 * we need to access for our object to function. For the PC we used the motherboard, case and monitor;
 * they are part of the PC but they aren't the PC.
 **/

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
	    Case theCase = new Case("220B", "Dell", "240", dimensions);


	    Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27,
                new Resolution(2540,1440));


	    Motherboard theMotherBoard = new Motherboard("BJ-200", "Asus", 4, 6,
                "v2.44");

	    PC thePC = new PC(theCase, theMonitor, theMotherBoard);
	    // this is how you would be able to access methods from the PC components
	    thePC.getMonitor().drawPixelAt(1400,1200, "blue");
	    thePC.getMotherboard().loadProgram("Windows 3.0");
	    thePC.getTheCase().pressPowerButton();
    }
}
