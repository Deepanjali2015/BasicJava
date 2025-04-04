package String;
//this is a program for string function trim, equals, equals ignore and contains
public class StringFunction2 
{
	public static void main(String[] args) 	
	{
		String input = " My name is Ram ";
		System.out.println(input);
		String output = input.trim(); //trim string function, will remove spaces from the start of the string and end of the string
		System.out.println(output);		

		String name="ram";
		String name1="RAM";
		boolean b=name.equals(name1);//equals string function to compare if two inputs are same
		System.out.println(b);
		boolean b1=name1.equals(name);//equals string function
		System.out.println(b1);

		String name2="Ashwini";
		String name3="ashwini";
		boolean b2=name2.equalsIgnoreCase(name3);//equals ignore case string function
		System.out.println(b2);	
	
		String name4="ram tiwari";
		boolean b3=name4.contains("ram");//contains string function return type is true
		System.out.println(b3);
		boolean b4=name4.contains("manish");//contains string function, return type is false
		System.out.println(b4);	
	
	}

}
