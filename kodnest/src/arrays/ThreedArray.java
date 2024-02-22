package arrays;

public class ThreedArray {
	public static void main (String[]args)
	{
		
		String[][][]names=new String[2][2][3];
		names[0][0][0]="deep";
		names[0][0][1]="aalia";
		names[0][0][2]="kohli";
		
		names[0][1][0]="aaa";
		names[0][1][1]="bbb";
		names[0][1][2]="ccc";
		
		names[1][0][0]="ddd";
		names[1][1][1]="eee";
		names[1][1][2]="fff";
		
		names[1][1][0]="ggg";
		names[1][1][2]="hhh";
		names[1][1][1]="iii";
		//blocks
		for(int i=0;i<names.length;i++) {
			//rows
			for(int j=0;j<names.length;j++) {
		//coloumns
				for(int k=0;k<names.length;k++)
				{
					System.out.print(names[i][j][k]+" ");
				}
		System.out.println();
	}
	System.out.println();
}
}
}
	



