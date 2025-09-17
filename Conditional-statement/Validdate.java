package conditionalstatement;
import java.util.Scanner;
public class Validdate {
/**
 * 7. Validate Date
   Check if the entered date is valid (dd/mm/yyyy).
   Sample Input: 29/02/2020
   Sample Output: Valid Date
 */
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    String date = sc.next();
    String[] parts = date.split("/");
    int d = Integer.parseInt(parts[0]);
    int m = Integer.parseInt(parts[1]);
    int y = Integer.parseInt(parts[2]);
    boolean valid = true;
    if (m < 1 || m > 12 || d < 1) valid = false;
    else {
        int[] days = {31, ( (y%400==0)||(y%4==0 && y%100!=0) ) ? 29:28, 31,30,31,30,31,31,30,31,30,31};
        if (d > days[m-1]) valid = false;
    }
    if (valid) System.out.println("Valid Date");
    else System.out.println("Invalid Date");
	}
}
