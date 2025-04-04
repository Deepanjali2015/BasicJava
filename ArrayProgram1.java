package Arrays;
//WAP to create an Array of int datatype and storing String in it, find out what happens			
public class ArrayProgram1 
{

	public static void main(String[] args) 
	{
		int [] rollno=new int[5];
	
		String [] name=new String[3];
		name[0]="Sudha";
		name[1]="Sneha";
		name[2]="Shubham";
		
		System.out.println(name[0] + " roll no is -> " +rollno[0]);
		System.out.println(name[1] + " roll no is -> " +rollno[1]);
		System.out.println(name[2] + " roll no is -> " +rollno[2]);		
	
		//write the above line in single line using for loop	

		String [] c1=new String[17];
		c1[0]="Sudha";
		c1[1]="Sneha";
		c1[2]="Shubham";

		for (int i=0;i<=3;i++)
		{
			System.out.print(c1[i]);
		}
			
		
	}

}
