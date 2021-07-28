/*
 * (Print the characters in a string reversely) Write a recursive method that 
 * displays a string reversely on the console using the following header: 
 * private static void reverseDisplay(String value) 
 * 
 * Name: Amanda Cauzza
 * Date: 7/28
 */

import java.util.Scanner;

public class Exercise18_9 {
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String value = input.next();

		// displays a string reversely
		System.out.print("The reverse is: ");
				reverseDisplay(value);
	}

	/** Method displays the characters in a string reversely */
	private static void reverseDisplay(String value) {
		if (value.length() == 1)
			System.out.print(value);
		
		else {
			System.out.print(value.charAt(value.length() - 1));
			reverseDisplay(value.substring(0, value.length() - 1));
		}
	}
}