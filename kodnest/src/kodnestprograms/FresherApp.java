package kodnestprograms;
class Fresher
{
	int uid;
	String  name;
	String skill;
	public void giveInterview()
	{
		System.out.println("prepare and give interview");
	}
	public Fresher(int uid,String name,String skill)
	{
		uid=uid;
		name=name;
		skill=skill;
	}
}

public class FresherApp 
{
	public static void main(String[] args)
	{
		Fresher f=new Fresher(1,"Aiswarya","java");
		System.out.println("UID:"+f.uid);
		System.out.println("NAME:"+f.name);
		System.out.println("SKILL:"+f.skill);
		f.giveInterview();
		
	}

}
