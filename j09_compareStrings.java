/*
	java strings sure are annoying to deal with, you can't even do
	a = ("apple" == "apple")
	even if user input is apple and store into b and you do b =="apple", you get false 
*/

import java.util.Scanner;

public class j09_compareStrings
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		String word, choice;
		boolean yep, nope;
		choice = "apple";
		
		System.out.println("Type the word \"apple\", please.");
		word = scan.next();
		yep = word.equals(choice);
		nope = !word.equals(choice);
		
		System.out.println("You typed what was requested: " + yep);
		System.out.println("You ignored polite instructions: " + nope);
		
		String recognition;
		int age;
		double income, attractiveness;
		boolean allowed;
		
		System.out.print("How old are you?");
		age = scan.nextInt();
		
		System.out.print("What is your income?");
		income = scan.nextDouble();
		
		System.out.print("How attractive are you from 0.0 to 10.0? ");
		attractiveness = scan.nextDouble();
		
		// && is AND and || means OR, there are others like NAND and NOR and XOR but I 
		// don't really remember much atm.
		/*
			Here's a little challenge:
			int x = 3 | 5; // where x = 7
			int y = 3 & 5; // where y = 1
			explain why they are equal to what they are:
			3 is 0011 and 
			5 is 0101
			3 | 5 = 0111 where it takes all the 1's and put together 
			3 & 5 = 0001 where only if the 1's match
			
			Whew, I remember a bit about binaries now. 
		*/
		allowed = ( age >21 && age <40 && (income > 50000 || attractiveness >= 8));
		
		if (allowed == false){recognition = "Get out of here you bum!";}
		else{recognition = "Welcome to the family";}
		System.out.println("You are allowed to date my grandchild: " + recognition);
	}
}