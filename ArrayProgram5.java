package Arrays;
//WAP to accept the values of Array using scanner class and copy it into another array using boolean
import java.util.Arrays;
import java.util.Scanner;

public class ArrayProgram5 
{
	public static void main(String[] args) 
	{		
		Scanner s1 = new Scanner(System.in);	
		System.out.println("Please enter the size of your array");
		boolean [] answer=new boolean[s1.nextInt()];//creating an array of boolean and accept the size of array at runtime 
		for (int i=0;i<=answer.length-1;i++)
		{
			System.out.println("Plese enter the value at the index position "+i);
			answer[i]=s1.nextBoolean();//accept the values of array using boolean values
		}
		System.out.println("This is your Input Array:- "+Arrays.toString(answer));
		s1.close();
		
		//to copy the value from one array into another array, create a new array, size will be the length of array
		boolean [] answer1=new boolean[answer.length];//array to be copied will be on the right side, array which needs the value to be pasted will be on the left hand side
		for (int j=0;j<=answer1.length-1;j++)
		{
			answer1[j]=answer[j];
		}
		System.out.println("This is your output/copied Array:- "+Arrays.toString(answer1));
	
	}

}
