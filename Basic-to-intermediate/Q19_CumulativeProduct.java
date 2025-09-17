package basic.to.intermediate;
import java.util.Scanner;
public class Q19_CumulativeProduct {
	
	/**
	 * This program reads a set of numbers from the user and calculates 
	 the cumulative product, which means multiplying all the numbers 
	 together one by one.
	 
	 Code Flow 
	Get number count n
	Use for loop to input numbers
	Multiply each number with product
	Print final result
	
	Test Data
	Input:
	6.2, 12.3, 5.0, 18.8, 7.1, 12.8
	Output:
	Cumulative Total = 514537.165312


	 */
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		float[] arr=new float[6];
		float c=1;
		System.out.println("enter values");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextFloat();
			c=c*arr[i];
		}
		System.out.println("Output:");
		System.out.printf("Cumulative Total =%.6f",c);
	}

}
