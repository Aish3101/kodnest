package kodnestprograms;

public class CalculatorApp1 {
	public static void main(String[] args)
	{
		Calculator c=new Calculator();
		c.add();
		c.sub(20,5);
		int prod=c.mul();
		System.out.println("product="+prod);
		double div =c.div(10,3);
		System.out.println("Division="+div);
		
		
	}

}
class Calculator
{
	public void add()
	{
		int a=5;
		int b=10;
		int sum=a+b;
		System.out.println("sum="+sum);
	}
	public void sub(int a,int b)
	{
		int diff=a-b;
		System.out.println("difference="+diff);
	}
	public int mul()
	{
		int a=10;
		int b=5;
		int p=a*b;
		return p;
	}
	public double div(int a,int b)
	{
		double div =a/(double)b;
		return div;
		
	}
}

