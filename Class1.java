package AccessSpecifierCase2;
//this is a child class as it has the main method
//accessing the methods from a different class within the same package
//cannot access the private access specifier of a different class
public class Class1
{

	public static void main(String[] args) 
	{
		
		Class2.add();
		Class2.mul();
		Class2.div();

	}

}
