package conditionalstatement;
import java.util.Scanner;
public class Days {
/**
 * 5. Print Day based on input (1-7)
   Map numbers 1-7 to days of the week.
   Sample Input: 3
   Sample Output: Wednesday
 */
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int day;
	        System.out.println("Enter the number:");
	        day = sc.nextInt();
	        if (day == 1) System.out.println("Monday");
	        else if (day == 2) System.out.println("Tuesday");
	        else if (day == 3) System.out.println("Wednesday");
	        else if (day == 4) System.out.println("Thursday");
	        else if (day == 5) System.out.println("Friday");
	        else if (day == 6) System.out.println("Saturday");
	        else if (day == 7) System.out.println("Sunday");
	        else System.out.println("Invalid Day");
	}

}
