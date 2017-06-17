package com.ajl;

/*
    8 Primitive types:
    byte, short, int, long, float, double, char, boolean

    String is used pretty often, it's a sequence of chars
    It's a class
*/
 */

public class Main {

    public static void main(String[] args) {
        // ints can store from -2.147b to 2.147b, these values are literals
        // new feature of java 7 allows underscores to separate big nums
        // width of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2147483647;

        // bytes can store from -128 to 127
        // saves a lot of space compared to int
        // width of 8
        byte myByteValue = -128;
        // this will cause an error so we put it into a cast
        byte myNewByte = (byte)(myByteValue/2);

        //short from -32678 to 32677
        // uses twice amount space of byte, but twice less of int
        // width of 16
        short myShortValue = -32678;


        // when using long values, put a l or L at the end of the number
        // width of 64
        long myLongValue = -9_223_372_036_854_775_808L;


        long someLong = 50000L + 10 * (myNewByte + myShortValue + myMaxValue);
        System.out.println(someLong);

        // two data types that deal with floating numbers is float and double
        // doubles are more accurate when dealing with decimals
        int myIntValue = 5/3;
        float myFloatValue = 5f/3f;
        float asloFloat = (float)3.54;
        double myDoubleValue = 5d/3d;
        // considers decimals as a floating number as well
        double alsoDouble = 5.25;
        System.out.println("my int value: " + myIntValue);
        System.out.println("my float value: " + myFloatValue);
        System.out.println("my double value: " + myDoubleValue);

        // You can also use unicode characters at: unicode-table.com
        char myChar = 'A';
        char atSymbol = '\u00A9';
        System.out.println("Unicode character is: " + myChar + " " + atSymbol);


        boolean myBoolean = false;
        boolean isMale = true;

        String mystring = "This is a string";
        System.out.println(mystring);

    }
}
