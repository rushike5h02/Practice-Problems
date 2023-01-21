package com.Logic.Practice;

public class ThirdLargestNumberArray {

	public static void main(String[] args) {
		
		int arr[] = {87,99,-14,05,46,54};

		int largest=0 , secondlargest=0, thirdlargest=0;
		
		for(int i=0; i<arr.length; i++) {
			
			if (arr[i] > largest) {
				secondlargest=largest;
				
				largest=arr[i];
			}
			
			else if (arr[i] > secondlargest) {
				thirdlargest=secondlargest;
				secondlargest=arr[i];
			}
			
			else if (arr[i] > thirdlargest) {
				thirdlargest=arr[i];
			}		
		}
	
		System.out.println("Largest = "+largest);
		System.out.println("Second Largest = "+secondlargest);
		System.out.println("Third Largest = "+thirdlargest);
}

}
