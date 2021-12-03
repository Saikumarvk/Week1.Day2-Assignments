package week1.day2;

import java.util.Arrays;

public class Arrayclassroomexcersice {

	public static void main(String[] args) {
		// Here is the input
				//sint[] data = {3,2,11,4,6,7};

				
				/*
				 Pseudo Code:
				 1) Arrange the array in ascending order
				 2) Pick the 2nd element from the last and print it
				 */
				
		int[] largeNumber = {3,2,11,4,6,7};
		int len =largeNumber.length;
		Arrays.sort(largeNumber);
		//System.out.println(largeNumber[4]);
		System.out.println(largeNumber[len-2]);

	}

}
