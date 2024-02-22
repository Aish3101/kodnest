package kodnestprograms;

public class Pattern18Method {
	public static void main(String[]args) {
		//lines
		for(int i=1;i<=5;i++)
		{
		//spaces
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
		}
		//stars
		for(int k=1;k<=(5-i);k++)
		{
			System.out.print("*");
		
			if(k<(5-i))
			{
				System.out.print(" ");
			}
		}
		System.out.println();
	}

	}
}
