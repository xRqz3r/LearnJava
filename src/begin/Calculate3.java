/*
z * Name: xRqz3r
 * Date: September 22, 2021
 * Title Product
 * Description: 
 */

import java.util.Scanner;

public class Calculate3 {

	public static void main(String[] args) {
		
		//Vars
		Scanner input = new Scanner(System.in);
		
		double num1, num2, num3;
		double sum, average, product, smallest, largest;
		
		//INPUT
		System.out.println("Enter three numbers here:");
		num1 = input.nextDouble();
		num2 = input.nextDouble();
		num3 = input.nextDouble();
		
		//PROCESSING
		sum = num1 + num2 + num3;
		average = sum / 3;
		product = num1 * num2 * num3;
		
		//Smallest
		if (num1 < num2 && num1 < num3)
			smallest = num1;
		else if (num2 < num3)
			smallest = num2;
		else
			smallest = num3;
		
		
		//Largest
		if (num1 > num2 && num1 > num3)
			largest = num1;
		else if (num2 > num3)
			largest = num2;
		else
			largest = num3;
		
		//OUTPUT
		System.out.printf("The sum is %f\n", sum);
		System.out.printf("The average is %f\n", average);
		System.out.printf("The product is %f\n", product);
		System.out.printf("The smallest is %f\n", smallest);
		System.out.printf("The largest is %f\n", largest);
		
	}

}
