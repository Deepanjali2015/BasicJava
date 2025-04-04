package StringBufferandStringBuilder;
//strings are immutable in nature
//Both String Buffer and string builder are mutable in nature 
public class StringBufferBuilder 
{
	
	public static void main(String[] args) 
	{
	
		String a="Manish";
		a.concat("Kumar Tiwari");
		System.out.println(a);
		
		
		StringBuffer a1 = new StringBuffer("Manish");
		a1.append(" Kumar Tiwari");
		System.out.println(a1);
		
		StringBuilder a2 = new StringBuilder("Manish");
		a2.append(" Kumar Tiwari");
		System.out.println(a2);
		
		
		
	}

}
