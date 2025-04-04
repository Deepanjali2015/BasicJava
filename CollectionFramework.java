package CollectionFramework;
//Finding out the behavior (property) of collection(I)
import java.util.ArrayList;
import java.util.Collection;

public class CollectionFramework 
{

	public static void main(String[] args) 
	{
		//converting the ArrayList (child class) to Collection Interface
		Collection c1=new ArrayList();//this is upcasting, implicit manner
		c1.add("Anusha");//you can pass any value in the object
		c1.add(true);
		c1.add(3.14);
		c1.add(50000);
		c1.add('A');
		
		System.out.println(c1);
		
	}

}
