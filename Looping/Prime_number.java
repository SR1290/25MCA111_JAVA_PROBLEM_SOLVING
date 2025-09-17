package looping;
import java.util.Scanner;
public class Prime_number {
/**
 * 8. Check Prime Number
   Sample Input: 17
   Sample Output: Prime

 * @param args
 */
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 1) {
            System.out.println("Not Prime");
            return;
        }
        if (n == 2) {
            System.out.println("Prime");
            return;
        }
        if (n % 2 == 0) {
            System.out.println("Not Prime");
            return;
        }
        boolean isPrime = true;
        for (int i = 3; i * 1L * i <= n; i += 2) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime ? "Prime" : "Not Prime");

	}

}
