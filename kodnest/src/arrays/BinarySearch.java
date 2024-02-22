package arrays;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=scan.nextInt();
		int[]arr=new int[size];
		//array inputs
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("please enter the elemnet"+i);
			arr[i]=scan.nextInt();
		}
		//array elements
		System.out.println("array elements ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
		System.out.println("enter the key to search");
		int key=scan.nextInt();
		//binary search
		int low=0;
		int high=arr.length-1;
		int mid=(low+high)/2;
		while(low<=high)
		{
			if(key==arr[mid])
			{
				
				return;
			}
			else if(key>arr[mid])
			{
				low=mid+1;
				
			}
			else if(key>arr[mid])
			{
				high=mid-1;
				
			}
			
			
		System.out.println(" key is not found");
		}
	}
}
