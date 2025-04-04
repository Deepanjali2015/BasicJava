package CollectionFramework;
//it can store duplicate values, it is dynamic in nature (keeps increasing or decreasing, it does not have a specific size)
import java.util.ArrayList;
import java.util.Collection;

public class CollectionFramework1 
{

	public static void main(String[] args) 
	{
		//upcasting from ArrayLit to Collection  
		Collection c1=new ArrayList();//this is upcasting, implicit manner
		c1.add("Anusha");//you can pass any value in the object
		c1.add(true);
		c1.add(3.14);
		c1.add(50000);
		c1.add('A');
		
		c1.add("Anusha");//you can pass any value in the object
		c1.add(true);
		c1.add(3.14);
		c1.add(50000);
		c1.add('A');
		
		System.out.println(c1);

		
	}

}
