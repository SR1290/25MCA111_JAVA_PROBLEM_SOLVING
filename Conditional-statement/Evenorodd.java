package conditionalstatement;
import java.util.Scanner;
public class Evenorodd {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		System.out.println("Enter the number:");
        n = in.nextInt();
        if (n % 2 == 0)
            System.out.println("Even number");
        else
            System.out.println("Odd number");
	}

}
