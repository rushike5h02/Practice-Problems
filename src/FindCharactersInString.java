package com.Logic.Practice;

public class FindCharactersInString {

	public static void main(String[] args) {

		String str = "This is example for the Interview";
		
		// to count all irrespective of lower or upper case
		
		String s=str.toUpperCase();
		
		int countT = 0;
		int countI = 0;

		for (int i = 0; i < s.length(); i++) {
		  char c = s.charAt(i);
		  if (c == 'T') {
		    countT++;
		  }
		  if (c == 'I') {
		    countI++;
		  }
		}

		System.out.println("Number of T = " + countT);
		System.out.println("Number of I = " + countI);

	}

}
