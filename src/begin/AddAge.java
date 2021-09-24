/*
z * Name: xRqz3r
 * Date: September 23, 2021
 * Title Product
 * Description: 
 */

//This imports the scanner class for scanner
import java.util.Scanner;

//main class of program
public class AddAge {

	//main string of program
	public static void main(String[] args) {
		
		//This is the scanner variable
		Scanner input = new Scanner(System.in);
		
		//This is the question for name
		System.out.print("What is your first name?");
		String name = input.next();
		
		//
		System.out.print("What is your last name?");
		String name2 = input.next();
		
		//This is the question for age
		System.out.print("What is your age?");
		int age = input.nextInt();
		
		//This is the math done for age
		age = age + 1;
		
		//OUTPUT
		//This is the answer for age
		System.out.printf("%s %s, next year you will be %d!", name, name2, age);

	}

}
