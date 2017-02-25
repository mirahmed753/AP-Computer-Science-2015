import java.util.Scanner;
/* Mir Ahmed - Find Factorials!*/
class FactorialNumbers{
	//default constructor
	FactorialNumbers()
	{	
	}
	
	public int FindFact(int n)
	{
		if(n == 0)
			return 1;
		else
			return n * FindFact(n - 1);
	}
}
public class Factorial {
	public static void main (String [] args){
		Scanner in = new Scanner(System.in);
		//create object
		FactorialNumbers factorial = new FactorialNumbers();
		
		//ask user for input 
		System.out.println("Enter a number to find its Factorial: ");
		int n = in.nextInt();
		System.out.println(n + "! = " + factorial.FindFact(n));	
	}
}

