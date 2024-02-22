package string;

import java.util.Scanner;

public class CharDigitsSymbols {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner Scan=new Scanner(System.in);
			System.out.println("Enter  the string");
			String str=Scan.nextLine();
			System.out.println("Orginal string  "     +     str);
			int alpha=0;
			int v=0;
			int c=0;
			int dig=0;
			int others=0;
			for(int i=0;i<str.length();i++)
			{
				char temp=str.charAt(i);
						//alphabets
				if(temp>='a'&& temp<='z') {
					alpha++;
					//vowels& consonants
					if(temp=='a'|| temp=='e'|| temp=='i'|| temp=='o'|| temp=='u')
					{
						v++;
					}
						else
						{
							c++;
						}
					}
					//digits
				
				
				else if(temp>='0'&& temp<='g')
				{
					dig++;
				}
				else
				{
					others++;
				}
			}
			System.out.println("alphabets="+alpha);
			System.out.println("vowels="+v);
			System.out.println("consanants="+c);
			System.out.println("digits="+dig);
			System.out.println("others="+others);

	}

}
