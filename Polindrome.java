package week1.day2;

public class Polindrome {
	//Build a logic to find the given string is palindrome or not
    
		/*
		 * Pseudo Code
		
		 * a) Declare A String value as"madam"
		 
		 * b) Declare another String rev value as ""
		 * c) Iterate over the String in reverse order
		 * d) Add the char into rev
		 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
		 
		 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
		 */
	public static void main(String[] args) {
		String name = "MADAM";
		String rev = "";
		int len = name.length();
		System.out.println(len);
		//for (int i = len-1 ; i>=0; i--) 
		for (int i = 4 ; i>=0; i--) 
			rev = rev+name.charAt(i);
		if(rev.equals(name)) {
		System.out.println("The String MADAM is Polindrom");
			}else {
				System.out.println("The String not polindrom");
			}

}}

