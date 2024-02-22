package string;

import java.util.Scanner;

public class UniqueString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner Scan=new Scanner(System.in);
			System.out.println("Enter  the string");
			String s=Scan.nextLine();
			String s2=" ";
			for(int i=0;i<s.length();i++)
			{
				char ch=s.charAt(i);
				if(s2.contains(ch+"")==false)
				{
					s2=s2+ch;
				}
			}
			System.out.print(s2);
	}
	

}
