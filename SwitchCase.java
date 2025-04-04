package SwitchCase;
import java.util.Scanner;
public class SwitchCase 
{	
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);		
		System.out.println("Enter which case you want to execute");
		int input= s1.nextInt();				
		
		switch (input)
		{
		
		//switch case in java:  switch, case, logic, break. These are all keywords
		
		case 1:System.out.println("Chrome Browser Automation");
			break;  //if break statement is not there then every case will get executed. 
					//If break statement is defined at the end, then which ever case is defined, all the cases below will execute and then stop where there is a break
			
		case 2:System.out.println("Mozilla Browser Automation");
			break;
		
		case 3:System.out.println("Edge Browser Automation");		
			break;
		
		case 4:System.out.println("Safari Browser Automation");
			break;
		
		default:
			System.out.println("Wrong Selection, Please select 1, 2, 3 or 4 only");
			
		//if a different case is selected then default will execute
		
		}

	}

}
