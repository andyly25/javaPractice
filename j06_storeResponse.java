// this library contains functionality that allows read in info from keyboard and etc
import java.util.Scanner;

public class j06_storeResponse
{
	public static void main (String[] args)
	{
		String name;
		int age;
		double income, m, kg, bmi;
		
		// Scanner object contains functions/"methods"
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Hello, what is your name? ");
		// keyboard.next waits for human input
		name = keyboard.next();
		
		System.out.print("This is really repetitive, but what is your age? ");
		// when you specify types you want eg. nextInt, nextDouble...
		age = keyboard.nextInt();
		
		System.out.print("Your height in m: ");
		m = keyboard.nextDouble();
		// note: 1 m = 39.3701 inches or 3.281 ft
		
		System.out.print("Your weight in kg: ");
		kg = keyboard.nextDouble();
		// 1 kg = 2.20462 lbs
		
		bmi = kg / (m*m);
		
		System.out.println("Hello " + name + " you're only " + age + " years old?");
		System.out.println("Your BMI is " + bmi);
	}
}