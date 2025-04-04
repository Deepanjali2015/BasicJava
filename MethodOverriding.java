package ParaNonParaMethod;
//This is a Method Overriding program
//Developing a method in the child class with the same name and signature as in the parent class with diff implementation 

class PreCondition
{
	void login()
	{
		System.out.println("Login using email id");
	}
}

public class MethodOverriding extends PreCondition
{
	void login()
	{
		System.out.println("Login using mobile no");
		super.login();
	}

	public static void main(String[] args) 
	{
		MethodOverriding m1=new MethodOverriding();
		m1.login();	

	}

}
