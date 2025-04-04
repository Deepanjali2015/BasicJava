package Arrays;
//WAP to accept the values of Array using scanner class and copy it into another array in reverese order
import java.util.Arrays;
import java.util.Scanner;

public class ArrayProgram7 
{

	public static void main(String[] args) 
	{		
		Scanner s1 = new Scanner(System.in);		
		System.out.println("Please enter the size of your array");

		int [] input = new int[5];//declaring an int array for input
		
		input[0]=55;
		input[1]=45;
		input[2]=35;
		input[3]=25;
		input[4]=15;

		//to copy the value from one array into another array in the reverse order, create a new array for output
		//array to be copied will be on the right side, array which needs the value to be pasted will be on the left hand side
		
		int [] output = new int[input.length];//declaring an int array for output 

		for (int i=0,j=input.length-1;i<=input.length-1;i++,j--)//declaring both variables and condition is input.length-1 for any size
		{
			output[j] = input[i];
		}

		System.out.println("Input Array is:- "+Arrays.toString(input));
		System.out.println("Output Array is:- "+Arrays.toString(output));
		s1.close();		
			
	}

}
