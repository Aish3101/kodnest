package kodnestprograms;
import java.util.Scanner;

public class DivisibleByNumbers {
	public static void main (String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n%2==0 && n%3==0 && n%4==0)
		{
			System.out.println("DIVISIBLE BY 2 3 AND 4");
		}
		else
			
		{
			System.out.println("end");
		}
	}

}
