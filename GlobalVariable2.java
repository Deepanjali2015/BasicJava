package Variables;

public class GlobalVariable2 
{
	//able to utilize these variables as these are at the global variable and can use it in the other methods
	//we have used these global variables in all the static methods. [For non static, we need to create an object]
	
	static int a=10;
	static int b=20;
	
	static void add()
	{
		int sum=(a+b); //we are storing the value of a and b in Sum 
		System.out.println(sum);
	}
	static void sub()
	{
		System.out.println(a-b);
	}
	static void mul()
	{
		System.out.println(a*b);
	}
	
	public static void main(String[] args) 
	{
		add();
		sub();
		mul();
	}

}
