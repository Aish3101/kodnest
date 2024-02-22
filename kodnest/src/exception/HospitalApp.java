package exception;

public class HospitalApp {
	public static void main(String[] args) {
		HospitalApp2 h=new HospitalApp2();
		 Batman bat =new Batman(h);
		  Ironman iron=new Ironman(h);
		  Thread t1=new Thread(bat);
		  Thread t2=new Thread(iron);
		  t1.setName("batman");
		  t2.setName("ironman"); 
		  t1.start();
		  t2.start();
	}
	}
	
		class Hospital{
			
		public void batTreatment()
		{
		System.out.println("batman is getting treatment");
		}
		public void ironTreatment()
		{
			
			System.out.println("ironman is getting treatment");
			
		}
		
	}
class Batman implements Runnable
{
	HospitalApp2 h;
	Batman(HospitalApp2 h)
	{
		this.h=h;
	}
	public void run()
	{
		h.batTreatment();
	}
}
class Ironman implements Runnable
{
	HospitalApp2 h;
	Ironman(HospitalApp2 h)
	{
		this.h=h;
	}
	public void run()
	{
		h.ironTreatment();
	}
}
