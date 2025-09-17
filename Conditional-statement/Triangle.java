package conditionalstatement;
import java.util.Scanner;
public class Triangle {
/**
 * 6. Check if 3 sides form a Triangle
   Check triangle condition: a + b > c, etc.
   Sample Input: 3 4 5
   Sample Output: Triangle is possible
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value:");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        if (a + b > c && a + c > b && b + c > a)
            System.out.println("Triangle is possible");
        else
            System.out.println("Triangle is not possible");
		

	}

}
