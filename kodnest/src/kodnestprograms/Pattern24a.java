package kodnestprograms;

public class Pattern24a {
	public static void main(String[] args) {
          // You can adjust the number of rows as needed
        
		for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 2 * 6; j++) {
                if (j == i || j == 2 * 6- i + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
