package kodnestprograms;

public class Problem2 {
public static void main(String[] args)
{
	//calling static method present in different class
	Test1.fun1();
	//calling non static method present in different class
	Test1 obj=new Test1();
	obj.fun2();
}
}
class Test1
{
	//STATIC METHOD
	public static void fun1()
	{
		System.out.println("fun1()executing");

	}
	//non static method
	public void fun2() 
	{
		System.out.println("fun2()executing");
		
	}
}