package string;

import java.util.Scanner;

public class StringProgram2 {
	public static void main(String[]args)
	{
	Scanner Scan=new Scanner(System.in);
	System.out.println("Enter  the string");
	String str=Scan.nextLine();
	String [] words=str.split(" ");

	for(int i=0;i<words.length-1;i++)
	{
		String temp=words[i];
	String rev=" ";
	for(int j=temp.length()-1;j>=0;j--)
	{
		rev=rev+temp.charAt(j);
	}
	
	System.out.println(rev);


}}}
