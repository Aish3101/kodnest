package kodnestprograms;
class Dog
{
	String breed;
	int age;
	public void bark()
	{
		System.out.println("woof woof");
	}

	
	
public Dog()
{
	breed ="scooby";
	System.out.println("dog constructor");
}
}
public class DogApp
{
	public static void main(String[] args)
	{
		Dog d1=new Dog();
		System.out.println(d1.age);
		d1.bark();
		Dog d2;
		Dog d3;
		d3=new Dog();
	}
}
		
	
	


