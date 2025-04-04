package Arrays;
//Program on string function matches
public class ArrayProgram12 
{

	public static void main(String[] args) 
	{
		//check if the given string consists of exact 4 characters
		String input="amol";
		boolean b1 = input.matches("....");//this is one of the regex function to check if the given string matches the input
		System.out.println(b1);
	
		//lets check if the string ends with 't'
		String input1="prashant";
		boolean b2 = input1.matches("(.*)t");//(.*) regex function which is a multicharacter
		System.out.println(b2);//result will be true
		
		//lets check if the string starts with 'p'
		boolean b3 = input1.matches("p(.*)");
		System.out.println(b3);//result will be true
		
		//check if the given input have man in it
		String input2="spiderman";
			//manager
			//heman
			//batman
			//ironman
		
		boolean b4 = input.matches("(.*)man(.*)");//(.*) regex function, multicharacter
		System.out.println(b4);
		//case 1:  multi char + man
		//case 2:  multi char + man + multi char 
		//case 3:  man + multi char 
	
	}

}
