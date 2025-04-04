package CollectionFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapInterface3 
{
	public static void main(String[] args) 
	{
		//map can be iterated in three ways
		Map<String, Integer> m1=new HashMap<String, Integer>();//upcasting
		m1.put("Mouse", 15);
		m1.put("Monitors", 45);
		m1.put("CPU", 39);
		m1.put("Keyboards", 14);
		m1.put("Pendrive", 120);		
		System.out.println(m1);
		System.out.println("Iterating all keys");
		for (String s2 : m1.keySet())//get all the keys
				{
					System.out.println(s2); 					
				}
		System.out.println("Iterating all values");
		for (Integer i1 : m1.values())//get all the values
		{
			System.out.println(i1); 					
		}	
		
		//return type of entrySet is a set of entry of String, Integer
		//to iterate both keys and values together		
		System.out.println("Iterate both keys and values in pair");
		for(Entry<String, Integer> e1 : m1.entrySet())
		{
			System.out.println(e1);
		}
	}

}
