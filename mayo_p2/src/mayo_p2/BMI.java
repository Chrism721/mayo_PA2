package mayo_p2;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		double w, h;
		int c;
		double BMI = 0.0;
		
		System.out.println("Would you like to use the imperial or metric calculation?");
		System.out.print("Please enter (1) for imperial or (2) for metric: " );
		c = scnr.nextInt(); 
		System.out.println();
		
		if(c == 1) {
			System.out.print("Please enter your weight in pounds: ");
			w = scnr.nextDouble();
			System.out.println();
			
			System.out.print("Please enter your height in inches: ");
			h = scnr.nextDouble();
			System.out.println();
			
			BMI = (703.0 * w) / Math.pow(h, 2.0);
			System.out.print("Your BMI is: ");
			System.out.printf("%.1f \n", BMI);
			System.out.println();
		}
		
		if(c == 2) {
			System.out.print("Please enter your weight in kilograms: ");
			w = scnr.nextDouble();
			System.out.println();
			
			System.out.print("Please enter your height in meters: ");
			h = scnr.nextDouble();
			System.out.println();
			
			BMI = w / Math.pow(h, 2.0);
			System.out.print("Your BMI is: ");
			System.out.printf("%.1f \n", BMI);
			System.out.println();
		}
		
		if((c != 1) && (c != 2)) {
			System.out.println("Invalid choice... terminating.");
		}
		
		/*System.out.println("BMI Categories:");
		System.out.println("Underweight = < 18.5");
		System.out.println("Normal weight = 18.5 - 24.9");
		System.out.println("Overweight = 25 - 29.9");
		System.out.println("Obesity = BMI of 30 or greater");
		*/
		
		if((c == 1) || (c == 2)) {
			if(BMI < 18.5) {
				System.out.println("BMI Category: Underweight");
			}
			else if((BMI >= 18.5) && (BMI <= 24.9)) {
				System.out.println("BMI Category: Normal weight");
			}
			else if((BMI >= 25) && (BMI <= 29.9)) {
				System.out.println("BMI Category: Overweight");
			}
			else if(BMI >= 30) {
				System.out.println("BMI Category: Obesity");
			}
		}
	}

}
