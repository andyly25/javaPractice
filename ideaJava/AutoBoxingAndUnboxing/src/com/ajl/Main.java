package com.ajl;

import java.util.ArrayList;


class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class Main {

    public static void main(String[] args) {
        String [] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Tim");

        // You can't use primitive types as arguments, causes an error
        // ArrayList<int> intArrayList = new ArrayList<int>;
        // you can make an int class as a workaround like below but that's messy
        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));

        // in this case, Integer is already a class just like String
        Integer integer = new Integer(54);
        Double doubleValue = new Double(12.25);

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();

        for(int i=0; i<=10; i++){
            // this is autoboxing where we convert a base primitive type int to an integer
            // so we take the primitive type and going to object wrapper
            intArrayList.add(Integer.valueOf(i*2));
        }

        for(int i=0; i<=10; i++){
            // here we take from the class or from object wrapper and convert back to primitive
            System.out.println(i + " --> " + intArrayList.get(i).intValue());
        }

        // above was long way, here is the shortcut
        Integer myIntValue = 56; //equivalent to Integer.valueOf(56)
        int myInt = myIntValue; // equivalent to myIntValue.intValue();

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for(double dbl=0.0; dbl<=10.0; dbl+=0.5){
            myDoubleValues.add(Double.valueOf(dbl));

        }
        for(int i=0; i<myDoubleValues.size(); i++){
            // convert from object wrapper to primitive
            double value = myDoubleValues.get(i).doubleValue();
            System.out.println(i + " --> " + value);
        }
    }
}
