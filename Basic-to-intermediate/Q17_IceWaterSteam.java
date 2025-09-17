package basic.to.intermediate;
import java.util.Scanner;
public class Q17_IceWaterSteam {
	
	/**
	 *  This program checks the temperature value (temp) and determines 
	 the physical state of water:
		If temp < 0 → "ICE"
		If temp is between 0 and 100 (inclusive) → "WATER"
		If temp > 100 → "STEAM"
		
		Flow Summary:
		Get user input for temperature
		Use if-else to decide the state of water
		Display the result to the user
		
		Sample I/O:
		Input:
		Enter the water temperature: 120
		Output:
		Water status is STEAM for the Temperature 120.00

	 */
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Prompt user input
	        System.out.print("Enter the water temperature: ");
	        double temp = sc.nextDouble(); // using double for decimal inputs too

	        String status;

	        // Check conditions
	        if (temp < 0) {
	            status = "ICE";
	        } else if (temp <= 100) {
	            status = "WATER";
	        } else {
	            status = "STEAM";
	        }

	        // Print result
	        System.out.printf("Water status is %s for the Temperature %.2f%n", status, temp);

	        sc.close();
	    }
	
}
