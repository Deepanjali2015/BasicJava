package Interface;
//creating a relationship between a class and an interface (single level inheritance)
//syntax of the interface is: interface and name of the interface
//the logic shared in the interface can be shared and two companies can integrate  
interface One
{
	void logic1(); //abstract method (there is no need to write abstract in front of it)
	void logic2(); //every method present in interface will be by default public (no need to write public)
}
public class Interface_pgm implements One 
{
	public static void main(String[] args) 
	{

	}

	public void logic1()//added the unimplemented method 
	//the logic present in here will stay within the org and will never be shared/visible with other companies
	{
		System.out.println("Write the real logic1");
	
	}

	public void logic2() 
	{
		System.out.println("Write the real logic2");

	}

}
