package CollectionFramework;
//upcasting from ArrayList to List
import java.util.ArrayList;
import java.util.List;

public class ListProperty 
{
	public static void main(String[] args) 
	{
		List l1=new ArrayList();//upcasting from ArrayList to List, no wrapper class hence we have can have heterogeneous values
		l1.add("Shoe");
		l1.add("Books");
		l1.add("Laptop");
		l1.add("Earphone");
		l1.add(50000);
		l1.add(true);
		l1.add('A');
		l1.add(4500);//adding an object
		l1.add(0, "Manish");//adding an index and an object
		System.out.println(l1);

		List l2=new ArrayList();
		l2.addAll(l1);
		System.out.println(l2);
		l2.remove(0);
		System.out.println(l2);
		l2.remove("Shoe");
		System.out.println(l2);
	
		List l3=new ArrayList();		
		l3.removeAll(l2);
		System.out.println(l3);
		
			
	}

}
