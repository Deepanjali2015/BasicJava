package Operators;

public class ArithmeticOperators 
{

	//This is a program to call the static method inside the main method for arithmetic operators
	
		static void add()
		{
			int a=100;
			int b=200;
			int c=a+b;
			System.out.println(c);
		}
		
		static void sub()
		{
			int a=100;
			int b=200;
			int c=b-a;
			System.out.println(c);
		}
		
		static void mul()
		{
			int a=100;
			int b=2;
			int c=a*b;
			System.out.println(c);
		}
		
		static void div()
		{
			int a=100;
			int b=200;
			int c=b/a;
			System.out.println(c);
		}
		
		static void mod()
		{
			int a=100;
			int b=9;
			int c=b%a;
			System.out.println(c);
		}
		
		public static void main(String[] args) 
		{			
			add();
			sub();
			mul();
			div();
			mod();
		}

	}
