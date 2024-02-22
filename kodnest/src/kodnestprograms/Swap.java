package kodnestprograms;

import java.util.Scanner;

public class Swap
{
	public static void main(String[]args)
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("ENTER THE FIRST NUMBER");
	int a=scan.nextInt();
	System.out.println("ENTER THE SECOND NUMBER");
	int b=scan.nextInt();
	System.out.println("original value: a= " + a + " b ="+ b);
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("Swapped: a= " + a + " b =" + b);

}
}
