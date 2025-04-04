package SuperCallingStatement;

//SCS must always be in the 1st line in every constructor (one Const will have only 1 SCS).  If not, compile error
	//It is used to call the parent class constructor from the child class constructor
	//SCS can be written in 2 ways: implicitly (dont write it) and explicitly (write it)
	//2 types - NP (to invoke the NP parent class constructor). Can be written in both implicit or explicit way
	//parameterized - (to invoke the parameterized parent class constructor).  Can only be written in explicit way	
	//if parent class const is NP, child class const must also be NP, and implicit way (no need to write it) 
	//if parent class const is parameterized, then, it is mandatory to pass SCS with matching arguments
	
	class GoogleAuth 
		{
			GoogleAuth(int a,double b) 
			{
				System.out.println("I am constructor 2");
			}
		}
	
public class SuperCalling extends GoogleAuth //creating a relationship between child class and parent class
	{	
	SuperCalling() // Parameterized Constructor
		{
			super(10, 9.8);//super calling statement. can be implicit or explicit 
			System.out.println("I am constructor 1");
		}

public static void main(String[] args) 
{
	new SuperCalling();
}

}
