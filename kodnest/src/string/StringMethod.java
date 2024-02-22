package string;

public class StringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="java SCRIPT";
		System.out.println("length="+ str.length());
		System.out.println("uppercase="+ str.toUpperCase());
		System.out.println("lowercase="+ str.toLowerCase());
		System.out.println( str.contains("java"));
		System.out.println( str.contains("jva"));
		System.out.println( str.contains("JAVA"));
		System.out.println( str.contains('j'+""));
		System.out.println( str.charAt(3));
		System.out.println( str.indexOf('s'));
		System.out.println( str.indexOf('a'));
		System.out.println( str.lastIndexOf('a'));
		System.out.println( str.substring(1,6));
		System.out.println( str.substring(3));
		
}
}