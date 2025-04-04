package SuperCallingStatement;
//here Super calling statement has been written in the explicit way

class Super_3
{
	Super_3(String name,double b)
	{
		System.out.println("3");
	}
}
class Super_2 extends Super_3
{
	Super_2()
	{
		super ("SN", 9.87);
		System.out.println("2");
	}
}

public class Super_1 extends Super_2
{	
	Super_1()
	{
		super();
		System.out.println("1");
	}
	
	public static void main(String[] args) 
	{
		new Super_1();		
	}

}
