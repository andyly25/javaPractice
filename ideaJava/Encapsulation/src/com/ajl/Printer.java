package com.ajl;

/**
 * Created by janly on 6/28/17.
 * part of the challenge assignment to simulate a printer using encapsulation technique
 * have fields for toner level, num pages, and also if it's duplex printing.
 * Add method to fill up the toner and to simulate printing a page
 */

public class Printer {
    private int tonerLevel;
    private int numPages;
    private boolean duplex;

    public Printer(int tonerLevel, int numPages, boolean duplex) {
        if(tonerLevel>=0 && tonerLevel<=100){
            this.tonerLevel = tonerLevel;
        }
        this.numPages = numPages;
        this.duplex = duplex;
    }

    public void fillToner(int toner){
        if (toner > 0 && toner < 100){
            if((this.tonerLevel+toner)>100){
                System.out.println("Too much toner! error");
            }else{
                this.tonerLevel += toner;
                System.out.println("toner is now " + this.tonerLevel);
            }
        }else{
            System.out.println("Set valid toner amount");
        }

    }

    public void addPages(int pages){
        this.numPages += pages;
        System.out.println("pages to be printed: " + this.numPages);
    }

    public void setDuplex(){
        if(this.duplex == false){
            this.duplex = true;
            System.out.println("duplex turned on");
        }else{
            this.duplex = false;
            System.out.println("Duplex turned off");
        }
    }

    public void printPages(int pages){
        this.numPages += pages;
        getNumPages();
        if(this.duplex == true){
            int pagesToPrint = this.numPages/2 + this.numPages%2;
            System.out.println("You've printed out " + pagesToPrint + " duplex pages");
            this.numPages = 0;
        }else{
            System.out.println("You've printed out " + this.numPages);
            this.numPages = 0;
        }
    }

    public void getNumPages() {
        System.out.println("Pages in queue: " + this.numPages);
    }

    public boolean isDuplex() {
        return duplex;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }
}
