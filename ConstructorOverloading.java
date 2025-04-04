package Constructor;

public class ConstructorOverloading 
{
	//cannot pass byte, int, short, long data types at once
	//Constructor name is ConstructorOverloading
	
	ConstructorOverloading(int a)
	{
		System.out.println("1");
	}
	ConstructorOverloading()
	{
		System.out.println("2");
	}
	ConstructorOverloading(int a,int b)
	{
		System.out.println("3");
	}
	ConstructorOverloading(int a,double b)
	{
		System.out.println("4");
	}
	ConstructorOverloading(double b,int a)
	{
		System.out.println("5");
	}
	ConstructorOverloading(int a,double b,int c)
	{
		System.out.println("6");
	}
	public static void main(String[] args) 
	{
		ConstructorOverloading g1=new ConstructorOverloading();//old syntax to call the non static method		
		new ConstructorOverloading();//syntax to call the non static method without reference variable
		
		new ConstructorOverloading(100);
		new ConstructorOverloading (100, 200);
		new ConstructorOverloading (100, 200.1);
		new ConstructorOverloading (100.1, 200);
		new ConstructorOverloading (10, 200.2, 5);
		
	}

}
