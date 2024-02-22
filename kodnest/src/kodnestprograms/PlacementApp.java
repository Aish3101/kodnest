package kodnestprograms;
import java.util.Scanner;
public class PlacementApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter YOP");
		int yop=sc.nextInt();
		System.out.println("please enter marks");
		int marks=sc.nextInt();
		if(yop>2021)
		{
			if(marks>70)
			{
				System.out.println("Eligible");
			}
			else
			{
				System.out.println("Not eligible marks<=70");
			}
		
				}
		else
		{
			System.out.println("not eligible year<=2021");
		}
	}

}
