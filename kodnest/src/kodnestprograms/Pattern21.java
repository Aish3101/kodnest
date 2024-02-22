package kodnestprograms;
public class Pattern21
{

public static void main(String[] args)
{
	
	displaypryramid(); //calling method
	displaynonpryramid();
	
}
public static void displaypryramid()
{
	for(int i=1;i<=5;i++)  //line
	{
		for(int j=1;j<=(5-i);j++) //space
		{
			System.out.print(" ");//printing space
		}
		for(int k=1;k<=i;k++) //star
		{
			System.out.print('*'); //printing star
		
		if(k<i)  //space after star
		{
			System.out.print(' ');//printing space after star
		}
		}
		System.out.println();//changing line
		
	}
	
}
public static void displaynonpryramid()
{
	for(int i=1;i<=5;i++) //line
	{
		for(int j=1;j<=i;j++) //space
		{
			System.out.print(" "); //printing space
		}
		for(int k=1;k<=(5-i);k++)  //star
		{
			System.out.print('*'); //printing star
		
		if(k<(5-i)) //space after star
		{
			System.out.print(' ');//printing space after space
		}
		}
		System.out.println(); //changing line
		
	}
}

}
