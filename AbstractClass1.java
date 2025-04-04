package AbstractKeyword;
//can expose these two classes with the third party application  
abstract class Grotech
{
	abstract void method1();
	abstract void method2();
}
abstract class Minds extends Grotech
{
	abstract void method3(); //no method body
	abstract void method4();
}
public class AbstractClass1 extends Minds //the real logic will not be exposed to the companies
{
	
	void method3() //method implementation will be in the child class 
	{		
		
	}

	void method4() 
	{
				
	}

	void method1() 
	{
			
	}

	void method2() 
	{
			
	}
	public static void main(String[] args) 
	{
		
	}
}
