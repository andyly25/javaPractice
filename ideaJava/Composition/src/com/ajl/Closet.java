package com.ajl;

/**
 * Created by janly on 6/27/17.
 */
public class Closet {
    private int size;
    private int clothes;
    private String material;

    public Closet(int size, int clothes, String material) {
        this.size = size;
        this.clothes = clothes;
        this.material = material;
    }

    public void store(int clothes){
        System.out.println("Storing " + clothes + " clothing");
        this.clothes += clothes;
    }

    public void takeClothes(int clothes){
        if(this.clothes >= clothes){
            System.out.println("retrieving clothes: " + clothes);
            this.clothes -= clothes;
        }
    }

    public int getSize() {
        return size;
    }

    public int getClothes() {
        return clothes;
    }

    public String getMaterial() {
        return material;
    }
}
