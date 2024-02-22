package exception;
import java.util.Scanner;
public class DivApp {
public static void main(String[]args)
{
	
}
public static void callDiv()
{
	div();

}
public static void div()
{
	Scanner sc=new Scanner(System.in);
			System.out.println("Enter 1st number");
	int a=sc.nextInt();
	System.out.println("Enter 2nd number");
	int b=sc.nextInt();
	
	int res=a/b;
	System.out.println("Division result="+res);
}
}
