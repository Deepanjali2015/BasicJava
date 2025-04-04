package CollectionFramework;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionFramework2 
{

	public static void main(String[] args) 
	{
		
		Collection c1=new ArrayList();
		c1.add("Anusha");//the parameter of add method is an object
		c1.add(true);
		c1.add(3.14);
		c1.add(50000);
		c1.add('A');		
		System.out.println(c1);

		Collection c2=new ArrayList();
		c2.addAll(c1);//the parameter of addAll method is a collection, we are adding the entire c1 collection
		c2.add("Kishore");
		System.out.println(c2);	
		c2.isEmpty();
		System.out.println("After Empty c2 is empty");
		
	}

}
