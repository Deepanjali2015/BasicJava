package ParaNonParaMethod;

public class CallNonStaticMethod 
{

	//this is a program to execute the non static method
	//Class name is CallNonStaticMethod
	//declaring the variable as NS and give the classname
	//give the reference variable which is NS
	//give the nonstaticmethod (add,sub,mul)	
		
	void add()
	{
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
	
	void sub()
	{
		int a=10;
		int b=20;
		System.out.println(a-b);
	}
	
	void mul()
	{
		int a=10;
		int b=20;
		System.out.println(a*b);
	}
	
	public static void main(String[] args) 
	{
		//classname variable=new Classname();
		CallNonStaticMethod NS=new CallNonStaticMethod();//Object creation

		//referencevariable.nonstaticmethod()
		NS.add();
		NS.sub();
		NS.mul();
		
				
	}

}
