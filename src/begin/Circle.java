/*
z * Name: xRqz3r
 * Date: September 22, 2021
 * Title Product
 * Description: An application that calculates three integers (ex. 1 * 3 * 4 = 12)
 */

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double radius;			//Input Radius
		double diameter;		//Input Diameter
		double circumference;	//Input Circumference
		double area;			//Input area
		
		//Input - radius
		System.out.print("Eneter the radius of the circle: ");
		radius = input.nextDouble();
		
		//Process - calculating the diameter, circumference and area
		diameter = 2 * radius;
		circumference = 2 * Math.PI * radius;
		area = Math.PI * Math.pow(radius,  2); //don't use: area = Math.PI * radius * radius;
		
		//Output - display the formatted results
		System.out.printf("The diameter is %.2f units\n", diameter);
		System.out.printf("The circumference is %.2f units\n", circumference);
		System.out.printf("The area is %.2f units squared\n", area);
		
	}

}
