package com.ajl;

/*
    method overloading is using the same method name but with a variable number of parameters.
    We aren't doing method overriding yet.
 */

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 1000);
        System.out.println("New score is: " + newScore);
        int newScore2 = calculateScore(20000);
        System.out.println("score is" + newScore2);
        calculateScore();
        double value1 = calcFeetAndInchesToCentimeters(5, 8);
        double value2 = calcFeetAndInchesToCentimeters(80);
        System.out.println("value 1 is: " + value1 + "cm and value 2 is: " + value2 + "cm");
    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored "+ score + " points.");
        return score *1000;
    }

    public static int calculateScore(int score){
        System.out.println("Unnamed player scored "+ score + " points.");
        return score *1000;
    }

    public static int calculateScore(){
        System.out.println("No player name, no player score");
        return 0;
    }

    // NOTE: 1 in = 2.54 cm, 1 foot = 12 inches
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if ((feet>=0) && ((inches>=0) && (inches<= 12))){
            double totalInches = feet*12 + inches;
            double cmConvert = totalInches * 2.54;
            return cmConvert;
        }else{
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches>=0){
            double feet = inches / 12;
            double convInch = inches % 12;
            double result = calcFeetAndInchesToCentimeters(feet, convInch);
            return result;
        }else{
            return -1;
        }
    }
}
