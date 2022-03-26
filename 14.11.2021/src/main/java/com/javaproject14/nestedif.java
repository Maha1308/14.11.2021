package com.javaproject14;

import java.util.Scanner;

public class nestedif {
	public static void main(String[] args) {
		int n ;
		Scanner scanner= new Scanner(System.in);
		System.out.println("enter the any number:");
		n= scanner.nextInt();
		if(n>0) {
			{
			System.out.println("it is positive number");
		}
		if(n%2==0)
		{
			System.out.println("it is even number");
		}
		else
		{
			System.out.println("it is odd number");
		}
	}
	else {
		System.out.println("it is negative number");
	}
scanner.close();

	}

}


