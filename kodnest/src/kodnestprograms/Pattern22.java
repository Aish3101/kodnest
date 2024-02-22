package kodnestprograms;

public class Pattern22 {
	public static void main(String[] args)
	{
		//line
		for(int i=1;i<=5;i++)// line
		{
			//space
			for(int j=1;j<=(5-i);j++) 
			{
				System.out.print(" ");//printing space
			}
			//star
			for(int k=1;k<=i;k++)
			{
				if(k==1||k==i) // printing start at 1st and last position
			{
				System.out.print('*');
			}
				else
				{
					System.out.print(' '); //printing space
				}
			
			//space after star
				if(k<i)
			{
				System.out.print(' ');
			}
			}
			System.out.println();//changing line
			
		}
		//line
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++) //space
			{
				System.out.print(" ");//printing space
			}
			for(int k=1;k<=(5-i);k++) //star
			{
				if(k==1||k==(5-i)) //printing start at 1st and last position
				{
					System.out.print('*');//printing star
				}
					else
					{
						System.out.print(' ');//printing space
					}
				
				
			
			if(k<(5-i) )    //printing space after star                                                                                                                                                      ) //space after star
			{
				System.out.print(' ');   //printing space
			}
			}
			System.out.println(); //changing line
			
		}
	}
}
