package string;

import java.util.Scanner;

public class StringProgram {
	public static void main(String[] args) {
		
		Scanner Scan=new Scanner(System.in);
		System.out.println("Enter  the string");
		String str=Scan.nextLine();
		String [] words=str.split(" ");
		String s2=" ";
		for(int i=words.length-1;i>=0;i--)
		{
			s2=s2+words[i]+" ";
		}
		System.out.println(s2.trim());

	}

}
