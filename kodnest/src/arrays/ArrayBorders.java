package arrays;

import java.util.Scanner;

public class ArrayBorders 
{
	public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter the number of the row");
			int row=scan.nextInt();
			System.out.println("Enter the number of the column");
            int col=scan.nextInt();
            int [][] arr=new int[row][col];
            for (int i=0;i<row;i++)
            {
            	for (int j=0;j<col;j++)
            	{
            		System.out.println("please enter the element for row:"+i+ "column"+j); 
            		arr[i][j]=scan.nextInt();
            	}
            }
            //array output
            System.out.println("orginal array");
            for(int i=0;i<row;i++)
            {
            	for (int j=0;j<col;j++)
            	{
            		System.out.print(arr[i][j]+"  ");
          
            }
                     System.out.println();
                     //Border element of array
                    for(int i=0;i<row;i++)
                     {
                     	for (int j=0;j<col;j++)
                     	{
                     		if(i==0||i==(row-1)||j==(col-1))
                     				{
                     			  System.out.print(arr[i][j]+" ");
                     				}
                     		else
                     		{
                     			  System.out.print(" ");
                     		}
                     	}
                     	  System.out.println();
                     }
            }
	}}
                    
	