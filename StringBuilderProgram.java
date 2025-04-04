package StringBufferandStringBuilder;

public class StringBuilderProgram 
{

	public static void main(String[] args) 
	{

		StringBuilder s1=new StringBuilder("manish");
		s1.append(" tiwari");
		System.out.println(s1);

		
		StringBuilder s2=new StringBuilder("manish tiwari");		
		s2.replace(7, 13, "rai");
		System.out.println(s2);
		
	
	}

}
