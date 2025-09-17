package basic.to.intermediate;

import java.util.Scanner;

public class Q06_StudentMarks {
	
	/**
	 * This program allows the user to enter 3 test marks of a student, 
	 calculates the total and average, and displays the result.
	 
	Problem Flow:
	Get 3 marks from user
	Add marks → total
	Divide total by 3.0 → average
	Display total and average
	
	Input / Output Example:
	Input:
	Enter Mark 1: 80  
	Enter Mark 2: 75  
	Enter Mark 3: 85  
	Output:
	Total Marks   = 240  
	Average Marks = 80.0
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m1,m2,m3,tol;
		float avg;
		System.out.println("Enter Mark 1: ");
		m1 = in.nextInt();
		System.out.println("Enter Mark 2: ");
		m2 = in.nextInt();
		System.out.println("Enter Mark 3: ");
		m3 = in.nextInt();
		tol = m1 + m2 + m3;
		avg = tol /3;
		System.out.println("Total Marks  = " +tol);
		System.out.println("Average Marks  = " +avg);
		
	}
}
