package arrays;

import java.util.Scanner;

public class SearchApp {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=scan.nextInt();
		int[] element=new int[size];
		for(int i=0;i<element.length;i++)
		{
			System.out.println("please enter the elemnet"+i);
			element[i]=scan.nextInt();
		}
		display(element);
		System.out.print("please enter the key to search");
		int key=scan.nextInt();
		search(key,element);
	}
	public static void display(int []element)
	{
		for (int i=0;i<element.length;i++)
		{
			System.out.print(element[i]+" ");
		}
	}
	public static void search(int k,int[] element)
	{
		for(int i=0;i<element.length;i++)
		{
			if(element[i]==k)
			{
				System.out.print("key is found");
				return;
			}
		}
		System.out.println("key is not found");
	}
}
	



