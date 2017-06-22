package com.ajl;

/*
    For control flow, I'll do an example of
    switch statements,
    for loops
 */

public class Main {

    public static void main(String[] args) {

        // sample switch statment using chars
        char charValue = 'A';
        switch(charValue){
            case 'A':
                System.out.println("Value is A");
                break;
            case 'B':
                System.out.println("Value was B");
                break;
            case 'C':case 'D':case 'F':
                System.out.println("C, D, F. never knew you can do this with switch");
                break;
            default:
                System.out.println("if only I can switch intelligence, haha can't even count alphabet");
                break;
        }

//        System.out.println("10000 at 9% interest = " + calculateInterest(10000.0, 9.0));

        // calculating interest with for loops
        for (int x = 2; x<=8; x++ ){
            System.out.println("10k at " + x + "% interest is " +
                    String.format("%.2f",calculateInterest(10000, x)));
        }

        System.out.println("&&&&&&&&&&&&&&&&");

        for (int x = 8; x>=2; x-- ){
            System.out.println("10k at " + x + "% interest is " +
                    String.format("%.2f",calculateInterest(10000, x)));
        }

        // exercise using the prime numbers function
        int count = 0;
        for (int x = 1; x < 12; x++){
            if (isPrime(x)){
                System.out.println(x + " is a prime" );
                count++;
                if (count >=3) {
                    System.out.println("breaking freee!");
                    break;
                }
            }
        }

        System.out.println("________________________________");

        int someNum = 10;
        int evenNum = 0;
        // here's a sample while loop
        // can also do while(true){if(condition){break;}}
        while(someNum <= 20){
            if(!isEvenNumber(someNum)){
                someNum++;
                continue;
            }
            evenNum++;

            System.out.println("Even num: " + someNum);
            if(evenNum >= 5){
                break;
            }
            someNum++;
        }

        System.out.println("There are " + evenNum + " even numbers");

        int doTest = 7;
        // here's a sample do while loop
        do{
            System.out.println("Count is: " + count);
            count++;
        }while(doTest != 7);  // so it will still run the code above then stop

    }

    // method that gives true or false if num is a prime
    // a prime # is a whole number greater than 1, whose only two whole-number factors are 1 and itself.
    public static boolean isPrime(int n){
        if( n == 1 ){
            return false;
        }
        for(int i=2; i<= n/2; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    // simple method to calc interest
    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate/100));
    }

    public static boolean isEvenNumber(int number){
        if((number % 2) == 0){
            return true;
        }else{
            return false;
        }
    }

}
