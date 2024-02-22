package kodnestprograms;

import java.util.Scanner;

public class MaleOrFemale {
	public static void main (String[]args)
	{
		Scanner sc=new Scanner(System.in);
		char ch=sc.nextLine().charAt(0);;
		if(ch=='M')
		{
			System.out.println("Male");
			
		}
		else if(ch=='F')
		{
			System.out.println("Female");
			
		}
			
			
	}

}
