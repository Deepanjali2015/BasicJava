package ParaNonParaMethod;

public class StaticNonParameterizedMethod 
{
			
	static void mul()//static non parameterized method as there is no arguments 
	{
		int a=10;
		int b=20;
		System.out.println(a*b);
	}
		
	public static void main(String[] args) 
	{
		mul();//since it is a non parameterized, we can call it directly by the method name
	}

}
