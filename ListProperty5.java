package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListProperty5 
{

	public static void main(String[] args) 
	{
		//Can apply the concept of Iterator in the list
		//Can apply the concept of ListIterator in the list
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(12);
		l1.add(87);
		l1.add(97);
		l1.add(45);
		l1.add(53);
		l1.add(53);
		System.out.println("Result before sorting");
		System.out.println(l1);		
		Collections.sort(l1);		
		System.out.println("Result after sorting");
		System.out.println(l1);
	
	}

}
