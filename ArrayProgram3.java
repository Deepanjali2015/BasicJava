package Arrays;
//WAP to accept the values of array using Scanner class
import java.util.Arrays;
import java.util.Scanner;

public class ArrayProgram3 
{

	public static void main(String[] args) 
	{
		int[] rollno = new int[5];//declaring the array with size 5
		Scanner s1=new Scanner(System.in);//scanner class
		for (int i=0; i<=4;i++)//for loop to print all the 5 values declared in the datatype int, which is 5
		{
			rollno[i] = s1.nextInt();
		}
		
		System.out.println(Arrays.toString(rollno));
		s1.close();

	}

}
