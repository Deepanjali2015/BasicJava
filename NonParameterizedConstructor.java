package Constructor;

public class NonParameterizedConstructor 
{

	//This is a non parameterized Constructor 
	
	NonParameterizedConstructor()
	{
	System.out.println("This is a non parameterized constructor");	
	}
	
	public static void main(String[] args) 
	{
		//Calling the non parameterized constructor by creating an object
		//There is no reference variable to call the method
		
		NonParameterizedConstructor p1=new NonParameterizedConstructor();

		//2nd syntax to create an object without a reference variable
		new NonParameterizedConstructor();
		
	}

}
