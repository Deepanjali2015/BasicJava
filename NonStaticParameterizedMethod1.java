package ParaNonParaMethod;

public class NonStaticParameterizedMethod1 
{

	void name(String name)
	{
		System.out.println(name);
	}
	
	void student_details(String name, char gender, double salary)
	{
		System.out.println(name);
		System.out.println(gender);
		System.out.println(salary);
	}
	
	void teacherdetails(boolean a,boolean b)
	{
		System.out.println(a);
		System.out.println(b);
	}
	
	
	public static void main(String[] args) 
	{
		NonStaticParameterizedMethod1 p1=new NonStaticParameterizedMethod1();
		p1.name("Bhoomi");
		p1.student_details("Abhay", 'M', 50000);
		p1.teacherdetails(true,false);				
	}

}