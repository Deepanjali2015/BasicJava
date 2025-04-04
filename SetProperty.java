package CollectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetProperty 
{
	public static void main(String[] args) 
	{
		//the purpose of set is that it stores only unique values in it
		Set s1=new HashSet();//upcasting from Hashset to Set
		s1.add("Ajita");
		s1.add("Anusha");
		s1.add(85);
		s1.add(true);
		s1.add(1.547);
		System.out.println(s1);
		System.out.println("Forward Iteration using Iterator");		
		Iterator i1=s1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
	}

}
