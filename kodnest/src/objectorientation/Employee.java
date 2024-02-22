package objectorientation;
class Employee
{
	public static void main(String[]args)
	{
		EmployeeApp Emp1=new EmployeeApp(1,"aaa","developer",23000);
		
		System.out.println(Emp1.id+""+Emp1.name+" "+Emp1.Desg" "+Emp1.salary);
		Emp1.dojob();
EmployeeApp Emp2=new EmployeeApp(1,"aaa","developer",23000);
		
		System.out.println(Emp1.id+""+Emp1.name+" "+Emp1.Desg" "+Emp1.salary);
		Emp2.dojob();
	}
class EmployeeApp
	int id;
	String name;
	String Desg;
	int salary;
	public static void dojob()
	{
		System.out.println("do job");
	}
	 EmployeeApp(int id,String name,String Desg,int salary)
	 {
		 this.id=id;
		 this.name=name;
		 this.Desg=Desg;
		 this.salary=salary;
	{
		
	}
}

	

}
