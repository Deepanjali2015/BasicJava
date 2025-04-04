package Arrays;
//WAP to check if the given string is an anagram
import java.util.Arrays;

public class ArrayProgram11 
{

	public static void main(String[] args) 
	{
		String a="ear";//length has to be the same for anagram, but doesn't mean they are anagram
		String b="are";//sorting a and b [a, e, r]
		
		if (a.length()!=b.length())//if length of both the strings are same, lets check by sorting 
		{
			System.out.println("They are not ANAGRAM");
		}
		else
		{
			System.out.println("The length of the 2 strings are same");
			char c1[]=a.toCharArray();
			char c2[]=b.toCharArray();
			System.out.println("Before sorting c1-> "+Arrays.toString(c1));
			System.out.println("Before sorting c2-> "+Arrays.toString(c2));
			Arrays.sort(c1);//sort function of array 
			Arrays.sort(c2);//sorting the strings to check if it is anagram or not
			System.out.println("After sorting c1-> "+Arrays.toString(c1));
			System.out.println("After sorting c1-> "+Arrays.toString(c2));
			
			boolean b1 = Arrays.equals(c1, c2);
			if(b1==true)
			{
				System.out.println("They are ANAGRAM");
			}
			else
			{
				System.out.println("Sorry, they are not ANAGRAM");

			}
		}
		
	}

}
