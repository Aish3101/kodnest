package arrays;

import java.util.Scanner;
public class TwoDArrayDemo {
	public static void main(String[] args) {
		    Scanner scan=new Scanner(System.in);
			System.out.println("please enter number of rows");
			int row=scan.nextInt();
			System.out.println("please enter number of columns");
			int col=scan.nextInt();
			
			//array creation
			int[][] age=new int[row][col];
			
			//array input
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					System.out.println("please enter the age for row"+i+" column"+j);
					 age[i][j] =scan.nextInt();
				}
			}
			//array input
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					System.out.print(age[i][j]+" ");
				}
				System.out.println();
			}
			
}
}
