package ForLoop;

public class PrintNumbers 
{

	public static void main(String[] args) 
	{
		
		for (int i=1;i<=5;i++) //answer will be 1 thru 5
		{
			System.out.println(i);
		}
			
		for (int i=-5;i<=5;i++)//answer will be -5 thru +5
		{
			System.out.println(i);
		}
	
		//for (int i=0;i>-1;i++) //infinite loop.  Will continue till the int data type range
		//{
			//System.out.println(i);
		//}
		
		for (int i=0;i>-1;i--) //answer will be 0
		{
			System.out.println(i);
		}
		
		for (int i=2;i>-3;i--) //answer will be 2,1,0,-1,-2
		{
			System.out.println(i);
		}
	}

}
