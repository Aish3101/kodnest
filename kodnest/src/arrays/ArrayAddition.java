package arrays;

import java.util.Scanner;

public class ArrayAddition {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=scan.nextInt();
		int[] a=new int[size];
		int[] b=new int[size];
		int[] sum=new int[size];
	//array input
		for(int i=0;i<size;i++)
		{
			//input of1st array
			System.out.print("enter the element of a index"+i);
			a[i]=scan.nextInt();
			//input of 2nd array
			System.out.print("enter the element of b index"+i);
			b[i]=scan.nextInt();
		}
		//adding and printing sum array
		for(int i=0;i<size;i++)
		{
			sum[i]=a[i]+b[i];
			System.out.print(sum[i]+"");
			
		}
		
		 
			
		}

}
