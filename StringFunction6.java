package String;
//this is a program for string function reverse 
public class StringFunction6 
{
	public static void main(String[] args) 
	{
		String input="mouse";
		String output="";		
		//for (int input.length()-1;i>=0;i--) //can write it this way too		
		for (int i=4;i>=0;i--)		
		{
			char a=input.charAt(i);//charAt(index) (char at indexing position)
			output=output+a;
		}
		
		System.out.println("The output of the given input is:- "+output);
		
	}

}
