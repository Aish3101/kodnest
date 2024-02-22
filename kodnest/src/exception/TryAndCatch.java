package exception;

import java.util.Scanner;

public class TryAndCatch {
public static void main(String[]args)
{
	try {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the size of the array");
	int size=scan.nextInt();
	int[]arr=new int[size];
	System.out.println("Enterthe element of array");
	for(int i=0;i<size;i++)
	{
		arr[i]=scan.nextInt();
	}
	System.out.println("Enter the array index to acess element");
	int idx=scan.nextInt();
	System.out.println("Array element ="+arr[idx]);
}
catch(Exception e)
{
	e.printStackTrace();
	
}}}
