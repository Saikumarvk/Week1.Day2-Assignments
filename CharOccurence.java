package week1.day2;

public class CharOccurence {
	// Check number of occurrences of a char (eg 'e') in a String
	
				//String str = "welcome to chennai";
				// declare and initialize a variable count to store the number of occurrences
				// convert the string into char array					
				//get the length of the array					
				// traverse from 0 till the array length 					
					// Check the char array has the particular char in it 				
					// if is has increment the count						 					
					// print the count out of the loop

	public static void main(String[] args) {
		
    String str ="welcome to chennai";
    int count =0;
    str.charAt(1);
    int len =str.length();
    //System.out.println(len);
    for (int i =0;i<=len-1;i++) {
    	if (str.charAt(i) =='e') {
    		count++;
    			
    	}
    }
    System.out.println("The Occurence of E in the string is = "+count);
    
    
    
    
    
    
    
    
	}

}
