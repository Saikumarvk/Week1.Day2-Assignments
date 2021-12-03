package week1.day2;

import java.util.Arrays;

public class MissingNuminArray {
	// Here is the input
			//int[] arr = {1,2,3,4,7,6,8};

			// Sort the array	
			

			// loop through the array (start i from arr[0] till the length of the array)

				// check if the iterator variable is not equal to the array values respectively
				
					// print the number
					
					// once printed break the iteration
	public static void main(String[] args) {
		
		/*int[] numbers = {1,2,3,4,5,7};
		int len = numbers.length+1; //Always +1 with the actual length
		//Arrays.sort(numbers);
		int totalofnum = (len * (len-1))/2; //21
		for (int i=0;i<numbers.length-1;i++){
			totalofnum = totalofnum - numbers[i];  //20, 18, 15, 11, 5
		}
		System.out.println(totalofnum); */
		
		int[] numbers = {1,3,4,2,6};
		int len = numbers.length; //Always +1 with the actual length
		Arrays.sort(numbers);
		for (int i=1;i<=len;i++){
			if (i!= numbers[i-1]) {
			System.out.println(i);
				
		}
	}
}}

		
	

	

	


