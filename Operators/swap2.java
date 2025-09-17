package operator;
import java.util.Scanner;
public class swap2 {
/**
 * 5. Swap two numbers without using a temporary variable
   Write a program to swap two integers without using a temporary variable.*
   Sample Input: a = 5, b = 10
   Sample Output: a = 10, b = 5
 */
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int a,b;
	System.out.println("Enter A value:");
	a=in.nextInt();
	System.out.println("Enter B value:");
	b=in.nextInt();
	System.out.println("BEFORE SWAP");
	System.out.println("-----------");
	System.out.println("A="+a);
	System.out.println("B="+b);
	a = a + b;  
    b = a - b;  
    a = a - b;  
    System.out.println("AFTER SWAP");
    System.out.println("----------");
    System.out.println("A = " + a);
    System.out.println("B = " + b);
	}
}
