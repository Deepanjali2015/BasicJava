package Operators;

public class ANDOperatorInnerBracket 
{

	public static void main(String[] args) 
	{
		int a=10;
		int b=20;
		if (!(a==b && (b>a && a==10)))
		{
			System.out.println("Print both And operators are not True");
		}
		if (a!=b || (a<b && b==20))
		{
			System.out.println("Print either of the OR operators are True");
		}
		
				
	}

}
