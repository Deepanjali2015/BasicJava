package Inherritance;

//This is a multi-level inheritance program

class Inheritance_3
{
	void a()
	{
		
	}
}
class Inheritance_2 extends Inheritance_3
{
	void b()
	{
		
	}
}

public class NonStaticInheritance extends Inheritance_2
{
	void c()
	{
		
	}

	//If the parent and grandparent has non static method and child has static method, then
	//static method can be called directly and non static method can be called by creating an object
	
	public static void main(String[] args) 
	{
		NonStaticInheritance i1=new NonStaticInheritance();
		i1.c();
		i1.b();
		i1.a();
	}

}
