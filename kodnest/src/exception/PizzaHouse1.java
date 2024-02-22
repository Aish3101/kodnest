package exception;

public class PizzaHouse1 {
     public static void main(String[] args) {
			PizzaHouse ph=new PizzaHouse();
			
			Baker b=new Baker(ph);
			Customer c=new Customer(ph);
			
			Thread t1=new Thread(b);
			Thread t2=new Thread(c);
			
			t1.start();
			t2.start();
		}
	}
		class PizzaHouse
		{
			boolean baked= false;
			int token;
			public synchronized void bake(int token)throws InterruptedException
			{
				if(baked==true)
				{
					wait();
				}
					else {
				this.token=token;
				System.out.println("Pizza baked for order "+this.token);
				baked=true;
				notify();
				
			}
				}
	
			
			public synchronized void eat() throws InterruptedException
			
			{
				if(baked==false)
				{
					wait();
				}
				else
				{
					
				
				System.out.println("Eat pizza "+this.token);
				baked=false;
				notify();
			}
		}}
		
		class Baker implements Runnable
		{
			PizzaHouse ph;
			Baker(PizzaHouse ph)
			{
				this.ph=ph;
			}
			public void run() 
			
			{
				int token=0;
				while(true)
				{
					try {
						ph.bake(token++);
					}catch(InterruptedException e)
					{
						e.printStackTrace();
					}
				
				}
			}
			}
		
			class Customer implements Runnable
			{
				PizzaHouse ph;
				Customer(PizzaHouse ph)
				{
					this.ph=ph;
				}
				public void run() 
				{
		         	while(true)
					{
		         		try {
							ph.eat();
						}catch(InterruptedException e)
						{
							e.printStackTrace();
						}
		         			
		         		}
						
					}
			}
				
			
		
				
			
		


