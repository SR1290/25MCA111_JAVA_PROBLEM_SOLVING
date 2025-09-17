package conditionalstatement;
import java.util.Scanner;
public class Leapyear {
/**
 * 4. Check Leap Year or Not
   Check if a given year is a leap year.
   Sample Input: 2024
   Sample Output: Leap Year
 */
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int year ;
	        System.out.println("Enter the year:");
	        year= sc.nextInt();

	        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
	            System.out.println("Leap Year");
	        else
	            System.out.println("Not a Leap Year");


	}

}
