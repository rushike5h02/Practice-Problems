package com.Logic.Practice;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		int r,sum=0,temp;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number=");
		
		int n=sc.nextInt();
		
		temp=n;
		
		while(n>0) {
			
		   r=n%10;
		   sum=(sum*10)+r;
			n=n/10;
		}

	if (temp==sum) {
		
		System.out.println("The number=="+sum+"==is Palindrome");
	}
	else {
		System.out.println("The Number is not Palindrome");
	}
	}

}
