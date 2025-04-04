package ScannerClass;

import java.util.Scanner;

public class CircumferenceofSquare 
{

	public static void main(String[] args) 
	
	{
	
		//circumference of a square = 4a
		
		Scanner s1=new Scanner(System.in);
		System.out.println("Please enter the value of a");
		int a=s1.nextInt();
		int circ=4*a;
		System.out.println("The circumference of a Square is: " + circ);
		
	}

}
