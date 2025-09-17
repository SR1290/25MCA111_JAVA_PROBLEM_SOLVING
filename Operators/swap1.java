package operator;
import java.util.Scanner;
public class swap1 {
/**
 * 4. Swap two numbers using a temporary variable
   Write a program to swap two integers using a temporary variable.*
   Sample Input: a = 5, b = 10
   Sample Output: a = 10, b = 5
 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a,b,temp;
		System.out.println("Enter the A value:");
		a=in.nextInt();
		System.out.println("Enter the B value:");
		b=in.nextInt();
		System.out.println("BEFORE SWAP");
		System.out.println("-----------");
		System.out.println("A="+a);
		System.out.println("B="+b);
		temp = a;
		a = b;
		b = temp;
		System.out.println("-----------");
		System.out.println("AFTER SWAP");
		System.out.println("-----------");
		System.out.println("A="+a);
		System.out.println("B="+b);
	}

}
