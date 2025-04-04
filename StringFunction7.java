package String;
//WAP to check if the given string is a palindrome
public class StringFunction7 
{

	public static void main(String[] args) 
	{
		String input="radar";
		String output="";
		
		for (int i=input.length()-1;i>=0;i--)
		{
			char a=input.charAt(i);//charAt(index) (char at indexing position)
			output=output+a;			
		}
		
		System.out.println("The output of the given input is: "+output);
		if (input.equals(output))
		{
			System.out.println("The input string is a palindrome");
		}
		else
		{
			System.out.println("The input string is not a palindrome");
		}
		
	}

}


