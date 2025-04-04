package ScannerClass;

import java.util.Scanner;

public class AreaofTriagle 
{
		
	public static void main(String[] args) 
	{
		
		//Area of a triangle is 0.5*b*h

		Scanner s1=new Scanner(System.in);
		System.out.println("Please enter the value of b");
		int b=s1.nextInt();
		System.out.println("Please enter the value of h");
		int h=s1.nextInt();
		double area=0.5*b*h;
		System.out.println("The Area of a Triagle is:" + area);				
		
	}

}
