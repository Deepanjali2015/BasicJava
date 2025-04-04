package Arrays;

import java.util.Arrays;

public class ArrayProgram2 
{

	public static void main(String[] args) 
	{

		String input="hello";
		char c1 [] =  input.toCharArray();
		//predefined method available for Array to convert the array into "toString"
		
		System.out.println(Arrays.toString(c1));//predefined class called Arrays and static method as toString			
		
		//to print the array in a single line, we have a predefined method, which prints the output in the array format
		//predefined  class is Array, and the static method is toString
		
		System.out.println(Arrays.toString(c1));
				
		
		//avoid writing the for loop with the below concept
		/*for (int i=0;i<=4;i++)//for loop can be written in this way too
			//for (int i=0;i<=input.length()-1;i++)			
		{
			System.out.println(c1[i]);
		}
		*/
		
	}

}
