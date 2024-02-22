package string;

import java.util.Scanner;

public class SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				Scanner Scan=new Scanner(System.in);
				System.out.println("Enter  the string");
				String s=Scan.nextLine();
				for(int i=0;i<=s.length();i++)
				{
					for(int j=i+1;j<=s.length();j++)
					{
						System.out.println(s.substring(i,j));
					}
				}

	}

}
