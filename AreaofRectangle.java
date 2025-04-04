package ScannerClass;

import java.util.Scanner;

public class AreaofRectangle 
{

	public static void main(String[] args) 
	
	{

		//area of a rectangle = a*b

		Scanner s1=new Scanner(System.in);
		System.out.println("Please enter the value of a");
		int a=s1.nextInt();
		System.out.println("Please enter the value of b");
		int b=s1.nextInt();
		int area=a*b;
		System.out.println("The area of a Rectangle is:" + area);				
		
	}

}
