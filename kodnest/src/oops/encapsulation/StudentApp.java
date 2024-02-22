package oops.encapsulation;

public class StudentApp {

	public static void main(String[] args) {
		//1ST OBJECT
		
		Student st1=new Student(1,"aiswarya");
		//Fetching value
		System.out.println("roll :"+st1.getRoll());
		System.out.println(" name :"+st1.getName());
// 2nd object
		Student st2=new Student();
		//assigning values using setters
		st2.setRoll(2);
		st2.setName("monika");
				System.out.println("roll :"+st2.getRoll());
				System.out.println(" name :"+st2.getName());
	}}
class Student{
	// DECLARING DATA MEMBERS
	private int roll;
	private String name;
	// 0 PARAMETER CONSTRUCTOR
	public Student() {
	}
	
	//PARAMETER CONSTRUCTOR
	public Student(int roll,String name)
	{
		this.roll=roll;
		this.name=name;
	}
	//SETTER
	public void setRoll(int roll)
	{
		this.roll=roll;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	//GETTER
	public int getRoll()
	{
		return roll;
	}
	public String getName()
	{
		return name;
	}
}

