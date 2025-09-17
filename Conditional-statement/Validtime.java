package conditionalstatement;
import java.util.Scanner;
public class Validtime {
/**
 * 8. Validate Time
   Check if time is valid in HH\:MM format.
   Sample Input: 13:45
   Sample Output: Valid Time
 */
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        String time = sc.next();

	        String[] parts = time.split(":");
	        int h = Integer.parseInt(parts[0]);
	        int m = Integer.parseInt(parts[1]);

	        if (h >= 0 && h <= 23 && m >= 0 && m <= 59)
	            System.out.println("Valid Time");
	        else
	            System.out.println("Invalid Time");
	}
}
