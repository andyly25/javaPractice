package com.ajl;

/*
    Some more Googling on terms!
    Function: a combination of instructions coupled together to achieve some result. May take args and return result.
        a code block containing a series of statements that return operation result.
    Methods ('member functions'): they belong to classes or objects and usually express the verbs of the object class.
        Code block containing a series of statements.
        e.g. object of type window would have methods 'open' and 'close'
    Properties: fields of objects/classes with dedicated getters/setters routines (can be methods).
        a member that provides a flexible mechanism to read, write, or compute the value of private field.
    Procedure: a method returning type void.

 */

public class Main {
    // the entire main is a method and everything within are statements
    public static void main(String[] args) {

	    int highscore1 = calculateScore(true, 800, 5, 100);

	    // can also do:
        boolean gameOver = true;
        int score = 10000;
        int levelCompleted = 10;
        int bonus = 300;

        int highscore2 = calculateScore(gameOver, score, levelCompleted, bonus);

        System.out.println("friend 1 got score: " + highscore1 + " and I got: " + highscore2);

        int scorePosition = calculateHighScorePosition(score);
        displayHighScorePosition("Bob", scorePosition);
    }

    // void means to not send any value back, void can also be known as a procedure
    // otherwise change to data type we want to return
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was: " + finalScore);
            return finalScore;
        }

        return -1;
    }

    public static void displayHighScorePosition(String pname, int position){
        System.out.println("Good job " + pname + "! You got into position: " + position);
    }

    public static int calculateHighScorePosition(int score){
        if(score >= 1000){
            return 1;
        }else if(score >= 500 && score < 1000){
            return 2;
        }else if (score >=100 && score <500){
            return 3;
        }
        return 4;
    }

}
