package MathClass;

public class MathClass 
{
	//It is predefined, has only static methods in it
	//To access the static method of different class, you can use it by classname.method name
	//class name is MathClass, method name is add, sub, mul, div, max, min, abs, randomW
	
	public static void main(String[] args) 
	{
		//Math.addExact(0, 0)
		//Math.subtractExact(0, 0)
		//Math.multiplyExact(0, 0)
		//Math.floorDiv(0, 0)
		//Math.max(0, 0)
		//Math.min(0, 0)
		//Math.abs(0) //absolute... It is going to return the positive value in case given a negative value
		//Total of 21 methods for Math
				
		
		System.out.println (Math.addExact(100, 200));
		System.out.println (Math.addExact(4578578604578l, 325896470745l)); //for long data type which is out of range, type l in front of it
        //2 methods for add	
		System.out.println(Math.subtractExact(100, 20));
		System.out.println(Math.subtractExact(4785692149l, 712358964750l));
		//2 methods for sub
		System.out.println(Math.multiplyExact(4, 120));
		//3 methods for mul
		System.out.println(Math.max(75, 82));
		//4 methods for max
		System.out.println(Math.min(75, 80));
		//4 methods for min
		System.out.println(Math.abs(-96));
		//4 methods for absolute, which will return a positive value in case if it is negative value 
		double pi= Math.PI; //universal value, return type is double
		//1 method for PI
		System.out.println(Math.PI); //instead of 3.14 write Math.PI
		//1 method for random
		System.out.println(Math.random());//random will generate random value between 0 and 1
	
				
	}
		
}
