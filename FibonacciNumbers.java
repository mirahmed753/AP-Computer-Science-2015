import java.util.Scanner;
/*
 * THE FibonacciNumbers class asks the user for input and outputs the corresponding 
 * Fibonacci Number. 
 * @author: Mir Ahmed
 * @date: 02/08/15
 */

class Fibonacci {
	Fibonacci() //default constructor
	{
	}
	public int FibonacciFunction(int x) //Enter the piecewise equation from lecture notes
	{
		if(x == 0)
		{
			return 0;
		} 
		else if(x == 1)
		{
			return 1;
		}
		else
		{
			return FibonacciFunction(x - 1) + FibonacciFunction(x - 2);
		}
	}
}

public class FibonacciNumbers{
	public static void main (String [] args){
		
		Fibonacci fibNumber = new Fibonacci();
		Scanner in = new Scanner(System.in);
		
		//Ask user for input
		System.out.print("Enter an integer to Fibonaccize (Must be between 0 and 47): ");
		int x = in.nextInt();
		
		//Evaluate whether the Fibonacci Number should be printed
		//Error Trap
		if(x < 46 && x > -1){ //the max number for this program is 46; found through experimentation
			System.out.println("The Fibonacci Number for " + x + " is " + fibNumber.FibonacciFunction(x));
		}
		else{
			System.out.println("Please enter numbers between 0 and 47!");
		}
		
		//Create a string to be the basis for the user to continue
		String choice = "y"; 
		
		//Enter loop to continue with Fibonacci Numbers until user decides to quit
		while(choice.equalsIgnoreCase("y"))
		{
			System.out.println("Do you want to find another Fibonacci Number? (y/n)");
			choice = in.next();
			
			if(choice.equalsIgnoreCase("y"))
			{
				System.out.print("Enter an integer to Fibonaccize (Must be between 0 and 47): ");
				x = in.nextInt();
				if(x < 46 && x > -1){ //the error trap finder
					System.out.println("The Fibonacci Number for " + x + " is " + fibNumber.FibonacciFunction(x));
				}
				else{
					System.out.println("Please enter numbers between 0 and 47!");
				}
			}
			else
			{
				System.out.println("You have chosen to quit!");
			}
			
		}
	}
}

