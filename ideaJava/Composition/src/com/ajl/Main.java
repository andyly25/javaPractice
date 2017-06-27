package com.ajl;

/**
 * Composition is modeling parts of the greater whole. Creating objects within objects.
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
//	    thePC.getMonitor().drawPixelAt(1400,1200, "blue");
//	    thePC.getMotherboard().loadProgram("Windows 3.0");
//	    thePC.getTheCase().pressPowerButton();
        thePC.powerUp();


        /* challenge: create a single room of a house using composition
         * Add at least one method to access an object via a getter
         * Then add at least one method to hide the object (not using a getter)
         */

        // I'll try to make a bedroom: bed, a lamp, a closet

        Closet closet = new Closet(20,10,"Oak");
        Bed bed = new Bed(4,1,1,1,"King");
        Lamp lamp = new Lamp(60,2, "plastic");

        Bedroom bedroom = new Bedroom(closet, bed, lamp);

        bedroom.getLamp().light();
        bedroom.getCloset().store(5);
        bedroom.prepareForSleep();
    }
}
