package Arrays;
//store the size of the array using Scanner class 
import java.util.Arrays;
import java.util.Scanner;

public class ArrayProgram4 
{

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);//scanner class
		System.out.println("Please enter the size of an array");
		int[] rollno = new int[s1.nextInt()];//storing the size of the array using scanner class		
		for (int i=0;i<=rollno.length-1;i++)
		{
			System.out.println("Please enter the value at index positio -> "+i);
			rollno[i] = s1.nextInt();
		}
		
		System.out.println(Arrays.toString(rollno));
		s1.close();

	}

}

