package Variables;

public class GlobalVariable1 
{
	//Global variable will have default values in it
	//for data type:  byte, short, int and long ==> it is 0
	//for data type:  double and float ==> it is 0.0
	//for data type:  char ==> it does not have any default value 
	//for data type:  String ==> it is null 
	//for data type:  boolean ==> it is false 	
	
	
	double pi=3.14;	//global variable (will be blue in color)
	static int noofdays2025=365; //global variable
	static double bankbalance; //global variable //have declared but not initialized, can be utilized
	static String name; //Name of the variable is name.  We have the freedom to initialize the variable as name="SN";
	static boolean answer;
	
	static void add()
	{
		int a=100;  //local variable (will be brown in color)
	}
	void sub()
	{
		int b=100; //local variable (cannot write static 
	}
	
	
	public static void main(String[] args) 
	{
		int c=300; //local variable
		System.out.println(bankbalance); //default value of double is 0.0
		System.out.println(name); //default value of String data type is null
		System.out.println(answer); //default value of boolean is false
		System.out.println(noofdays2025); //default value of double is 0
	}

}

