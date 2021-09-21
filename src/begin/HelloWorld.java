//Work from Sep. 20, 2021
//This imports the scanner class for scanner
import java.util.Scanner;

//main class of program
public class HelloWorld {

	//main string of program
	public static void main(String[] args) {
		
		//This is the scanner variable
		Scanner input = new Scanner(System.in);
		
		//This is the question for name
		System.out.print("What is your name?");
		String name = input.next();
		
		//This is the question for age
		System.out.print("What is your age?");
		int age = input.nextInt();
		
		//This is the math done for age
		age = age + 1;
		
		//This is the answer for name
		System.out.printf("Hello, my name is %s. ", name);
		//This is the answer for age
		System.out.printf("Next year, I will be %d!", age);

	}

}
