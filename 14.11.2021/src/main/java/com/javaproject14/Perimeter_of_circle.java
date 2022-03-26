package com.javaproject14;

import java.util.Scanner;

public class Perimeter_of_circle {

	public static void main(String[] args) {
		
			int r;
			double Premiter;
			Scanner scanner=new Scanner(System.in);
			System.out.println("enter the value:\n");
			r=scanner.nextInt();
			Premiter=2*3.14*r;
			System.out.println("Perimeter="+Premiter);
			scanner.close();
	}

}
