package Arrays;

import java.util.Arrays;

//string function using toCharArray()
public class ArrayProgram 
{

	public static void main(String[] args) 
	{

		String input="hello";
		char [] c1 = input.toCharArray();//Declaring an array
		
		//c1[0] = 74;//initializing the array at indexing position 0
		//c1[1] = 64;//initializing the array at indexing position 1
		//c1[2] = 54;//initializing the array at indexing position 2
		//c1[3] = 72;//initializing the array at indexing position 3
		//c1[4] = 25;//initializing the array at indexing position 4
				
		System.out.println(c1[0]);//c1 at indexing position 0
		System.out.println(c1[1]);//c1 at indexing position 1
		System.out.println(c1[2]);//c1 at indexing position 2
		System.out.println(c1[3]);//c1 at indexing position 3
		System.out.println(c1[4]);//c1 at indexing position 4
				
		//using for loop to print this array
		
		for (int i=0;i<=input.length()-1;i++)
		{
			System.out.println(c1[i]);
		}
			
		
	}

}
