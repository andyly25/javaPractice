package com.ajl;

/**
 * Created by janly on 6/27/17.
 */
public class Monitor {
    private String model;
    private String manufacturer;
    private int size;
    /* This is composition: resolution is a component of a monitor; the monitor has a resolution,
     * which is the native resolution
     * */
    private Resolution nativeResolution;

    public Monitor(String model, String manufacturer, int size, Resolution nativeResolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }

    public void drawPixelAt(int x, int y, String color){
        System.out.println("Drawing pixel at " + x + "," + y + " in colour" + color);
    }
}
