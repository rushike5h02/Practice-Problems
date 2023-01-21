package com.Logic.Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class MatrixArraayList {

	public static void main(String[] args) {
	
		// // add {{1,2,3} {4,5,6} {7,8,9}}
		
		// if its matrix we can use 2 dimensional... ArrayList
		
		ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
		
		arr.add(new ArrayList<>(Arrays.asList(1, 2, 3)));
		arr.add(new ArrayList<>(Arrays.asList(4, 5, 6)));
		arr.add(new ArrayList<>(Arrays.asList(7, 8, 9)));

		int sum = 0;

		for (ArrayList<Integer> i : arr) {
		  for (int j : i) {
		    sum += j;
		  }
		}

		System.out.println("Sum of all values in the array: " + sum);

	}

}
