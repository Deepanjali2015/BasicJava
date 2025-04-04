package String;
//this is a program on substring with single and double parameters
public class StringFunction3 
{

	public static void main(String[] args) 
	{
		String input="Manish Tiwari";//substring function with single parameter
		String output=input.substring(7);//From this indexing (7) till the end indexing, we will get the answer (7 indexing is at T, from T it will print
		System.out.println(output);
		String output1=input.substring(3);
		System.out.println(output1);
		
		String output2=input.substring(0, 3);//substring function with double parameters, for [0,3] it will consider 0, 1, 2
		System.out.println(output2);//from the start index till the end of index -1, you will get the answer
					
		
	}

}
