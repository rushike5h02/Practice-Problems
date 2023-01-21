package com.Logic.Practice;

public class FindCharacterNotRepeated {

	public static void main(String[] args) {
		
		String str = "NITIN";

		for (int i = 0; i < str.length(); i++) {
			
		  char c = str.charAt(i);
		  
		  if (str.indexOf(c) == str.lastIndexOf(c)) {
			  
		    System.out.println("character that is not repeated = " + c);
		    
		    break;
		  }
		}

	}

}
