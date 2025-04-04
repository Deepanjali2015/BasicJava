package Variables;

public class GlobalVariableNonStatic1
{
	
	int noofdays2025=365; // Non Static Global variable 
		
	public static void main(String[] args) 
	{		
		int earningperday=200;
		//to call the non static global variable in the static method, you need to create an object
		//with the help of reference variable you call the Global variable and update the value
			
		GlobalVariableNonStatic1 d1=new GlobalVariableNonStatic1();
		d1.noofdays2025=366;
		
		int totalearnings=earningperday*d1.noofdays2025;//now the updated value will be calculated
		
		System.out.println(totalearnings);
		
	}

}

