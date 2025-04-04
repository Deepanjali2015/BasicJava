package ParaNonParaMethod;

public class MethodOverloading 
{
	//developing multiple methods with the same name but variations in the arguments
	
	static void add()
	{
		System.out.println("1");
	}
	static void add(int a)
	{
		System.out.println(a+6);
	}
	static void add(int a,int b)
	{
		System.out.println(a+b+6);
	}
	static void add(int a,double b)
	{
		System.out.println(a+b+6);
	}
	void add(double a,double b)
	{
		System.out.println(a+6+b);
	}
	void add(double a,double b,int c)
	{
		System.out.println(a+b+c+6);
	}
	public static void main(String[] args) 
	{
		add();
		add(90);
		add(100,200);
		add(10, 20.5);
		MethodOverloading m1=new MethodOverloading();
		m1.add (100.5, 200.5);
		m1.add(1.2, 2.5, 5);
	}

}
