package Variables;

public class GlobalVariableStatic 
{
	
	static int noofdays2025=365; // Static Global variable 
	
	
	
	public static void main(String[] args) 
	{
		noofdays2025=366; //updating the value of the Global variable in the static method
		//if you have static global var, do no write int when you update the global variable.  If done, it becomes a local variable
		
		int earningperday=200;		
		
		int totalearning=earningperday*noofdays2025;
		
		System.out.println(totalearning);
		
	}

}