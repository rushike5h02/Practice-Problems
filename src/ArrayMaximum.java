package com.Logic.Practice;

public class ArrayMaximum {

	public static void main(String[] args) {
		
		int arr [] = {10,20,40,30};

		int max = arr [0];
		
		for (int i = 1; i<arr.length; i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			
		}
		System.out.println("Maximum Element = "+max);
	}


	

}
