package conditionalstatement;
import java.util.Scanner;
public class Specialcharacter {
/**
 * 3. Alphabet, Number, or Special Character
   Identify the type of the character.
   Sample Input: @
   Sample Output: Special Character
 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char ch;
		System.out.println("Enter the Value: ");
	    ch = in.next().charAt(0);
	    if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
	    	System.out.println("Alphabet.");
	    }else if (ch>=0 && ch<=9){
	    	System.out.println("Numbers.");
	    }else {
	    	System.out.println("Special Character.");
	    }
		
	}

}
