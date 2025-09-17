package operator;
import java.util.Scanner;
public class ternary {
	/**
	 * 1. Find maximum of 2, 3, and 4 numbers using ternary operator
   Write a program to determine the maximum among 2, 3, and 4     integers using ternary operator.*
   Sample Input: 5 8 3 10
   Sample Output: Maximum: 10
	 */
	public static void main(String[] args) {
		        Scanner in = new Scanner(System.in);
		        int a,b,c,d;
		        int max2,max3,max4;
		        System.out.print("Enter 4 integers: ");
		         a = in.nextInt();
		         b = in.nextInt();
		         c = in.nextInt();
		         d = in.nextInt();
		         max2 = (a > b) ? a : b;
		         max3 = (max2 > c) ? max2 : c;
		         max4 = (max3 > d) ? max3 : d;
		        System.out.println("Maximum: " + max4);
	}
}
