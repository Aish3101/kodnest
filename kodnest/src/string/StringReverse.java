package string;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scan=new Scanner(System.in);
		System.out.println("Enter  the array");
		String s=Scan.nextLine();
		System.out.println("orginal string:"+s);
		char [] c=s.toCharArray();
		String rev="";
		for(int i=c.length-1;i>=0;i--)
		{
			rev=rev+c[i];
			
		}
		System.out.println(rev);

	}

}
