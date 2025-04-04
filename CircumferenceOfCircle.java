package ScannerClass;

import java.util.Scanner;

public class CircumferenceOfCircle 
{

	public static void main(String[] args) 
	{
		//Circumference of a Circle = 2*pi*r
		
		System.out.println("Please enter the area of a Circle");
		Scanner s1=new Scanner(System.in);
		int r=s1.nextInt();
		double circ=2*Math.PI*r;
		System.out.println("The circumference of the Circle is:" + circ);
		
	}

}
