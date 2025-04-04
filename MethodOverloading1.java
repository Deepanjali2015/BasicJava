package ParaNonParaMethod;

public class MethodOverloading1
{

	static void mod()
	{
		int a=100;
		int b=3;
		System.out.println(a%b);
	}
	static void number(int a,char c)
	{
		System.out.println(a);
		System.out.println(c);
	}
	static void result(String name, boolean a)
	{
		System.out.println(name);
		System.out.println(a);
	}
	static void details()
	{
		String name="Surya";
		boolean result=true;
		char Identity='K';
		float decimal=1.256f;	
		System.out.println(name);
		System.out.println(result);
		System.out.println(Identity);
		System.out.println(decimal);
	}
	static void random(double a,int b, char c)
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
		
	public static void main(String[] args) 
	{
		mod();
		number(5, 'S');
		result("Akash", true);
		details();
		random(8.987421, 450, 'A');			
	}

}

