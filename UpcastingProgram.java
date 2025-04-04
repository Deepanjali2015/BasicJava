package CollectionFramework;

public class UpcastingProgram //this is the child class
{
	void add()	
	{
		
	}		
	
	public static void main(String[] args) 
	
	{	//convert the child class object into Super Class, whatever is being converted must be on the right-hand side
		//the parent class of this child class is Object class
		//we can access only the methods of parent class property & anything on top of if, we cannot access the child class property
		//Upcasting implicit syntax		
	
		Object o1 = new UpcastingProgram();//this is child class object, converting it to parent class
				
		//Upcasting explicit syntax		
		Object o2=(Object) new UpcastingProgram();
		
		
		
	}

}
