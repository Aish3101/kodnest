package string;

import java.util.Scanner;

public class StringPangram {

	public static void main(String[] args) {
		Scanner Scan=new Scanner(System.in);
		System.out.println("Enter  the string");
		String s=Scan.nextLine();
		for(char i='a'; i<='z';i++)
		{
			if(s.contains(i+"")==false)
			{
				System.out.println("not a pangram");
				return;
			}
		}
		System.out.println("pangram");
	}

}
