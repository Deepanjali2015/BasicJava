package Variables;

public class GlobalVariable 
{
	
		//Any variable which is declared inside the class but outside any method is called a Global variable
		//The scope of the Global variable is going to be from the start of the class till the end of the class 
		//Global variable can be distinguished between static and non static. [Global variable can be static and non static]
		//Global variable can be utilize without initialization
		//Global variable will have default values in it
		
	
	double pi=3.14;	//global variable (will be blue in color)
	//This is declare inside the class, but outside the main method
	
	static void add()
	{
		int a=100;  //local variable (will be brown in color)
	}
	void sub()
	{
		int b=100; //local variable
	}
	
	
	public static void main(String[] args) 
	{
		int c=300; //local variable

	}

}
