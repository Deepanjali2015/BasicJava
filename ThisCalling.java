package ThisCallingStatement;
//This is a Constructor overloading program
//Adding TCS to call any constructor within the class, which should be in the first line.
//TCS must be written only in explicit way (If TCS is not written in explicit way, then SCS will be called
//In order to call the first constructor(which is para), then have arguments in this calling statement

public class ThisCalling 
{
	ThisCalling(int a)
	{
		this (45,9.8);
		System.out.println("1");
	}
	ThisCalling(int a, double b)
	{
		System.out.println("2");
	}
	ThisCalling()
	{
		this(100);
		System.out.println("3");
	}
	
	public static void main(String[] args) 
	{
		new ThisCalling();		
	}

}
