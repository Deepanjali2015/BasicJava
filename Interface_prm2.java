package Interface;
//This is a program for Multi Level Inheritance using Interface Concept
//creating a relationship between a class and interface and interface to interface
interface Five
{
	void six(); //abstract methods
	void seven1();
}
interface Four extends Five
{
	void eight();
	void nine();
}

public class Interface_prm2 implements Four 
{
	static void ten() //concrete methods
	{
		
	}
	void eleven()
	{
		
	}
public static void main(String[] args) 
	{		

	}
	
	public void six() //we can manually write the override to add unimplemented method 
	{
		
	}
	
	public void seven1() 
	{
		
	}
	
	public void eight() 
	{
		
	}
	
	public void nine() 
	{
	
	}
			
}


