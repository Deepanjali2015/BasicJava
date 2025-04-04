package ParaNonParaMethod;
//This is a program to call the static method inside the main method
//Declare the method called add and initialize or call it in the main method
public class CallStaticMethod 
{
	
	static void add()
	{
		int a=100;
		int b=200;
		int c=a+b;
		System.out.println(c);
	}
		
	public static void main(String[] args) 
	{
		
		add();
		
	}

}
