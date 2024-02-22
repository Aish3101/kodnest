package kodnestprograms;

public class Pattern25 {
	public static void main(String[]args) {
		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i==1)
				{
					System.out.print("1");
				}
				else if(j==2)
				{
					System.out.print("2");
				}
			}
			System.out.println();
		}
	}

}
