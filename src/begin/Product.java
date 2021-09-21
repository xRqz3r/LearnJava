
/*
z * Name: xRqz3r
 * Date: September 21, 2021
 * Title Product
 * Description: An application that calculates three integers
 */

//Importing Scanner
import java.util.Scanner;

//Define the class
public class Product {
	
	// Main String needed to run java applications
	public static void main(String[] args) {
		
		// Variables
		Scanner input = new Scanner(System.in);
		int num1, num2, num3; //store 3 integers
		int product; // Stores the result
		
		// Input
		System.out.println("Enter 3 integers here: ");
		num1 = input.nextInt();
		num2 = input.nextInt();
		num3 = input.nextInt();
		
		// Process
		product = num1 * num2 * num3;
		
		// Output - Final Result
		System.out.printf("The product of %d, %d, %d is %d\n", num1, num2, num3, product);
	}

}
