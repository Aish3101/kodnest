package abstraction;

public class PhoneApp {
	public static void main (String[]args)
	{
		SmartPhone sp=new kodPhone();
		sp.takePhoto();
		sp.recordVideo();
		sp.useApps();

}}
interface Camera
{
	void takePhoto();
	void recordVideo();
	
}
interface Laptop
{
	void useApps();
	
}
interface SmartPhone extends Camera,Laptop
{
	
}
class kodPhone implements SmartPhone
{
	public void takePhoto()
	{
		System.out.println("Take photo using camera app");	}

public void recordVideo()
{
	System.out.println("Record video using camera app");	}

public void useApps()
{
	System.out.println("Download from playstore and use app");	
}}