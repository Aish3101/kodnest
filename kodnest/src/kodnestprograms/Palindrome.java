package kodnestprograms;
import java.util.Scanner;

public class Palindrome {
	public static void main (String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter the number");
		int num=scan.nextInt();
		int k=num;//orginal number
		int rev=0;
		while(num>0)
		{
			int rem=num%10;
			num=num/10;
			rev=rev*10+rem;
		}
		System.out.println("Orginal number:" +k);
		System.out.println("Reverse       :" +rev);
			if(rev==k)
			{
				System.out.print("number is palindrome  :");
			}
			else
			{
				System.out.print("number is NOT palindrome ");
			}
		}
		
		
		
	}


