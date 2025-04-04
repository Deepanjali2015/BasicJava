package ParaNonParaMethod;

public class StaticParameterizedMethod 
{
	//we are calling the static parameterized method by adding arguments  
	//int is a data type and a and b are variables
	//we can call static parameterized method and static non parameterized method

	static void add(int a,int b)//static parameterized method
	{
		System.out.println(a+b);
	}
	
	static void sub(int a,int b)//static parameterized method
	{
		System.out.println(a-b);
	}
	
	static void mul()//static non parameterized method as there is no arguments 
	{
		int a=10;
		int b=20;
		System.out.println(a*b);
	}
		
	public static void main(String[] args) 
	{
		sub(10, 5);//since it is a parameterized method, we have to pass the variables
		add(100, 333);//since it is a parameterized method, we have to pass the variables
		mul();//since it is a non parameterized, we can call it directly by the method name
	}

}
