package ForLoop;

public class ContinueKeyword 
{

	public static void main(String[] args) 
	{

		//Program for Continue keyword using if loop
		
				for (int i=1;i<=5;i++)
				{					
					if (i==2)
					{
						continue; // skipping this particular iteration, skips 2
					}
					if (i==4)
					{
						continue; // skipping this particular iteration, skips 4
					}
					
				System.out.println(i);
				}
			
				for (int i=1;i<=5;i++)
				{					
					if (i==3)
					{
						System.out.println("Lets skip "+i);
						continue; // skips 3
					}
				System.out.println("Manish "+i);
				}

	}

}
