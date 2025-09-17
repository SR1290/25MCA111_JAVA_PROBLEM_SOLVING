package basic.to.intermediate;
import java.util.Scanner;
public class Q18_StringReverse {
	
	/**
	 *  This program takes a string (text) and creates its reverse 
	 version in another string (reverseText). Each character from the 
	 original string is added in reverse order to the new string.
	 
	 Flow Summary
	Read the input string
	Loop from last character to first
	Use comma operator in loop (i--, j++)
	Add each character to reverseText
	Print the reversed output
	
	Sample I/O
	Input:
	Enter the string below:
	hello
	Output:
	Reversed Text: olleh

	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String text = in.nextLine();
		String reverseText = "";
		for (int i = text.length() - 1, j = 0; i >= 0; i--, j++) {
            reverseText += text.charAt(i);
        }
		System.out.println("Reverse string is:"+reverseText);
		
	}
}
