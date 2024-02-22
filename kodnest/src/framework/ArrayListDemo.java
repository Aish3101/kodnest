package framework;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[]args)
	{
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(3.5);
		al.add(false);
		al.add("deep");
		al.add(10);
		System.out.println("Orinal list:"+al);
		System.out.println("data at idx2:"+al.get(2));
		al.add(2,"twooo");
		System.out.println("updated list (Add)):"+al);
		System.out.println("data at idx2:"+al.get(2));
		al.set(2, 2222);
		
		System.out.println("updated list (set)):"+al);
		System.out.println("data at idx2:"+al.get(2));
	}
}