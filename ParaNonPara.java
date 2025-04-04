package ParaNonParaMethod;

public class ParaNonPara 
{
	//how to add static and non static method in the main method
	//how to call the static and non static method in the main method  
	//for non static method, create an object and assign a reference variable
	
	static void method1 (char a,char b,String name)
	{
		System.out.println('A');
		System.out.println('B');
		System.out.println(name);
	}	
	void method2 (boolean a, String name, double d)
	{
		System.out.println(true);
		System.out.println(name);
		System.out.println(2.5);
	}
	static void method3 ()
	{
		
	}	
	static void method4 ()
	{
		
	}
	void method5 (int a,int b,int c,double d)
	{
		System.out.println(2);
		System.out.println(4);
		System.out.println(6);
		System.out.println(3.14);
	}
	
	public static void main(String[] args) 
	{
		method1('A', 'B', "Akash");
		ParaNonPara p1 =new ParaNonPara();
		p1.method2(true, "Amoolya", 2.5);
		method3();
		method4();
		p1.method5(2, 4, 6, 3.14);

	}

}
