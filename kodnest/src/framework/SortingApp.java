package framework;
import java.util.*;

public class SortingApp {
public static void main(String[]args)
{
	

	Student st1=new Student(3,"mahesh",2005);
	Student st2=new Student(3,"suresh",2007);
	Student st3=new Student(3,"deep",2010);
	ArrayList<Student>stList=new ArrayList<Student>();
	stList.add(st1);
	stList.add(st2);
	stList.add(st3);
	System.out.print("orginal list:"+stList);
	
	RollComparator rc= new RollComparator();
	YopComparator yc= new YopComparator();
    NameComparator nc= new NameComparator();
			
            Collections.sort(stList,rc);	
			System.out.println("Sorted on roll basis :\n"+stList);
			
			Collections.sort(stList,yc);
			System.out.println("Sorted on year basis :\n"+stList);
			
			Collections.sort(stList,nc);
			System.out.println("Sorted on name basis :\n"+stList);
			
}

}
class RollComparator implements Comparator<Student>
{
	
	public int compare(Student o1,Student o2) {
		return o1.roll-o2.roll;
}}
	class YopComparator implements Comparator<Student>
	{
		
		public int compare(Student o1,Student o2) {
			return o1.yop-o2.yop;
	}}
		class NameComparator implements Comparator<Student>
		{
			
			public int compare(Student o1,Student o2) {
				return o1.name-compareTo(o2.name);
		}}
		class Student {
			int roll;
			int yop;
			String name;
			
			 public Student(int roll,String name, int yop)
			 {
				 this.roll=roll;
				 this.name=name;
				 this.yop=yop;
			 }
			 public String ToString()
			 {
				 return roll+" "+name+" "+yop;
			 }
			
				  
			 }
		
		
		