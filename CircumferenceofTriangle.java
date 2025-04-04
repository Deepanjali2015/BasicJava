package ScannerClass;

import java.util.Scanner;

public class CircumferenceofTriangle 
{

	public static void main(String[] args) 
	{

		//circumference of a triangle = a+b+c

		Scanner s1=new Scanner(System.in);
		System.out.println("Please enter the value of a");
		int a=s1.nextInt();
		System.out.println("Please enter the value of b");
		int b=s1.nextInt();
		System.out.println("Please enter the value of c");
		int c=s1.nextInt();
		int circ=a+b+c;
		System.out.println("The circumference of a Rectangle is: " + circ);		
		
	}

}



