package basic.to.intermediate;

import java.util.Scanner;

public class Q11_FactorialTable {
	
	/**
	 * This program reads a number n from the user and prints the 
	 factorial of numbers from 1 to n in a table format.
	 
	 Problem Flow:
	Read n from user
	Start fact = 1
	Loop from 1 to n
	Multiply fact *= i
	Print each number with its factorial
	
	Sample Output:
	Input:
	Enter the N value: 5

	Output:
	N   |   Factorial
	--------------------
  	1  |            1
  	2  |            2
  	3  |            6
  	4  |           24
  	5  |          120
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int f=1;
		int n,i;
		System.out.println("Enter the n value: ");
		n= in.nextInt();
		System.out.println(" N  |   FACTORIAL ");
		System.out.println("------------------");
		for(i=1;i<=n;i++) {
			f=f*i;
			System.out.println(i + "  |   "+f);
		}
	}
}
