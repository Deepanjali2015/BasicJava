package Arrays;
//WAP to check if two arrays are equals to each other 
import java.util.Arrays;
import java.util.Scanner;

public class ArrayProgram8 
{

	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Please enter the size of your array1");
		int [] array1=new int[s1.nextInt()];		
		int [] array2=new int[array1.length];
		
		for (int i=0;i<=array1.length-1;i++)
		{
			System.out.println("Please enter the value of array1 at index:"+i);
			array1[i]= s1.nextInt();
			System.out.println("Please enter the value of array2 at index:"+i);
			array2[i]= s1.nextInt();
		}
		System.out.println("First Array is: -> "+Arrays.toString(array1));
		System.out.println("First Array is: -> "+Arrays.toString(array2));
		
		boolean b1= Arrays.equals(array1, array2);//return type of equals is always boolean
		if (b1==true)
		{
			System.out.println("Both Arrays are EQUAL");
		}
		else
		{
			System.out.println("Both Arrays are not  EQUAL");
		}
			
		
	}

}
