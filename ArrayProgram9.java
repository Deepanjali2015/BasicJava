package Arrays;
//WAP to find the average value of an array which belongs to int datatype
import java.util.Scanner;

public class ArrayProgram9 
{

	public static void main(String[] args) 
	{
		double sum=0;
		double average;
		Scanner s1 = new Scanner(System.in);
		System.out.println("Please enter the size of your array : ");
		double [] array=new double[s1.nextInt()];
		for (int i=0;i<=array.length-1;i++)
		{
			System.out.println("Please enter the value of array1 at index: "+i);
			array[i] = s1.nextDouble();//for double datatype, you can use int and double values only [cant use byte short and long values]
			sum=sum+array[i];				
		}
	
		System.out.println("The sum of values is your array->"+sum);
		average=sum/array.length;
		System.out.println("Average of the array is->"+average);
		s1.close();	
		
	}

}
