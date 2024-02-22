package string;

import java.util.Scanner;
import java.util.Arrays;
public class AnagramOfString {

	public static void main(String[] args) {
		Scanner Scan=new Scanner(System.in);
		System.out.println("Enter  the string");
		String s1=Scan.nextLine();
		char [] c1=s1.toCharArray();
		
		System.out.println("Enter  the string");
		String s2=Scan.nextLine();
		char [] c2=s1.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		if(Arrays.equals(c1, c2))
		{
			System.out.println(" strings are anagrams");
		}
		else {
			System.out.println(" strings are not anagrams!");
		}
	}

}
