package string;

public class ImmutableDemo {
	public static void main(String[]arg)
	{
	String s=new String("java");
	s.concat("script");
	
	System.out.println(s);
	String s2=s.concat("programming");
	System.out.println(s);
	System.out.println(s2);
	}
}
