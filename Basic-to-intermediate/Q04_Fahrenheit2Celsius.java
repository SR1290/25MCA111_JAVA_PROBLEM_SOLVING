package basic.to.intermediate;

import java.util.Scanner;

public class Q04_Fahrenheit2Celsius {
	
	/**
	 * This program converts temperature from Fahrenheit to Celsius using the formula:
		C = (5/9) × (F - 32)
		
	Problem Flow:
	Input temperature in Fahrenheit
	Apply formula: C = (5 / 9.0) × (F - 32)
	Display result in Celsius
	
	Input / Output Example:
	Sample Inputs to Test (from question):
	68, 150, 212, 0, -22
	Sample Output (for 68°F):
	68.000000 deg F is 20.000000 deg C
	
	 */
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	double F,C;
    	System.out.println("Sample Inputs to Test (from question): ");
    	F = in.nextDouble();
    	C = (5.0 / 9.0) * (F - 32);
    	System.out.println("Sample Output (for " + F +"degree): ");
    	System.out.printf("%.6f deg f is %.6f deg c", F, C);
    }
	
}
