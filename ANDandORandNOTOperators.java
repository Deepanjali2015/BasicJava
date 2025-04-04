package Operators;

public class ANDandORandNOTOperators 
{

public static void main(String[] args) 
	
	{		
		
		int a=10;
		int b=20;
		
		if (a==b && a>b)
		{		
			System.out.println("Both AND operators are False");
		}
						
		if (a!=b && a<b) 
		{
			System.out.println("Both AND operators are True");
		}
		
		if (a==b || a>b)
		{
			System.out.println("Both OR operators are False");
		}
		
		if (a!=b || a<b)

		{
			System.out.println("Either of the OR Oerator is True");
		}
		
		if (!(a==b && a<=b))
		{
			System.out.println("Answer is False, but there is NOT, answer is True");
		}
		
		if (!(a!=b || a<=b))
		{
			System.out.println("Both Answers are correct, but since there is Not, Answer is FALSE");
		}
			
	}

}
