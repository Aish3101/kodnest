package kodnestprograms;

import java.util.Scanner;

public class PracticeApp1 {
	public static void main(String[] args)
	{
		
				
				boolean result=Test.isGraduate();
				System.out.println("Are you graduate?-"+result);
	}
	
}

class Test{
	public static boolean isGraduate() {
		boolean graduate;
		Scanner scan= new Scanner(System.in);
		System.out.println("please enter whether you are graduate or not");
		graduate=scan.nextBoolean();
		return graduate;
		
	}
}
