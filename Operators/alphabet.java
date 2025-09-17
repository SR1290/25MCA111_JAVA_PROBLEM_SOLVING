package operator;
import java.util.Scanner;
public class alphabet {
	/**
	 * 3. Check if a character is an alphabet or not
   Write a program to check whether the given character is an alphabet.*
   Sample Input: A
   Sample Output: Alphabet
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char ch;
		String result;
        System.out.print("Enter a character: ");
        ch = in.next().charAt(0);
        result = ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))? "Alphabet": "Not an Alphabet";
        System.out.println("It is "+result);
	}
}
