package basic.to.intermediate;

import java.util.Scanner;

public class Q07_SimpleStringEncoding {
	
	/**
	 * This program reads a five-letter word from the user and encodes 
	 it by subtracting 1 from the ASCII value of each character. 
	 It then prints the newly encoded word.
	 
	 Problem Flow:
	Get 5-letter word input
	Loop each character → subtract 1 from ASCII
	Build new string with changed characters
	Print encoded result
	
	Input / Output Example:
	Input:
	Enter a Five letter word: white
	Output:
	Encoded Word: vghsd
	 */

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String word;
		
		System.out.print("Enter a Five letter word: ");
		word = in.next();

		StringBuilder encoded = new StringBuilder();
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			char encodedChar = (char) (ch - 1);
			encoded.append(encodedChar);
			System.out.println("Encoded Word: " + encoded.toString());
		}
	}
}
