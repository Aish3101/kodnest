package arrays;

import java.util.Scanner;

public class LinearSearch {
public static void main(String[]args)
{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the size of the array");
	int size=scan.nextInt();
	//array creation
	char[]c=new char[size];
			scan.nextLine();
			//array inputs
			for(int i=0;i<c.length;i++) {
				System.out.println("Enter the elements of the array");
				c[i]=scan.nextLine().charAt(0);
			}
			System.out.println("Enter the KEY TO SEARCH");
			char key=scan.nextLine().charAt(0);
			//linear search
			for(int i=0;i<c.length;i++)
			{
				if(key==c[i])
				{
					System.out.println("key found");
					return;
				
				}
			}
			System.out.println("key not found");
			}
}

