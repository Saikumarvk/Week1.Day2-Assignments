package week1.day2;

public class NegToPos {
	/*Assignment #1: 
		Problem statement: Convert a negative number to positive number
		---------------------------------------------------------------
		Pseudocode:
		-----------
		1. Initialize an integer with a negative number
		   like, int number = -40;
		2. Check if the number is a negative number 
		   Hint : any number that is lesser than zero is a negative number
		3. If so, convert the number to a positive numer

		4. Print as below
		        "The number -40 is converted to 40"*/

	public static void main(String[] args) {
	
		int number =-40;
		if (number <0) {
			number =number*(-1);
			System.out.println("The number -40 is converted to "+number );
		}
	}

}
