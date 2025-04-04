package Variables;

public class GlobalVariableNonStatic 
{
	int noofdays2025=365; //non static Global variable
	
	//Non static variable cannot be called directly in the main static method
	//we need to create an object and assign the reference variable to the classname
	
	
	public static void main(String[] args) 
	{
		int earningperday=200;//declaring the local variable
		
		earningperday=210; //updating the value of a local variable
		
		GlobalVariableNonStatic g1=new GlobalVariableNonStatic();
		
		g1.noofdays2025=366; //updating the non static global variable. 
		
		int totalearning=earningperday*g1.noofdays2025;//Call the ref var and assign it to Global variable
		
		System.out.println(totalearning);//it will consider the updated value
		
	}

}
