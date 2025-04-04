package CollectionFramework;
//Upcasting from ArrayList to List with String Wrapper Class
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListProperty3
{

	public static void main(String[] args) 
	{
		List<String> l1=new ArrayList<String>();//upcasting from ArrayList to List, only homogeneous values since there is wrapper class
		l1.add("Shoe");
		l1.add("Books");
		l1.add("Laptop");
		l1.add("Earphone");		
		System.out.println(l1);

		Iterator<String>i2=l1.iterator();
		while (i2.hasNext())//forward iteration
		{
			System.out.println(i2.next());
		}
						
		//Iterator has 2 methods:  hasNext() and hasPrevious();
		
		ListIterator i4=l1.listIterator();
		i4.hasNext();//return type is boolean
		i4.hasPrevious();//return type is boolean
		i4.next();//return type is object
		i4.previous();//return type is object
		
		System.out.println(i4);
						
	}
	
	
}
		
		
