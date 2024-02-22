package arrays;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=scan.nextInt();
		int[] arr= {44 ,55, 22 ,11 ,66, 33};
		for(int i=0;i<=arr.length-2;i++)
		{
			int min=i;
			for(int j=i;j<=arr.length-1;j++)
			{
				if(arr[j]<arr[min])
				{
					min=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
				}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+ " ");
		}
			}
		
		

	}


