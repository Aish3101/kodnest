package kodnestprograms;

public class Pattern23 {
	
		public static void main(String[] args)
		{
			displaynonpryramid1();
			displaypryramid1(); //calling method
			
			
		}
		public static void displaypryramid1()
		{
			for(int i=1;i<=5;i++)  //line
			{
				for(int j=1;j<=(5-i);j++) //space
				{
					System.out.print(" ");//printing space
				}
				for(int k=1;k<=i;k++) //star
				{
					if(k==1||k==i)// printing start at 1st and end
					{
					System.out.print('*'); //printing star
				}
				else
				{ 
					System.out.print(" ");//printing
				}
				if(k<i)  //space after star
				{
					System.out.print(' ');//printing space after star
				}
				}
				System.out.println();//changing line
				
			}}
			
		
		public static void displaynonpryramid1()
		{
			for(int i=1;i<=5;i++) //line
			{
				for(int j=1;j<=i;j++) //space
				{
					System.out.print(" "); //printing space
				}
				for(int k=1;k<=(5-i);k++)  //star
				{
					if(k==1||k==(5-i)) // printing start at 1st and last position
					{
						System.out.print('*');
					}
						else
						{
							System.out.print(' '); //printing space
						} //printing star
				
				if(k<(5-i)) //space after star
				{
					System.out.print(' ');//printing space after space
				}
				}
				System.out.println(); //changing line
				
			}
		}

}
