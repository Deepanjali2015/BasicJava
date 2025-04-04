package Arrays;
//WAP to count the number of alphabets present in the string
//WAP to count the number of numeric letters present in the string
//WAP to count the number of space letters present in the string
//WAP to count the number of special letters present in the string
import java.util.Arrays;

public class ArrayProgram10 
{

	static int countofalpha=0;
	static int countofnumeric=0;
	static int countofspaces=0;
	
	public static void main(String[] args) 
	{
		String input="k v no 2";//Alphabets=4, numbers=1, space=3, special character=0
		//convert the input into charofarray
		char [] array = input.toCharArray();//to check each indexing value
		System.out.println("Input Array is: ->"+Arrays.toString(array));
		for (int i=0; i<=array.length-1;i++)
		{
			boolean b1 = Character.isAlphabetic(array[i]);			
			if (b1==true)
			{
				countofalpha++;
			}
					
			boolean b2 = Character.isDigit(array[i]);
			if (b1==true)
			{
				countofnumeric++;
			}
			boolean b3 = Character.isWhitespace(array[i]);
			if (b1==true)
			{
				countofspaces++;
			}
								
		}
		
		System.out.println("Count of alphabets in the given Array: -> " +countofalpha);
		System.out.println("Count of digits in the given Array: -> " +countofnumeric);
		System.out.println("Count of spaces in the given Array: -> " +countofspaces);
		
		int countofspecialcharacters = input.length()-(countofalpha+countofnumeric+countofspaces);
		System.out.println("Count of special characters in the given Array: -> " +countofspecialcharacters);
				
	}
}
