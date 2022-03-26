package com.javaproject;

import java.util.Scanner;

public class Student {
	int student_id;
	String student_name;
	int student_age;
	float student_fees;
	void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the student id ");
		student_id=sc.nextInt();
		System.out.println("Enter the student name");
		student_name=sc.next();
		System.out.println("Enter the student age");
		student_age=sc.nextInt();
		System.out.println("Enter the student fees");
		student_fees=sc.nextFloat();
	}
	void display()
	{
		System.out.println("Student details:");
		System.out.println("**************************"); 
		System.out.println("Student id="+student_id);
		System.out.println("Student name="+student_name);
		System.out.println("Student age="+student_age);
		System.out.println("Student fees="+student_fees);
	}
	

	public static void main(String[] args) {
		Student s=new Student();
		s.accept();
		s.display();

	}

}
