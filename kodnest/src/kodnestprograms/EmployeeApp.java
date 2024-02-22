package kodnestprograms;

import java.util.Scanner;

class Employee
{
	int id;
	String name;
	int salary;
	public void giveInfo()
	{
		System.out.println("EmpID:"+id);
		System.out.println("EmpNAME:"+name);
		System.out.println("EmpSALARY:"+salary);
		}
	public Employee(int id,String name, int salary)
	{
		System.out.println("3-parameter constructor");
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public Employee()
	{
	System.out.println("0-parameter constructor");
}
public Employee(int id)

{
	this.id=id;
	System.out.println("1-parameter constructor");
}

}

public class EmployeeApp {
public static void main(String[] args)
{
	Scanner sc =new Scanner(System.in);
	System.out.println("please enter id for 1 st user");
	int id1=sc.nextInt();
	System.out.println("please enter name for 1 st user");
	String name1=sc.nextLine();
	System.out.println("please enter salary for 1 st user");
	int salary1=sc.nextInt();
	System.out.println("please  enter the id for 3rd user");
	int id3=sc.nextInt();
	Employee emp1 =new Employee(id1,name1,salary1);
	Employee emp2 =new Employee();
	Employee emp3 =new Employee(id3);
	emp1.giveInfo();
	emp2.giveInfo();
	emp3.giveInfo();
	
	
	
	
}
}
