/*(Compute greatest common divisor using recursion) The gcd(m, n) can also be defined recursively as follows:

If m % n is 0, gcd(m, n) is n.
Otherwise, gcd(m, n) is gcd(n, m%n).

The percent symbol (%) in this case represents the modulus operator. The % operator returns the remainder of two numbers.

Write a recursive method to find the GCD. Write a test program that prompts the user to enter two integers and displays their GCD.

Name: Amanda Cauzza
Date: 7/28
*/


import java.util.Scanner;

public class Exercise18_3 {
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);

		//prompt the user to enter two integers
		System.out.print("Enter the first integer: ");
		int m = input.nextInt();
		System.out.print("Enter the second integer: ");
		int n = input.nextInt();

		//displays their GCD
		System.out.println("The greatest common divisor for " + m + " and " + n 
			+ " is " + gcd(m, n));
	}

	//Write a recursive method to find the GCD
	public static int gcd(int m, int n) {
		if (m % n == 0)
			return n; 
		else 
			return gcd(n, m % n);
	}
}