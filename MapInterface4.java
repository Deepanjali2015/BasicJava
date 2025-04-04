package CollectionFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapInterface4 
{

	public static void main(String[] args) 
	{
		Map<String, Integer> m1 = new HashMap<String, Integer>();
		m1.put("Mouse", 50);
		m1.put("Monitors", 60);
		m1.put("Keyboards", 10210);
		
		Set<Entry<String, Integer>> s2 = m1.entrySet();
		Iterator<Entry<String, Integer>> s3 = s2.iterator();
		//while (s3.hasNext())
		//{
			//System.out.println(s3);
		//}
		
		
		
		
		
		
		
		
		
	}

}
