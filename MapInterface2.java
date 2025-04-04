package CollectionFramework;
import java.util.HashMap;
import java.util.Map;

public class MapInterface2
{
	public static void main(String[] args) 
	{
		Map<String, Integer> m1=new HashMap<String, Integer>();//upcasting
		m1.put("Mouse", 15);
		m1.put("Monitors", 45);
		m1.put("CPU", 39);
		m1.put("Keyboards", 14);
		m1.put("Pendrive", 120);		
		System.out.println(m1);
	
		Map<String, Integer> m2=new HashMap<String, Integer>();//upcasting
		m2.put("Screenguard", 40);//parameter of put is Map
		m2.put("Headphone", 60);
		System.out.println(m2);
		m2.putAll(m1);//parameter of putAll is object, object
		System.out.println(m2);
		
		boolean b1=m2.isEmpty();
		System.out.println(b1);
		
		//m2.clear();
		//System.out.println("After empty:" +m2);
		
		m2.putIfAbsent("Waterbottle", 5);//If we declare anything which is present, it will not duplicate it
		System.out.println(m2);
		
		m2.remove("Keyboards");//removing the particular key, which has just the object
		System.out.println(m2);
	
		m2.remove("Pendrive", 120);//remove method having key and value, which has just the  object key and value
		System.out.println(m2);
		
		m2.replace("Mouse", 35);//replace a particular value for the given key
		System.out.println(m2);
		
		m2.replace("Headphone", 60, 150);//to replace with the given key and old value to new value
		System.out.println(m2);
		
		System.out.println(m2.get("Monitors"));//get method to fetch the value of the key 
		
	}

}
