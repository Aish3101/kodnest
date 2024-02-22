package kodnestprograms;

public class Pattern18 {
	public static void main(String[]args)
	{
		//to display triangle
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=(5-i);j++)
			{
				System.out.print("-");
			}
			for(int k=1;k<=i;k++)
			{
	
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
