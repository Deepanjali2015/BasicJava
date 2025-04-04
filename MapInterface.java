package CollectionFramework;

import java.util.HashMap;
import java.util.Map;

public class MapInterface 
{
	public static void main(String[] args) 
	{		
		Map m1 = new HashMap();
		m1.put("Student Name 1", "Ashwini");//upcasting; Map methods are object key, object value
		m1.put("Student Name 2", "Daisy");
		m1.put("Student Name 3", "Nikhil");
		m1.put("Student Name 4", "Raghav");
		m1.put("Student Name 5", "Sathya");
		m1.put("Student Name 6", "Krishna");
		System.out.println(m1);		
	}

}
