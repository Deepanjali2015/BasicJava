package Constructor;

public class ConstructorProgram 
{
	//Class name is ConstructorProgram
	
	//Constructor can have all 4 types of access specifier - public, priviate, protected, defaulter package
	//Constructor is always non static
	//There will not be any return type
	//It will have the same name as Class name 
	//It can be parameterized or non parameterized
	
	
	
	ConstructorProgram()  //This Constructor is default, non static, no return type, same name as class name, non parameterized 
	{
		System.out.println("This is Constructor");
	}
	
	public static void main(String[] args) 
	{
		//To call a constructor, we need to create an object
		//There is no reference variable involved in Constructor
		//Once you create an object, constructor will be called automatically

		//Can create multiple objects, variable is g1 and g2
		//two objects will call the constructor two times
		
		ConstructorProgram g1=new ConstructorProgram();
		ConstructorProgram g2=new ConstructorProgram();

		//2nd syntax to create an object
		//Syntax to create an object is === new CLassName();
		
		new ConstructorProgram();
		new ConstructorProgram();
		
	}

}
