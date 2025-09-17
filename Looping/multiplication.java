package looping;
import java.util.Scanner;
public class multiplication {
/**
 * 3. Multiplication Table of a number
   Sample Input: 5
   Sample Output: 5 10 15 20 25 30 35 40 45 50
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input: ");
        int x = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.print(x * i );
            if (i < 10) System.out.print(" ");
        }
        System.out.println();


	}

}
