package string;

public class StringComparison2 {
	public static void main(String[]args) {
		String s1="vira";
		String s2="viru";
		int res=s1.compareTo(s2);
		if(res>0)
		{
			System.out.println("1st string is greater");
		}
		else if(res<0)
		{
			System.out.println("2nd string is greater");
		}
		
	}

}
