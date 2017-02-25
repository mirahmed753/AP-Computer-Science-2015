import java.util.Scanner;
/*THE PrimeNumbersTester class prompts the user to enter a limit and finds all prime numbers from 0 to the limit. 
 * 
 * @author: Mir Ahmed
 * @date: 4/6/15
 */
public class PrimeNumbersTester {
	public static void main (String [] args){
		Scanner in = new Scanner (System.in);
		
		//Prompt user for upper limit 
		System.out.println("Please enter an upper limit: ");
		int upperLimit = in.nextInt();  
		
		//create object 
		PrimeNumbers newPrime = new PrimeNumbers(upperLimit);
		 
		newPrime.toString();
		newPrime.FindPrime(upperLimit);
		
	}

}
