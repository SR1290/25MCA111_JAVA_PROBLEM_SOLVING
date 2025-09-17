package looping;
import java.util.Scanner;
public class Fibonacci {
/**
 * 9. Fibonacci Series up to n terms
   Sample Input: 5
   Sample Output: 0 1 1 2 3
 * @param args
 */
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println();
            return;
        }

        long a = 0, b = 1;
        if (n >= 1) System.out.print(a);
        if (n >= 2) System.out.print(" " + b);

        for (int i = 3; i <= n; i++) {
            long c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
        System.out.println();


	}

}
