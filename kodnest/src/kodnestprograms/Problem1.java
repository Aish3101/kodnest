package kodnestprograms;

public class Problem1 
{
	public static void main(String[] args)
	{
	//calling static method present in same class
		fun1();
	Problem1.fun1();
	//calling non static present in same class
	Problem1 obj=new Problem1();
	obj.fun2();
	}
public static void fun1()
{
	System.out.println("fun1() executing ");
}
public  void fun2()
{
	System.out.println("fun2()executing");
}
}
