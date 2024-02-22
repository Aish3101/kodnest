package kodnestprograms;

import java.util.Scanner;

public class Squareofseries {
	public static void main(String[] args) 
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("ENTER THE NUMBER");
	int n=scan.nextInt();
	System.out.print(" 1+ ");
	for(int i=1;i<=n;i++)
	{
		
		System.out.print("1/"+(i*i));
		if(i<n)
		{
			System.out.print(" + ");
		}
		
		
	}
	
	

}
}
