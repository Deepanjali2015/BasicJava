package StringBufferandStringBuilder;
//Program to find the length and capacity of the StringBuffer
//String Buffer and String Builder are mutable in nature, they can be changed 
public class StringBufferProgram 
{

	public static void main(String[] args) 
	
	{
		StringBuffer a1=new StringBuffer("Sudha N");
		System.out.println(a1.length());//length will be 7
		System.out.println(a1.capacity());//capacity will be 16+7
				
		StringBuffer a2=new StringBuffer(5);
		System.out.println(a2.length());//length is 0
		System.out.println(a2.capacity());//capacity is showing as 5 as we are forcefully passing the capacity as 5
		
		StringBuffer a3=new StringBuffer();
		System.out.println(a3.length());//length will be 0
		System.out.println(a3.capacity());//if we are not passing any capacity, it will show the capacity as 16
			
		StringBuilder b1=new StringBuilder("Sudha N");
		System.out.println(a1.length());
		System.out.println(a1.capacity());
	
		StringBuilder b2=new StringBuilder(5);
		System.out.println(b2.length());
		System.out.println(b2.capacity());//capacity is showing as 5 as we are forcefully passing the capacity as 5
		
		StringBuilder b3=new StringBuilder();
		System.out.println(b3.length());
		System.out.println(b3.capacity());//if we are not passing any capacity, it will show the capacity as 16
	
	}

}
