package string;

import java.util.Scanner;

public class UniqueString2 {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
					Scanner Scan=new Scanner(System.in);
					System.out.println("Enter  the string");
					String s=Scan.nextLine();
					for(int i=0;i<=s.length();i++)
					{
						for(int j=i+1;j<=s.length();j++)
						{
							String temp=s.substring(i,j);
							if(isUnique(temp)==true) 
							{
								System.out.println(temp);
							}
							
						}
						}
					}
		
					//System.out.println(isUnique(s));
		
		
		
		public static boolean isUnique(String s) {
			//traversing the string
			for(int i=0;i<s.length();i++)
			{
				char ch= s.charAt(i);
				int count=0;
				for(int j=0;j<s.length();j++)
				{
					if (ch==s.charAt(j)) {
						count++;
					}
				}
				if(count>1)
				{
					return false;
				}
			}
			return true;
		}

}
