package recursion;

import java.util.Scanner;

public class Factorial {
	public static void main (String[]args) 
	{
	Scanner Scan=new Scanner(System.in);
	System.out.println("Please enter the number");
	int num =Scan.nextInt();
	System.out.println("Factorial ="+findFactorial(num));
	
	}
	public static int findFactorial(int num) {
		if(num==1)
		{
			return 1;
		}
		return num*findFactorial(num-1);
	}
}
