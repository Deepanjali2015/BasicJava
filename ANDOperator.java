package Operators;

public class ANDOperator 
{

	public static void main(String[] args) 
	{

		int a=10;
		int b=20;
		if (a==b && b>a)
		{
			System.out.println("Hello");
		}
		
		if (a!=b && b>a)
		{
			System.out.println("Bye");
		}
		if (!(a==b && b>a))
		{
			System.out.println("Hello Not");
		}
		if (!(a!=b && b>a))
		{
			System.out.println("Bye Not");
		}
	
	}

}
