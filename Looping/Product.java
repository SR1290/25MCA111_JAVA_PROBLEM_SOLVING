package looping;
import java.util.Scanner;
public class Product {
/**
 * 5. Product of numbers from 1 to n (Factorial)
   Sample Input: 5
   Sample Output: 120
*/
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the value: ");
	        int n = sc.nextInt();

	        if (n < 0) {
	            System.out.println("Factorial not defined for negative numbers");
	            return;
	        }

	        long fact = 1;
	        for (int i = 1; i <= n; i++) fact *= i;

	        System.out.println(fact);

	}

}
