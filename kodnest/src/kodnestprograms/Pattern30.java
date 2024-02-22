package kodnestprograms;

import java.util.Scanner;

public class Pattern30 {
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter number of lines");
		int n=scan.nextInt();
		
		int x=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(x);
			if(x==1) 
			{
				x=0;
			}
			else
			{
				x=1;
			}
			}
			System.out.println();
		}
	}
	

}
