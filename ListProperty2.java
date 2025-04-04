package CollectionFramework;
//Upcasting from ArrayList to List with String Wrapper Class
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListProperty2 
{

	public static void main(String[] args) 
	{
		List<String> l1=new ArrayList<String>();//upcasting from ArrayList to List, only homogeneous values since there is wrapper class
		l1.add("Shoe");
		l1.add("Books");
		l1.add("Laptop");
		l1.add("Earphone");
		System.out.println(l1);

		//iterator concept is applicable to the entire collection
		//iterator abstract methods is used in collection to iterator the collection one by one
		//return type of iterator is iterator String as we have given String as a wrapper class
		//Iterator has 2 methods:  next(); and hasNext();
		
		Iterator<String> i2 = l1.iterator();
		i2.next();//return type of the next method is an object
		i2.hasNext();//will check if the element is present	
		System.out.println(i2);
		
	}

}
