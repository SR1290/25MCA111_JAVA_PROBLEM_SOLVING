package looping;
import java.util.Scanner;
public class Numbers {
	/**
	 * 1. Print numbers from 1 to n
   Sample Input: 5
   Sample Output: 1 2 3 4 5
	 */

	public static void main(String[] args) {
		  Scanner in = new Scanner(System.in);
		  System.out.println("Enter the N number: ");
	        int n = in.nextInt();
	        for (int i = 1; i <= n; i++) {
	            System.out.print(i);
	            if (i < n) System.out.print(" ");
	        }
	        System.out.println();

	}

}
