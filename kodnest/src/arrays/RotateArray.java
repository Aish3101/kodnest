package arrays;

import java.util.Scanner;

public class RotateArray {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=scan.nextInt();
		int[] arr=new int[size];
		
		for(int i=0;i<size;i++)
		{
			System.out.println("enter element");
			arr[i]=scan.nextInt();
			
		}
		int temp=arr[arr.length-1];
		for(int i=arr.length-1;i>=1;i--)
		{
			arr[i]=arr[i-1];
			
		}
		arr[0]=temp;
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
		

}
}
