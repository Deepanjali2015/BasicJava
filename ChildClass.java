package Inherritance;
//this is a single level inheritance program
//we created another class called Parentclass.  
//when we have two classes, both of them will not have control in the main method
//only the class name present in the package explorer will have the main method (ChildClass)

class Parentclass
{
	static void add()
	{
		
	}
}

//the class on the left side is child, class on right side is parent
//in order to call the Parentclass method we need to extend the ChildClass with the Parentclass

public class ChildClass extends Parentclass 
{
	static void sub()
	{
		
	}
	
	public static void main(String[] args) 
	{
		sub();//able to call this method as the class name is present in the package Explorer
		add();//now we able able to utilize the Parentclass property. 
	}

}
