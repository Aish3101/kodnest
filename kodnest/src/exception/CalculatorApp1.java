package exception;
import java.util.Scanner;
public class CalculatorApp1 {
	public static void main(String[]args)
	{
	Calculator c=new Calculator();
	
	AddThread at=new AddThread(c);
	SubThread st=new SubThread(c);
	MulThread mt=new MulThread(c);
	DivThread dt=new DivThread(c);
	
	at.setName("add-thread");
	st.setName("sub-thread");
	mt.setName("mul-thread");
	dt.setName("div-thread");
	at.start();
	st.start();
	mt.start();
	dt.start();
	}
}
   class Calculator
   {
	   public synchronized void operations() {
		   String tname=Thread.currentThread().getName();
		   if(tname.equals("add-thread"))
		   {
			   add();
		   }
		   else if(tname.equals("sub-thread"))
		   {
			   sub();
		   }
		   else if(tname.equals("mul-thread"))
		   {
			   mul();
		   }
		   else {
			   div();
		   }
	   }
	   public void add()
	   {
		   Scanner scan=new Scanner(System.in);
		   System.out.println("please enter the 1st number");
		   int num1=scan.nextInt();
		   System.out.println("please enter the 2nd number");
		   int num2=scan.nextInt();
		   int sum=num1+num2;
		   System.out.println("sum="+sum);
		   
	   }
	   public void sub() 
	   {
		   Scanner scan=new Scanner(System.in);
		   System.out.println("please enter the 1st number");
		   int num1=scan.nextInt();
		   System.out.println("please enter the 2nd number");
		   int num2=scan.nextInt();
		   int diff=num1-num2;
		   System.out.println("difference="+diff);
		   
		   
	   }
	   public void mul()
	   { Scanner scan=new Scanner(System.in);
	   System.out.println("please enter the 1st number");
	   int num1=scan.nextInt();
	   System.out.println("please enter the 2nd number");
	   int num2=scan.nextInt();
	   int prod=num1*num2;
	   System.out.println("product="+prod);
	   
	   }
	   public void div()
	   {
		   Scanner scan=new Scanner(System.in);
		   System.out.println("please enter the 1st number");
		   int num1=scan.nextInt();
		   System.out.println("please enter the 2nd number");
		   int num2=scan.nextInt();
		   double div=((double)num1) /num2;
		   System.out.println("Quotient="+div);
		     
	   }
   }
   class AddThread extends Thread
   {
	   Calculator c;
	   public AddThread(Calculator c)
	   {
		   this.c=c;
	   }
	   public void run()
	   {
		   c.operations();
	   }
   }
   class SubThread extends Thread
   {
	   Calculator c;
	   public SubThread(Calculator c)
	   {
		   this.c=c;
	   }
	   public void run()
	   {
		   c.operations();
	   }
   }
   class MulThread extends Thread
   {
	   Calculator c;
	   public MulThread(Calculator c)
	   {
		   this.c=c;
	   }
	   public void run()
	   {
		   c.operations();
	   }
   }
   class DivThread extends Thread
   {
	   Calculator c;
	   public DivThread(Calculator c)
	   {
		   this.c=c;
	   }
	   public void run()
	   {
		   c.operations();
	   }
   }
