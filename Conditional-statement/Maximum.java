package conditionalstatement;
import java.util.Scanner;
public class Maximum {
	/**
	 * 2. Find maximum of 2, 3, 4 numbers
   Use if-else ladder or nested if to find the maximum.
   Sample Input: 7 15 3 9
   Sample Output: Maximum: 15
	 */

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int a,b,c,d;
		int max;
		System.out.println("Enter the numbers:");
		a=in.nextInt();
		b=in.nextInt();
		c=in.nextInt();
		d=in.nextInt();
		 if (a >= b && a >= c && a >= d) max = a;
	        else if (b >= c && b >= d) max = b;
	        else if (c >= d) max = c;
	        else max = d;
		 System.out.println("MAXIMUM NUMBERS IS : "+max);
	}

}
