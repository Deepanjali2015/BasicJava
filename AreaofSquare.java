package ScannerClass;

import java.util.Scanner;

public class AreaofSquare 
{

	public static void main(String[] args) 
	{
		//area of a square = a*a
		
		Scanner s1=new Scanner(System.in);
		System.out.println("Please enter the value of a");
		int a=s1.nextInt();
		int area=a*a;
		System.out.println("The area of a Square is:" + area);			
		
	}

}
