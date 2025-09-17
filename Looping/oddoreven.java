package looping;
import java.util.Scanner;
public class oddoreven {
/**
 *2. Print all odd and even numbers up to n
   Sample Input: 10
   Sample Output: Odd: 1 3 5 7 9, Even: 2 4 6 8 10

 */
	public static void main(String[] args) {
	     Scanner in = new Scanner(System.in);
	     System.out.println("Enter the numbers: ");
	        int n = in.nextInt();

	        System.out.print(" Odd: \n");
	        boolean first = true;
	        for (int i = 1; i <= n; i += 2) {
	            if (!first) System.out.print(" ");
	            System.out.print(i);
	            first = false;
	        }

	        System.out.print("\n Even: \n");
	        first = true;
	        for (int i = 2; i <= n; i += 2) {
	            if (!first) System.out.print(" ");
	            System.out.print(i);
	            first = false;
	        }
	        System.out.println();

	}

}
