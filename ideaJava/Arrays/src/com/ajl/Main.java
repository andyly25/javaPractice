package com.ajl;
/**
 *
 * some array review in Java
 */


import java.util.Scanner;

public class Main {

    // let's try taking in user input
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // you can actually assign values inside when initializing
        int [] someArray = {1,2,3,4,5,6,7,8,9,10};
        // array with 10 elements inside of it
        double[] doubleArray = new double[10];

        System.out.println(someArray[4]);

        for(int i = 0;  i<doubleArray.length; i++){
            doubleArray[i] = i;
            System.out.println("double array value at: " + i + " is " +doubleArray[i]);
        }
        // let's pass in the array to a method
        twiceArray(doubleArray);

        int[] myIntegers = getIntegers(5);
        for(int i = 0; i<myIntegers.length; i++){
            System.out.println("my integer values I entered at " + i + " is " + myIntegers[i]);
        }

        System.out.println("The avg is: " + getAverage(myIntegers));

        // Challenge section
//        int [] challengeArray = getIntegers(5);
//        printArray(challengeArray);
        int [] sortedArray = sortIntegers(myIntegers);
        printArray(sortedArray);

    }

    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " integer values. \r");
        int[] values = new int[number];
        for(int i =0; i<values.length; i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void twiceArray(double[] array){
        for(int i=0; i<array.length; i++){
            array[i] = array[i]*2;
            System.out.println(array[i]);
        }
    }

    public static double getAverage(int[] array){
        int sum = 0;
        for(int i =0; i<array.length; i++){
            sum+= array[i];
        }
        return (double)sum /(double)array.length;
    }

    public static void printArray(int[] array){
        for(int i = 0; i<array.length; i++){
            System.out.println("Array values at pos: " + i + " is " + array[i]);
        }
    }

    public static int[] sortIntegers( int[] array){
        int[] newArray = new int[array.length];
        System.out.println("Sorting started!");

        // Shortcut using inbuilt methods
        // int[] newArray = Arrays.copyOf(array, array.length);
        for(int i=0; i<array.length; i++){
            newArray[i] = array[i];

            boolean flag = true;
            int temp;

            // Here we go through remaining numbers and see if larger than i
            while(flag){
                flag = false;
                for (int j=0; j<newArray.length-1; j++){
                    // so if our number is less than the next number
                    if(newArray[j] < newArray[j+1]){
                        // store current j value in temp
                        temp = newArray[j];
                        // let temp = next element
                        newArray[j] = newArray[j+1];
                        // now have that next element = previous element
                        newArray[j+1] = temp;
                        // let's continue looping
                        flag = true;
                    }
                }
            }
        }
        return newArray;
    }
}
