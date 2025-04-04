package ScannerClass;

import java.util.Scanner;

public class ScannerClass1 
{

	public static void main(String[] args) 
	{

	//s1 is the reference variable and next is the method name for non static method
	//s1.next(for all the variables) --> return type will be the same as the variables
	//We get an runtime mismatch exception error if an incorrect value is passed during human input at the run time 
		
		Scanner s1=new Scanner(System.in); 
			
		String name=s1.next();
		byte a=s1.nextByte();
		short b=s1.nextShort();
		int c=s1.nextInt();
		long d=s1.nextLong();
		boolean answer=s1.nextBoolean();
		float f1 =s1.nextFloat();
		double d1 = s1.nextDouble();				
		s1.close();
	}

}
