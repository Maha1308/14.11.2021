package com.javaproject;
 class AddOverload
 {
	 void add(int i, int j)
	 {
		 int s;
		 s=i+j;
		 System.out.println("the sum of "+i+"and "+j+"is="+s );
	 }
	 void add(float i, float j) {
		float sum;
		 sum=i+j;
		 System.out.println("the sum of "+i+"and "+j+"is="+sum);
		 
	 }
	 void add(double i, double j)
	 {

		double sum;
		 sum=i+j;
		 System.out.println("the sum of "+i+"and "+j+"is="+sum);
		 
	 }
	 }

public class MainClass {

	public static void main(String[] args) {
		AddOverload ob=new AddOverload();
		ob.add(9, 10);
		ob.add(6.7,3.4);
		ob.add(7.8f, 6.5f);
	

	}

}
