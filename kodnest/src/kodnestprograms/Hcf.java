package kodnestprograms;

import java.util.Scanner;

public class Hcf 
{
	public static void main(String[] args) 
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("ENTER THE FIRST NUMBER");
	int a=scan.nextInt();
	System.out.println("ENTER THE SECOND NUMBER");
	int b=scan.nextInt();
 while(true)
 {
	 if(b%a==0)
	 {
		 System.out.println("GCD = "+ a);
		 	break;
	 }
	 
	 int temp =a;
	 a=temp%a;
	 b=a;
 }

}
}