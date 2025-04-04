package AbstractKeyword;
//this is a program for abstract class
//if you have abstract method then you need to have a abstract class
//no implementation - means no method body
//used to integrate between two companies
abstract class Authentication //abstract class
{
	abstract void login(); //abstract method
	
}
public class AbstractClass extends Authentication //adding the unimplemented program - overriding
{	

	public static void main(String[] args) 
	{
		
	}
	
	void login() 
	{
		System.out.println("Login with OTP");		
	}

}
