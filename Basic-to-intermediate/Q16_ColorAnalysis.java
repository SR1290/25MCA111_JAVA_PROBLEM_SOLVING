package basic.to.intermediate;
import java.util.Scanner;
public class Q16_ColorAnalysis {
	
	/**
	 *  This program uses a switch statement to examine the value of a 
	 char-type variable called colour and prints one of the following
	 messages, depending on the character assigned:
		RED if either r or R is assigned to colour.
		GREEN if either g or G is assigned to colour.
		BLUE if either b or B is assigned to colour.
		BLACK if any other character is assigned to colour.
		
		Problem Flow:
		Prompt the user to enter a single character for the color code.
		Use a switch statement to check the character and assign the corresponding color.
		Print the entered color code and the corresponding color name.

		Sample Input / Output:
		Input:
		Enter Color code character: g
		Output:
		Color Code g is GREEN

	 */
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Color code character: ");
        char colour = sc.next().charAt(0); // read a single character

        String colorName;

        switch (colour) {
            case 'r':
            case 'R':
                colorName = "RED";
                break;
            case 'g':
            case 'G':
                colorName = "GREEN";
                break;
            case 'b':
            case 'B':
                colorName = "BLUE";
                break;
            default:
                colorName = "BLACK";
        }

        System.out.println("Color Code " + colour + " is " + colorName);
	}
}
