package looping;
import java.util.Scanner;
import java.math.BigInteger;
public class Factorial {
/**
 * 6. Sum of factorial of n numbers
   Sample Input: n = 3, Numbers: 2 3 4
   Sample Output: 2! + 3! + 4! = 2 + 6 + 24 = 32
 */
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 System.out.println("Enter the no.of values:");
	        int m = in.nextInt(); // number of values
	        BigInteger total = BigInteger.ZERO;
	        StringBuilder expr = new StringBuilder();
	        StringBuilder terms = new StringBuilder();
	        System.out.println("enter the value: ");
	        for (int i = 0; i < m; i++) {
	        	//System.out.println("enter the value: ");
	            int v = in.nextInt();
	            BigInteger fact = BigInteger.ONE;
	            for (int j = 2; j <= v; j++) fact = fact.multiply(BigInteger.valueOf(j));

	            if (i > 0) {
	                expr.append(" + ");
	                terms.append(" + ");
	            }
	            expr.append(v).append("!");
	            terms.append(fact.toString());
	            total = total.add(fact);
	        }

	        System.out.println(expr.toString() + " = " + terms.toString() + " = " + total.toString());

	}

}
