import java.util.Scanner;
/*
 * THE CaesarShiftTester class allows the user to enter a message to encrypt or decrypt. 
 * @author: Mir Ahmed
 * @date: 4/4/15
 */
public class CaesarShiftTester {
	public static void main (String [] args){
		Scanner in = new Scanner (System.in);
		
		//prompt user to choose from menu 
		System.out.println("Please choose from the following options:\n\"E\": Encryption\n\"D\": Decryption");
		String choice = in.nextLine();
		
		//alphabet
		final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
		
		//set boolean to true for while statement
		boolean goAgain = true; 
		
		//enter while loop
		while(goAgain){
			//prompt user to enter a message
			System.out.println("Please enter a message: ");
			String message = in.nextLine();
			
			//prompt user to enter a Caesar shift key
			System.out.println("Please enter the shift key: ");
			final int shiftKey = in.nextInt();
			
			//provide if statement based on choice 
			if(choice.equals("E"))
			{
				//encrypt message
				System.out.println(CaesarShiftEncryption.encrypt(message, shiftKey, ALPHABET));
			}
			else
			{
				//decrypt message
				System.out.println(CaesarShiftDecryption.decrypt(message, shiftKey, ALPHABET));
			}
			
			//ask user if he/she would like to continue
			System.out.println("Would you like to continue? (y/n) ");
			String cont = in.nextLine();
			if(cont.equals("N"))
			{
				goAgain = false;
			}
			else
			{
				goAgain = true;
				System.out.println("ok");
			}
		}
		
	}
}
