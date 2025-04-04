package AccessSpecifierCase4;
//This is a child class trying to access the class from a different package without creating a relationship
//we need to import and call it by classname.methodname();
//this supports only the public access specifier

import AccessSpecifierCase1.Case3ofAccessSpecifier;

public class Class4 
{

	public static void main(String[] args) 
	{
		Case3ofAccessSpecifier.add();

	}

}
