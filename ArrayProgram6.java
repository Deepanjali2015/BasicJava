package Arrays;
//WAP to accept the values of Array using scanner class and copy it into another array using int 
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayProgram6
{

	public static void main(String[] args) 
	{		
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Please enter the size of your array");
		int [] rollno = new int[s1.nextInt()];//creating an array of Int
		for (int i=0;i<=rollno.length-1;i++)
		{
			System.out.println("Plese enter the value at the index position "+i);
			rollno[i]=s1.nextInt();
		}
		System.out.println("This is your Input Array:- "+Arrays.toString(rollno));
		s1.close();
		
		//to copy the value from one array into another array, create a new array, size will be the length of array
		int [] rollno1=new int[rollno.length];//array to be copied will be on the right side, array which needs the value to be pasted will be on the left hand side
		for (int j=0;j<=rollno1.length-1;j++)
		{
			rollno1[j]=rollno[j];
		}
		System.out.println("This is your output/copied Array:- "+Arrays.toString(rollno));
	
	}

}
