/*THE PrimeNumbers class calculates whether or not a number is a Prime Number.
 * 
 * @author: Mir Ahmed
 * @date: 4/6/15
 */
public class PrimeNumbers {
	private int limit; 
	
	//constructor
	PrimeNumbers(int limit)
	{
		this.limit = limit;
	}
	
	//getter
	public int getLimit()
	{
		return limit;
	}
	
	//method to calculate whether the number is prime or not 
	
	public void FindPrime(int limit)
	{
		int counter = 0;
		for(int i = 2; i <= limit; i++) 
		{
			boolean prime = true;
			for(int x = 2; x < i; x++){
				if(i % x == 0)
				{
					prime = false;
				}
			}
			if(prime)
			{
				counter++;
				System.out.println(i + " ");
			}
		}
		System.out.println("There are a total of " + counter + " Prime Numbers");
	}
	
	public String toString()
	{
		System.out.println("The prime numbers from 0 to " + getLimit() + " are: ");
		return null;
	}
}
