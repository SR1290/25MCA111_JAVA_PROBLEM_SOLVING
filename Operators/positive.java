package operator;
import java.util.Scanner;
public class positive {
/**
 * 2. Check if a given integer is positive or negative
   Write a program to check whether the given integer is positive, negative, or zero.*
   Sample Input: -12
   Sample Output: Negative
 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		String result;
		System.out.println("Enter the values of n");
		n= in.nextInt();
		result = (n > 0) ? "Positive" : (n < 0) ? "Negative" : "Zero";
		System.out.println("It is "+result);
}
}
