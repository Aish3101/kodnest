package abstraction;

public abstract class AbstractClassDemo1 {
	//instance variables-yes
	int a;
		//static variables-yes
		static int b=20;
		//instance/non static concrete meethods-no
		public void fun1()
		{
			System.out.println("instance/non static concrete methods");
		}
	//static methods-yes
		public static void fun2()
		{
			System.out.println(" static concrete methods");
		}
		//constructors-no
		AbstractClassDemo1(){
		
			
		}
		//main()-yes
		public static void main(String[]args)
		{
			System.out.println("main");
		}
		//abstract method-yes
		public abstract void fun3();
		//default methods-no
		default void fun4()
		{
			System.out.println("default method");
		}
		//private methods
		private void fun5()
		{
			System.out.println("private methods");
		}
		private void fun6()
		{
			System.out.println("static private methods");
		}
		//instance block-yes
		{
			System.out.println(" instance block");
		}
		//instance block-yes
		{
			System.out.println(" static block");
		}
	
	}


