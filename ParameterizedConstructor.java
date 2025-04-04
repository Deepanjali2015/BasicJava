package Constructor;

public class ParameterizedConstructor 
{
	//Constructor is Amazon
	
	ParameterizedConstructor (String UN,String PWD) //Username and Password
	{
		System.out.println("Constructor1");
	}
	
	ParameterizedConstructor (int age,char gender)
	{
		System.out.println("Constructor2");
	}
	
	public static void main(String[] args) 
	{

		new ParameterizedConstructor("stbymtk@gmail.com", "manish123");
		new ParameterizedConstructor (85, 'F');		
		
	}

}