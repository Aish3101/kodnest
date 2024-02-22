package arrays;

import java.util.Scanner;

public class ArrayDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter the size of the array");
			int size=scan.nextInt();
			int[] marks=new int[size];
			for(int i=0;i<marks.length;i++)
			{
				System.out.println("Enter the mark for id"+i);
				marks[i]=scan.nextInt();
			}

	}

}
