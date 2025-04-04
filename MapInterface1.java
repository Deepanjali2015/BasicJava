package CollectionFramework;

import java.util.HashMap;
import java.util.Map;

public class MapInterface1 
{
	public static void main(String[] args) 
	{
		Map<String, Integer> m1=new HashMap<String, Integer>();//upcasting storing String and Integer values 
		m1.put("Ram", 51);
		m1.put("Sita", 45);
		m1.put("Lakshman", 39);
		m1.put("Arjun", 51);
		System.out.println(m1);
	
	}

}
