package basic.to.intermediate;

import java.util.Scanner;

public class Q03_CompoundInterest {
	
	/**
	 * This program calculates Compound Interest using the formula:
 		F = P × (1 + i)ⁿ
 		Where:
			P = Principal amount
			i = Rate/100
			n = Number of years
 			Here, F is the final amount (principal + interest)
	
		 Problem Flow:
		Input P, R, and N from user
		Calculate i = R / 100
		Use formula F = P × (1 + i)^N
		Display the final compound amount
		
		Input / Output Example:
		Input:
		Enter Principal Value: 10000  
		Enter Rate of Interest: 10  
		Enter No. of Years: 2
		Output:
		Compound Interest 12100.00
	 */

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int N;
		double R,P,i,F;
		System.out.println("Enter Principal Value: ");
		P = in.nextDouble();
		System.out.println("Enter Rate of Interest: ");
		R = in.nextDouble();
		System.out.println("Enter No. of Years: ");
		N = in.nextInt();
		i = R / 100;
		F = (double) P * Math.pow((1 + i), N);
		System.out.printf("Compound Interest %.2f",F); 
	
		
	}
}
