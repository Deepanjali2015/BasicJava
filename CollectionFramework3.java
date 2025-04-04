package CollectionFramework;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionFramework3 {

	public static void main(String[] args) 
	{
		//there will not be any warning messages if wrapper classes are added to store the data in the collection
		//we can store only homogeneous values
		//if we any use a particular data	type, we need to pass the values of the same datatype
		
		Collection<String> c1=new ArrayList<String>();//upcasting from ArrayLit to Collection  
		c1.add("Ram");//parameter of add is object
		c1.add("Pooja");
		c1.add("Prathiba");
		c1.add("Abhi");
		c1.add("Surya");
		System.out.println("Before removing All: "+c1);
		c1.removeAll(c1);//the parameter of removeAll method is a collection
		System.out.println("After removing All: "+c1);		
		
		Collection<Integer> c2=new ArrayList<Integer>();
		c2.add(14);
		c2.add(56);
		c2.add(26);
		c2.add(96);
		c2.add(257);
		System.out.println("Before removing one method: "+c2);
		c2.remove(257);	//the parameter of remove method is object	
		System.out.println("After removing one Integer: "+c2);
		
		Collection<Boolean> c3=new ArrayList<Boolean>();
		c3.add(true);
		c3.add(false);
		c3.add(true);
		c3.add(false);
		c3.add(true);	
		System.out.println("Before Clearing the method: "+c3);
		c3.clear();
		System.out.println("After clearing the methods: "+c3);
		
		boolean a1 = c1.contains("Pooja");
		System.out.println(a1);
		boolean a2 = c2.contains(56);//the parameter of contains method is object 
		System.out.println(a2);			
	
		boolean a3 = c2.containsAll(c2);//the parameter of containsAll method is a collection
		System.out.println(a3);	
	
	}

}
