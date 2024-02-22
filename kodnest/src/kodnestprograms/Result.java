package kodnestprograms;

import java.util.Scanner;

public class Result {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the mark");
		int n=sc.nextInt();
		if(n>=90)
		{
			System.out.println("A");
		}
		else if(n>=80 && n<=90)
			
		{
			System.out.println("B");
		}
		else if(n>=70 && n<=79)
		{
			System.out.println("C");
			
		}
		else
		{
			System.out.println("failed");
		}

	}


}
