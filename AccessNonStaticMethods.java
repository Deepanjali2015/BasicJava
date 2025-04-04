package AccessSpecifierCase1;
//access specifier for all types for non static methods (includes para and non para)
public class AccessNonStaticMethods 
{

	public void add()
	{
		
	}
	private void sub()
	{
		
	}
	protected void mul()
	{
		
	}
	void div()
	{
		
	}

	public static void main(String[] args) 
	{
		AccessNonStaticMethods as1 = new AccessNonStaticMethods();
		as1.add();
		as1.sub();
		as1.mul();
		as1.div();
	}

}
