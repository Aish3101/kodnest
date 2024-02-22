package kodnestprograms;

public class Pattern19{
	public static void main(String[]args)
	{
		//to display triangle
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("-");
			}
			for(int k=1;k<=(5-i);k++)
			{ 
				if(k==1||k==i)
			{
				System.out.print("*");	
			}
			else
			{
				System.out.print(" ");
			}
	
				System.out.print("*");
				if(k<i)
				{
					System.out.print("-");
				}
			}
			System.out.println();
		}
		//inverted triangle
	
	for(int i=4;i>=1;i--)
	{
		for(int j=1;j<=(5-i);j++)
		{
			System.out.print("-");
		}
		for(int k=1;k<=i;k++)
		{
			if(k==1||k==i)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
			System.out.print("*");
			if(k<i)
			{
				System.out.print("-");
			}
		}
		System.out.println();
	}

}
}
