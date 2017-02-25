/*
 * THE CaesarShiftDecryption class contains a method to decrypt messages. 
 * @author: Mir Ahmed
 * @date: 4/4/15 
 */
public class CaesarShiftDecryption {
	public static String decrypt(String msg, int shift, String alph){	//the message, shift, and alphabet constant required
	
		msg = msg.toLowerCase(); 
		String decryptedMsg = ""; 
		
		//for loop to iterate through each index from user's message 
		for(int i = 0; i < msg.length(); i++){
			int x = alph.indexOf(msg.charAt(i)); //position of each character from user's message 
			
			if((x+shift) >= 0 && (x+shift) <= 25) //enter the piecewise function from lecture notes
			{
				decryptedMsg += alph.charAt(x-shift); //add to the decrypted string
			}	
			else if((x+shift) > 0)
			{
				decryptedMsg += alph.charAt((x-shift) + 26); //add to the decrypted string
			}
		}
		return decryptedMsg;
	}
}			
