package com.Logic.Practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MatrixMap {

	public static void main(String[] args) {
		
		// // add {{1,2,3} {4,5,6} {7,8,9}}
		
				// if its matrix we can use 2 dimensional... MAP
		
		Map<Integer, List<Integer>> map = new HashMap<>();
		
		map.put(1, Arrays.asList(1, 2, 3));
		map.put(2, Arrays.asList(4, 5, 6));
		map.put(3, Arrays.asList(7, 8, 9));

		int sum = 0;

		for (List<Integer> i : map.values()) {
		  for (int j : i) {
		    sum += j;
		  }
		}

		System.out.println("Sum of all values in the array: " + sum);
				
	}

}
