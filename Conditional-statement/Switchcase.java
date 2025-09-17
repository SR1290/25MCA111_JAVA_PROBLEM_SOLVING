package conditionalstatement;
import java.util.Scanner;
public class Switchcase {

	/**9. Switch Case Calculator
     Build a calculator using switch case.
     Sample Input: 5 + 2
     Sample Output: 7
*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the values : ");
        int a = in.nextInt();
        char op = in.next().charAt(0);
        int b = in.nextInt();

        switch (op) {
            case '+':
                System.out.println("Result: " + (a + b));
                break;
            case '-':
                System.out.println("Result: " + (a - b));
                break;
            case '*':
                System.out.println("Result: " + (a * b));
                break;
            case '/':
                if (b != 0)
                    System.out.println("Result: " + (a / b));
                else
                    System.out.println("Division by zero not allowed");
                break;
            case '%':
                if (b != 0)
                    System.out.println("Result: " + (a % b));
                else
                    System.out.println("Modulo by zero not allowed");
                break;
            default:
                System.out.println("Invalid operator, try again.");
        }
    }
}