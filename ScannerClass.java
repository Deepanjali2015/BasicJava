package ScannerClass;

import java.util.Scanner; //java.lang package

public class ScannerClass 
{

	public static void main(String[] args) 
	{
		//This is a human input program
		
		//Non static Method names for scanner class is "next"
		//next(), nextbyte(), nextshort(), nextint(), nextlong(), nextfloat(), nextdouble(), nextboolean()
		//Return type will be String, byte, short, int, long, float, double, boolean			

		//for non static method, we have to create an object of the scanner class
		//for static method, we can create object with classname.method name 

		//we are passing (System.in) to call the constructor 
		//(System.in) is the input to accept the human input at the runtime
		//(system.out) to give you the output
		
		Scanner s1=new Scanner(System.in);
		
		System.out.println("Please enter the value of a");
		int a= s1.nextInt();		
		System.out.println("Please enter the value of b");
		int b= s1.nextInt();		
		System.out.println("The sum of the two numbers");
		int sum=a+b;		
		System.out.println(sum);
		s1.close(); //to close the human input at the runtime
	}

}





