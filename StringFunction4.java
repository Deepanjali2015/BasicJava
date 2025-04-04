package String;
//this is a program with array function replace
public class StringFunction4 
{
	public static void main(String[] args) 
	{
		String input="computer";
		String output = input.replace('c', 'k');//replace function to replace the old char to char new
		System.out.println(output);
		
		String input1="ram tiwari";
		String output1 = input1.replace("tiwari", "rai");//replace function to replace the target string with replacement string
		System.out.println(output1);
		
		String input2="K V no 2";
		//remove all the numeric letters with nothing
		String output2 = input2.replaceAll("[0-9]", ""); //regex function replacement
		System.out.println(output2);
		
		String input3="Manish Kumar Tiwari";
		//lets remove all the lower letters
		String output3 = input3.replaceAll("[a-z]", "");
		System.out.println(output3);
		
		//lets remove all the capital letters
		String output4 = input3.replaceAll("[A-Z]", "");
		System.out.println(output4);	
				
	}

}
