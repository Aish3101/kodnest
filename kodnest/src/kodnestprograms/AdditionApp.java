package kodnestprograms;




public class AdditionApp
	{
		public static void main(String[] args)
		{
			Addition.add(20,50);
			Addition.add(10.5,50.555);
			Addition.add(20,50,80);
			Addition.add(20.22,50.55,99.99);
			Addition.add(10.5,20);
		}
	}



	 class Addition {
		public static void add (int a,int b)
		{
			System.out.println("sum="+(a+b));
		}
		public static void add (double a,double b)
		{
			System.out.println("sum="+(a+b));
		}
		public static void add (int a,int b,int c)
		{
			System.out.println("sum="+(a+b+c));
		}
		public static void add (double a,double b,double c)
		{
			System.out.println("sum="+(a+b+c));
		}
		public static void add (int a,double b)
		{
			System.out.println("sum="+(a+b));
		}
		public static void add (double a,int b)
		{
			System.out.println("sum="+(a+b));
		}
	}


	




