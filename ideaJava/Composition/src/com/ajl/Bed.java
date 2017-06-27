package com.ajl;

/**
 * Created by janly on 6/27/17.
 */
public class Bed {
    private int pillows;
    private int quilt;
    private int bedsheets;
    private int mattress;
    private String size;

    public Bed(int pillows, int quilt, int bedsheets, int mattress, String size) {
        this.pillows = pillows;
        this.quilt = quilt;
        this.bedsheets = bedsheets;
        this.mattress = mattress;
        this.size = size;
    }

    public void makeBed(){
        bedsheets = getBedsheets();
        pillows = getPillows();
        quilt = getQuilt();
        System.out.println("First add on " + bedsheets + " bedsheets, then fluff up the " + pillows + " pillows " +
        "and finally lay out the " + quilt+ " quilt.");

    }

    public int getPillows() {
        return pillows;
    }

    public int getQuilt() {
        return quilt;
    }

    public int getBedsheets() {
        return bedsheets;
    }

    public int getMattress() {
        return mattress;
    }

    public String getSize() {
        return size;
    }
}
