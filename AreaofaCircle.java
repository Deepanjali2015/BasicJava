package ScannerClass;

import java.util.Scanner;

public class AreaofaCircle 
{

	public static void main(String[] args) 
	{		
		//area of a circle pi*r*r
		
		
			System.out.println("Please enter the value of the radius of a Circle");
			Scanner s1=new Scanner(System.in);
			int r=s1.nextInt();
			double area=Math.PI*r*r;
			System.out.println("The are of the Circle is:" +area);

			
			System.out.println("Please enter the area of a Circle");
			Scanner s2=new Scanner(System.in);
			int rad=s2.nextInt();
			double circ=2*Math.PI*r;
			System.out.println("The circumference of the Circle is:" + circ);
			
			
			
			
	}

}





