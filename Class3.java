package AccessSpecifierCase3;

import AccessSpecifierCase1.Case3ofAccessSpecifier;

//This is a child class as it has the main method
//we are trying to access the parent class from a different package 
//cannot access the private and default access specifier of a diff class from diff package 

public class Class3 extends Case3ofAccessSpecifier
{

	public static void main(String[] args) 
	{
	
		add();//to access the static method from the parent, you can call directly
		mul();
				
	}


}
