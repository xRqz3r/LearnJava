//Header
/*
z * Name: xRqz3r
 * Date: September 21, 2021
 * Title: Calculate
 * Description: An application that calculates three integers (ex. 1 * 3 * 4 = 12)
 */

import java.util.Scanner;

public class Calculate {
	
	//Main
	public static void main(String[] args) {
		
		//Vars
		Scanner input = new Scanner(System.in);
		int num1, num2;
		int sum, product, difference, quotient;
		
		//INPUT
		System.out.println("Enter two numbers here to calcuate: ");
		num1 = input.nextInt();
		num2 = input.nextInt();
		
		//PROCESS
		sum = num1 + num2;
		product = num1 * num2;
		difference = num1 - num2;
		quotient = num1 / num2;
		
		//OUTPUT
		System.out.printf("The sum is %d\n", sum);
		System.out.printf("The product is %d\n", product);
		System.out.printf("The difference is %d\n", difference);
		System.out.printf("The quotient is %d\n", quotient);
		
	}
}
