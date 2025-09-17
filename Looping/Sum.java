package looping;
import java.util.Scanner;
public class Sum {
/**
 * 4. Sum of numbers from 1 to n
   Sample Input: 5
   Sample Output: 15
 */
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter the value: ");
	        int n = sc.nextInt();
	        long sum = 0;
	        for (int i = 1; i <= n; i++) sum += i;
	        System.out.println(sum);


	}

}
