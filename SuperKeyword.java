package SuperKeyword;
//this is a program using super keyword
//used to inherit the property of the parent class from the child class
//without the super keyword the parent class method will be overriden 

class Google
{
	void add()
	{
		System.out.println("Parent Class will be overriden");
	}
}

public class SuperKeyword extends Google
{
	void add()
	{
		System.out.println("Child Class will be considered");
		super.add();
	}
	
	public static void main(String[] args) 
	{
		SuperKeyword s1=new SuperKeyword();
		s1.add();
	}

}
