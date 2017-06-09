/*
	Note, since I've been playing with Python a bit, remember....
	SEMICOLONS!
*/

public class j04_createVariables
{
	public static void main(String[] args)
	{
		int x, y, age;
		double seconds, e, checking;
		String firstName, lastName, title;
		
		x = 10;
		y = 400;
		age = 39;
		
		seconds = 5.33;
		e= 2.71828;
		checking = 1.89;
		
		firstName = "Bob";
		lastName = "Schnieder";
		title = "Mr.";
		
		System.out.println("The var x is " + x + " and y is " +y);
		System.out.println("You are currently " + age + " years old");
		System.out.println("Let's add checking and e together: " + e+checking 
			+" which appends at the end "); 
		System.out.println("Your name is " + title+ " " + firstName + " " + lastName);
		
	}
}