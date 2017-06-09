import java.util.Scanner;

public class j05_receiveInput
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What city is the capital of France?");
		keyboard.next();
		
		System.out.println("What is 5*5?");
		keyboard.nextInt();
		
		System.out.println("What is your favorite number between 1.0 and 100.0?");
		keyboard.nextDouble();
		
		System.out.println("How are you feeling?");
		keyboard.next();
	}
}
