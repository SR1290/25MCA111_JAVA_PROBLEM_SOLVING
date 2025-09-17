package basic.to.intermediate;

import java.util.Scanner;

public class Q10_ProductOfOddIntegers {
	
	/**
	 * This program calculates and prints the product of odd numbers from 1 to 15.
		(Odd numbers: 1, 3, 5, 7, ..., 15)
		
		Problem Flow:
		Start from 1 to 15
		Increment by 2 to get odd numbers
		Multiply all odd numbers
		Print the final product
		
		Input / Output Example:
		Output:
		Product of odd numbers from 1 to 15 = 2027025
		(Odd numbers: 1 × 3 × 5 × 7 × 9 × 11 × 13 × 15 = 2027025)

	 */
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int sum=1;
		int i;
	
		for(i=1;i<=15;i+=2) {
			sum=sum*i;
		}
		System.out.println("Poduct of Odd numbers from 1 to 15 = " +sum);
	}
}
