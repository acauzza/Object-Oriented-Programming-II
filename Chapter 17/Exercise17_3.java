/*(Sum all the integers in a binary data file) Write a program that contains 2 methods:

Write a method to create a file named Exercise17_03.dat if it does not exist. 
Append new data to it if it already exists. Write 100 integers created randomly 
into the file using writeInt(int) in DataOutputStream. Integers are separated by a space.
Write a method that reads the integers from the file and finds the sum of the integers. 
Assume the file contains an unspecified number of integers.

Name: Amanda Cauzza
Date: 7/26
*/

import java.io.*;

public class Exercise17_3 {
  public static void main(String[] args) throws IOException {
    try (
    		DataOutputStream output = 
    			new DataOutputStream(new FileOutputStream("Exercise17_3.dat"));
    		) {
				for (int i = 0; i < 100; i++) {
					output.write(((int)(Math.random() * 100) + 1));
					output.write(i);
				}

    try (
    		DataInputStream input = 
    			new DataInputStream(new FileInputStream("Exercise17_3.dat"));
    		) {
    		int sum = 0;
    			sum += input.read();
    				System.out.print("Sum of Integers are: " +  sum);
    		}
    	}
  	}
}