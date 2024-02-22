package recursion;

import java.util.Scanner;

public class RecursionTable {
	public static void main (String[]args) 
	{
	Scanner Scan=new Scanner(System.in);
	System.out.println("Please enter the number");
	int num =Scan.nextInt();
	printTable(num,1);
}
public static void printTable(int num,int times)
{
	if(times==11)
		{
		return;
		}
	
		System.out.println(num+" *  "+ times + " = "+ num * times);
		printTable(num,times+1);
	}
}