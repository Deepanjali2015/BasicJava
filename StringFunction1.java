package String;
//this is a program on string functions for length, tolowercase and touppercase
public class StringFunction1 
{

	public static void main(String[] args) 
	{
		String input = "Ajita"; 
		int size = input.length();//length string function, method is length and storing it in int
		System.out.println(size);

		String input1 = "ABHAY"; 
		String lower = input1.toLowerCase(); //tolowercase string function 
		System.out.println(lower);

		String input2 = "anusha"; 
		String upper = input2.toUpperCase(); //touppercase string function 
		System.out.println(upper);
		
		String str1 = "abc";
		String str2 = "abc";
		str1 = str1 + "def";
		System.out.println(str1 == str2);
		

			
	}

}
