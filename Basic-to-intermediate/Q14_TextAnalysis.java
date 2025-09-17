package basic.to.intermediate;

import java.util.Scanner;

public class Q14_TextAnalysis {
	
	/**
	 *  This program will read a line of text from the user, analyze 
	 each character, and count how many are letters, digits, whitespace, 
	 or other types of characters (like punctuation).
	 
	 Problem Flow:
	Prompt the user to input a line of text.
	Initialize counters for letters, digits, spaces, and other characters.
	Loop through each character and classify it into one of the categories.
	Display the count for each category: letters, digits, spaces, and others.

	Sample Input / Output:
	Input:
	Enter the text below:
	Hello World! 123

	Output:
	Letters : 10
	Digits : 3
	Space Chars : 2
	Others : 2

	 */
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the text below:");
	String input = in.nextLine();

	int l= 0, d= 0, s= 0, o= 0;
	for (int i = 0; i < input.length(); i++) {
		char ch = input.charAt(i);

		if (Character.isLetter(ch)) 
		{
			l++;
		}
		else if (Character.isDigit(ch)) 
		{
			d++;
		} 
		else if (Character.isWhitespace(ch)) 
		{
			s++;
		}
		else  
		{
			o++;
		}
	}

	// Display result
	System.out.println("Letters : " + l);
	System.out.println("Digits : " + d);
	System.out.println("Space Chars : " + s);
	System.out.println("Others : " + o);

}
}
