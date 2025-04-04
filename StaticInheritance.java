package Inherritance;

//This is a multi-level inheritance program

class Inherit_3
{
	static void a()
	{
		
	}
}
class Inherit_2 extends Inherit_3
{
	static void b()
	{
		
	}
}

public class StaticInheritance extends Inherit_2
{
	static void c()
	{
		System.out.println("Print 1");
	}
	public static void main(String[] args) 
	{
		StaticInheritance.c();
		StaticInheritance.b();
		StaticInheritance.a();
	}

}
