package ParaNonParaMethod;

public class NonStaticParameterizedMethod 
{
	//we are calling the non static parameterized method by adding arguments  
	//int is a data type and a and b are variables
	//we can call non static parameterized method for multiple methods using the same object

		void add(int a,int b)
		{
			System.out.println(a+b);
		}
		
		void sub(int a,int b)
		{
			System.out.println(a-b);
		}
		
		void mul()
		{
			int a=10;
			int b=20;
			System.out.println(a*b);
		}
			
		public static void main(String[] args) 
		{
			//we need to create an object and then call the reference variable by the method name
			
			NonStaticParameterizedMethod m1=new NonStaticParameterizedMethod();	//reference variable is m1	
			
			m1.add(10, 20); //we are calling the reference variable and assigning it to the non static method for the variables a and b
			m1.sub(10, 30); //we can call the same reference variable and assign it to a different method 
			m1.mul(); //calling the reference variable to the non static non parameterized method
			
		}
		
		}
