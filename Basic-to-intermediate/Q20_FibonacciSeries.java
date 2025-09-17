package basic.to.intermediate;
import java.util.Scanner;
public class Q20_FibonacciSeries {
	/**
	 * This program calculates and displays the first n numbers in the 
	 Fibonacci sequence. Each number is the sum of the previous 
	 two numbers.
	 
	 Code Flow 
	Input: number of terms n
	Initialize first two terms: f1 = 1, f2 = 1
	Loop from i = 3 to n:
		Find next term using f = f1 + f2
		Shift values for next round
	Display all terms
	
	Sample Input/Output
 	Input:
	How many Fibonacci terms? 10
	Output:
	1 1 2 3 5 8 13 21 34 55

	 */
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int f1=1,f2=1;
		int f3 = 0;
		System.out.println("Input:");
		System.out.println("How many Fibonacci terms?");
		int a=sc.nextInt();
		System.out.println("Output:");
		System.out.print(f1+"\t");
		System.out.print(f2);
		for(int i=3;i<=a;i++)
		{
			f3=f1+f2;
		
			f1=f2;
			f2=f3;
			System.out.print("\n"+f3);
			}
		
		}

}
