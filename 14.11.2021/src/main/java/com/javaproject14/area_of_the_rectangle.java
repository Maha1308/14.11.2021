package com.javaproject14;
import java.util.Scanner;

public class area_of_the_rectangle {

	public static void main(String[] args) {
		int l,b,area;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the length:\n");
		l=scanner.nextInt();
		System.out.println("enter the breath:\n");
		b=scanner.nextInt();
		 area=l*b;
		  System.out.println("Area of the rectangle:"+area);
		  scanner.close();

	}

}
