
/*
 * THE CaesarShiftEncryption class contains a method to encrypt messages. 
 * @author: Mir Ahmed
 * @date: 4/4/15
 */
public class CaesarShiftEncryption {
	public static String encrypt(String msg, int shift, String alph){	//the message, shift, and alphabet constant required
	
		msg = msg.toLowerCase(); 
		String encryptedMsg = ""; 
		
		//for loop to iterate through each index from user's message 
		for(int i = 0; i < msg.length(); i++){
			int x = alph.indexOf(msg.charAt(i)); //position of each character from user's message 
			
			if((x+shift) >= 0 && (x+shift) <= 25) //enter the piecewise function from lecture notes
			{
				encryptedMsg += alph.charAt(x+shift); //add to the encrypted string
			} 
			else if((x+shift) > 26)
			{
				encryptedMsg += alph.charAt((x+shift) - 26); //add to the encrypted string
			}	
			else if(msg.charAt(i) == (' '))
			{
				encryptedMsg += " ";
			}
		}
		return encryptedMsg;
	}
}			
