package com.ajl;

/*
    A keyword is: a word that is reserved by a program because the word has a special meaning
    An expression is: Any valid unit of code that resolves to a value
    A Statement is: a command that the programmer gives to the computer (A line of code for example)

    Note: Indenting is meant to make easier to read the flow of the code.
    Also really good practice to do so.

    I'm really lazy to start another project, so I'll give a brief overview of if, else, else if

*/

public class Main {

    public static void main(String[] args) {

        // a mile is = to 1.609344 miles
        // note: past the = is the expression
        // the whole line is called a statement
        double kilometres = (100 * 1.609344);
        int age = 20;

        int highscore = 50;
        // this is also expression within the if statement
        if(highscore == 50){
            // println is a method
            System.out.println("This is also an expression");
        }

        // multiple statements in one line
        int myVariable = 50; myVariable++; myVariable--;
        // also statement and whitespaces are ignored, you can even split to other lines and it should work
        int         apple         =   30;

        if (age < 18){
            System.out.println("Sorry, too young to go alone");
        }else if( (age>18) && (age<40)){
            System.out.println("still young and dashing!");
        }else {
            System.out.println("Hopefully you had an adventurous life!");
        }


    }
}
