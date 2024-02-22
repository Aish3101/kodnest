package kodnestprograms;

import java.util.Scanner;

public class NewUpper {
	public static void main (String[]args) {
	Scanner sc=new Scanner(System.in);
			char ch=sc.nextLine().charAt(0);
	if(ch>='A'&& ch<='Z')
	{
		System.out.println("Upper case letter");
		}
	else if(ch>='a'&& ch<='z')
	{
		System.out.println("Lower case letter");
		
	}

}

}
