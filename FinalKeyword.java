package Variables;

public class FinalKeyword 
{
	
	//Any variable which is final cannot change its value
	//Final keyword can be applied to both Local and Global variable concepts
	//If Global variable is final its value cannot be changed throughout the program
	//If Local variable is final its value cannot be changed throughout the method 

	
	
	final static double Pi=Math.PI; //Global variable and cannot change the value (pi=Math.PI)
	
	
	void add()
	{
		final double Pi=3.14; //Local variable can never be distinguished between static and non static.  This is final and cant change the value 
	}
	
	
	public static void main(String[] args) 
	{
		//we can change the value of the variable a until it is not final.  
		
		final int a=100;  //Since this is a final variable, we cannot change its value
		System.out.println(a);
		

	}

}
