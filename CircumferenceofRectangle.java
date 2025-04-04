package ScannerClass;

import java.util.Scanner;

public class CircumferenceofRectangle 
{

	public static void main(String[] args) 
	{

		//circumference of a rectangle = a(a+b)
		
		Scanner s1=new Scanner(System.in);
		System.out.println("Please enter the value of a");
		int a=s1.nextInt();
		System.out.println("Please enter the value of b");
		int b=s1.nextInt();
		int circ=a*(a+b);
		System.out.println("The circumference of a Rectangle is: " + circ);		
		
	}

}
