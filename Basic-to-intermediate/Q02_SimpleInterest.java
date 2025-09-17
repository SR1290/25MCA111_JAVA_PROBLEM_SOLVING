package basic.to.intermediate;

import java.util.Scanner;

public class Q02_SimpleInterest {
	
	/**
	 * Write a Java program to calculate Simple Interest using the formula:
 		SI = (P × N × R) / 100
 		Where:
		P = Principal amount
		N = Number of years
		R = Rate of interest
		
		Problem Flow:
		User inputs:
			Principal (P)
			Rate (R)
			Years (N)
		Program calculates:
			SI = (P × N × R) / 100
		Output displays the Simple Interest value.
		
		Input / Output Example:
		Input:
		Enter Principal Amount: 10000  
		Enter Rate of Interest: 5  
		Enter No. of Years: 2
		Output:
		Simple Interest = 1000.00
	 */

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int p,n,r;
		float s;
		System.out.println("Enter Principal Amount: ");
		p = in.nextInt();
		System.out.println("Enter Rate of Interest: ");
		r = in.nextInt();
		System.out.println("No. of Years: ");
		n = in.nextInt();
		
		s = (float) ((p*n*r)/100);
		System.out.printf("Simple Interest %.2f", s);
		
	}
}
