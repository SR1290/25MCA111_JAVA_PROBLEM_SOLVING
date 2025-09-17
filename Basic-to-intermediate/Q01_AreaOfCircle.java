package basic.to.intermediate;

import java.util.Scanner;

public class Q01_AreaOfCircle {
	
	/**
	 * Write a program to read the radius of a circle and calculate 
	 * its area using the formula:
		A = π * r²
	
	Problem Flow:
	1. User inputs radius (r)
	2. Program calculates: area = (22.0 / 7) * r * r
	3. Output displays area with radius
	
	Input / Output Example:
	Input:
	Enter Radius of Circle: 7
	Output:
	Area of Circle with Radius 7.0000 is 154.0000
	 */
	
	
	public static void main(String[] args) {
		
		// Object crea7tion 
		Scanner in = new Scanner(System.in);
		
		// Variable Declaration or Memory Reservation
		float result, r1, r2;
		float r;
		
		// Getting Input
		System.out.println("Enter Radius of Circle:");
		r = in.nextFloat();
		
		// Process the Result
		result = (float) (Math.PI * r * r);
		r1 = (float) ((22/7.0) * r * r);
		r2 = (float) (Math.PI * Math.pow(r, 2));
		
		// Print the Output
		// System.out.println(result);
		// System.out.println("Area of Circle with Radius " + r + " is " + r2);
		// System.out.println(r2);
		System.out.printf("Area of Circle with Radius %.4f is %.4f", r, r1);
		
	}

}
