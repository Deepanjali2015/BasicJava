package myfirstjavaprogram;

public class AssertKeyword 
{

	//Assert keyword will directly terminate the program if the expected result does not meet the expectation  
	//by default in the computer, the assert keyword will be disabled, and we need to enable it
	
	public static void main(String[] args) 
	{
		int age=10;
		assert age>=18; //condition is false, it should not print and terminate
		System.out.println("I can vote");

		
		//OR you can add a message before printing the message	
		
		//assert age>=18:"Sorry your age is less";
		//System.out.println("I Can Vote!");
		
	}

}
