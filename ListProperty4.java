package CollectionFramework;
//Upcasting from ArrayList to List with String Wrapper Class
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListProperty4
{

	public static void main(String[] args) 
	{
		List<String> l1=new ArrayList<String>();//upcasting from ArrayList to List, only homogeneous values since there is wrapper class
		l1.add("Shoe");
		l1.add("Books");
		l1.add("Laptop");
		l1.add("Earphone");		
		System.out.println(l1);

		Iterator<String> i2=l1.iterator();
		System.out.println("Forward iteration using Iterator");
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}
		
		ListIterator<String> i4=l1.listIterator();
		System.out.println("Forward iteration usig ListIterator");
		while(i4.hasNext())//if the next element is present or not 
		{
			System.out.println(i4.next());
		}
		
		System.out.println("Backward iteration using ListIterator");
		while (i4.hasPrevious())
			{
				System.out.println(i4.previous());
			}			
		
	}

}
