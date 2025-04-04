package Constructor;

public class Google 
{
	//cannot pass byte, int, short, long data types at once
	//This is a constructor Overloading program
	
	Google(int a)
	{
		System.out.println("1");
	}
	Google()
	{
		System.out.println("2");
	}
	Google(int a,int b)
	{
		System.out.println("3");
	}
	Google(int a,double b)
	{
		System.out.println("4");
	}
	Google(double b,int a)
	{
		System.out.println("5");
	}
	Google(int a,double b,int c)
	{
		System.out.println("6");
	}
	public static void main(String[] args) 
	{
		Google g1=new Google();//old syntax to call the non static method		
		new Google();//syntax to call the non static method without reference variable
		
		new Google(100);
		new Google (100, 200);
		new Google (100, 200.1);
		new Google (100.1, 200);
		new Google (10, 200.2, 5);
		
	}

}
