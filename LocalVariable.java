package Variables;

public class LocalVariable 
{

	//Any variable which is declared inside any method is called a Local variable
	//The scope of the Local variable is going to be from the start of the method till the end of the method 
	//Local variable cannot be distinguished between static and non static method.  [Just because it is non static, it cannot be static]
	//Local variable cannot be utilized unless it is initialized
	//Local variable will never have any default value
	
	
	void add()
	{
		int age=10; //declaration and initialization
		System.out.println(age); //utilization
	}
	
	public static void main(String[] args) 
	{
		byte a=10; //variable for byte is number
		//declaration and initialization of 'a' variable of type bye with 100 value
		System.out.println(a);//the variable 'a' is being utilized now			

	}

}
