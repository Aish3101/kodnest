package exception;

public class HospitalApp2 {
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
	}}
class hospital{
	Object doc=new Object();
	Object bed=new Object();
public  void batTreatment()
{
	synchronized(doc)
	{
		try {
		Thread.sleep(3000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("batman has acessed doctor");
		synchronized(bed)
		{
			System.out.println("batman has acessed doctor");
		}
	}
}
public void ironTreatment()
{
	synchronized(bed)
	{
		System.out.println("iron has acessed doctor");
	}
	synchronized(doc)
	{
		System.out.println("iron has acessed doctor");
	}
}
}
