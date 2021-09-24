/*
 * Write an application that displays the integer equivalents of some uppercase letters, lowercase letters, digits and special symbols.  You will need to cast the character.  (Research - ‘ASCII code’ for more information)  (CharToInt)

For example enter the following line in the main method to see the results for ‘A’:
 
System.out.println("The character " + 'A' + " has the value " + (int) 'A'); 

 */

import java.util.Scanner;

public class CharToInt {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		char letter;
		
		System.out.println("Type a letter to find its ASCII value:");
		letter = input.next().charAt(0);
		
		System.out.println("The character " + letter + " has the value " + (int) letter);

	}

}
