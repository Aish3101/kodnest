package string;

import java.util.Scanner;

public class StringReversewithoutChar {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scan=new Scanner(System.in);
		System.out.println("Enter  the string");
		String s=Scan.nextLine();
		System.out.println("orginal string:"+s);
		
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev= rev+s.charAt(i);
		}
}}
