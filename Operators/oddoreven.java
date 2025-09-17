package operator;
import java.util.Scanner;
public class oddoreven {
/**
 * 6. Check whether a number is odd or even
   Write a program to check if the given integer is odd or even.*
   Sample Input: 7
   Sample Output: Odd
 */
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int n;
	String result;
	System.out.println("Enter the N value: ");
	n=in.nextInt();
	result=(n%2 == 0) ? "EVEN":"ODD";
	System.out.println("THE GIVE NUMBER IS "+result);
	}
}
