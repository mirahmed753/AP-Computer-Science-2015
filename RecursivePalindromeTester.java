import java.util.Scanner;
/*
 * THE RecursivePalindromeTester class asks the user for input and outputs whether or not the input is a Palindrome.
 * @author: Mir Ahmed
 * @date: 02/15/15
 */
class RecursivePalindrome{
	//default constructor
	RecursivePalindrome()
	{
	}
	
	public String PalindromeHelper(String n){
		n = n.replaceAll(" ", ""); //remove all the white spaces
		n = n.toLowerCase(); //change the string into lower case
		
		//if the character at indicated index is not a letter, remove that character
		for(int i = 0; i < n.length(); i++){
			
			if(Character.isLetter(n.charAt(i)) == false){
				
				n = n.replace(n.substring(i, i +1), "");
			}
		}
		
		//check if Palindrome
		if(n.length() == 0 || n.length() == 1)
		{
			return "Your word/phrase is a Palindrome!";
		}
		else if(n.charAt(0) == n.charAt(n.length()-1)){
			return FindPalindrome(n.substring(1, n.length() -1)); //remove first and last characters
		}														  //call recursive function
		else{
			return "Your word/phrase is not a Palindrome.";
		}
}
	
	public String FindPalindrome(String n){
		return PalindromeHelper(n);
	}
}


public class RecursivePalindromeTester {
	public static void main(String [] args){
	Scanner in = new Scanner(System.in);
	
	//create object
	RecursivePalindrome palindrome = new RecursivePalindrome();
	
	//ask user for input 
	System.out.print("Please enter a word of your choice: ");
	String input = in.nextLine(); 
	System.out.println(palindrome.FindPalindrome(input));
	
	//ask user if program should continue 
	String choice = "y"; 
	
	while(choice.equalsIgnoreCase("y")){
		System.out.println("Would you like to check if another word is a Palindrome? (y/n)");
		choice = in.next();
		
		if(choice.equalsIgnoreCase("y")){
			//ask user for input 
			System.out.print("Please enter a word of your choice: ");
			input = in.next();
			System.out.println(palindrome.FindPalindrome(input));
		}
		else{
			System.out.println("You have chosen to quit!");
		}
		}
	}
}
