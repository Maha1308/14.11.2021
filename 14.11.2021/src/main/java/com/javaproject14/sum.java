package com.javaproject14;

import java.util.Scanner;

public class sum {

	public static void main(String[] args) {
		int n1,n2,s;

		Scanner scanner= new Scanner(System.in);
		
		System.out.println("enter the 1st number:");
		n1=scanner.nextInt();
		System.out.println("enter the 2nd number:");
		n2=scanner.nextInt();
		s=n1+n2;
		
		System.out.println("the sum of two number:\n"+s);
		scanner.close();
		



	}

}
