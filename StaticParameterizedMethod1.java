package ParaNonParaMethod;

public class StaticParameterizedMethod1 
{

	static void name(String name)
	{
		System.out.println(name);
	}
	
	static void student_details(String name, char gender, double salary)
	{
		System.out.println(name);
		System.out.println(gender);
		System.out.println(salary);
	}
	
	static void teacherdetails(boolean a,boolean b)
	{
		System.out.println(a);
		System.out.println(b);
	}
	
	
	public static void main(String[] args) 
	{
		name("Surya");
		student_details("Ramu", 'M', 99000);
		teacherdetails(true,false);
	}

}

