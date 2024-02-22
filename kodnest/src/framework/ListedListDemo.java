package framework;
import java.util.LinkedList;
public class ListedListDemo {
	
		public static void main(String[]args)
		{
			LinkedList ll=new LinkedList();
			ll.add(10);
			ll.add("twenty");
			ll.add(3.3);
			
			System.out.println("Orinal list:"+ll);
			ll.add(1,"ONE");
		
			System.out.println("updated list (Add)):"+ll);
			ll.addFirst("first");
			ll.addLast("last");
			System.out.println("updated list (Add)):"+ll);
			System.out.println(ll.peek());
			System.out.println("list after peek ():"+ll);
			
			System.out.println(ll.poll());
			System.out.println("list after poll ():"+ll);
			
			System.out.println(ll.pop());
			System.out.println("list after pop ():"+ll);
		}
	}

