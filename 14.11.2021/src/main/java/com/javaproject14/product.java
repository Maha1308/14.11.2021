package com.javaproject14;
import java.util.Scanner;


public class product {

	public static void main(String[] args) {
     int n1,n2, product;
     Scanner scanner= new Scanner(System.in);
       
     System.out.println("enter the 1st number:");
     n1=scanner.nextInt();
     System.out.println("enter the 2nd number:");
     n2=scanner.nextInt();
     product=n1*n2;
     System.out.println("sum of the product:\n"+product);
   scanner.close();

	}

}
