/*
Name: Amanda Cauzza
Date: 7/26

(Create a text file) Write a program to create a file named Exercise17_01.txt if it does not exist. 
Append new data to it if it already exists. Write 100 integers created randomly into the file using text I/O. 
Integers are separated by a space.

*/

import java.io.*;

class Exercise17_1 {
	public static void main(String[] args) throws IOException {
		try (
		      FileOutputStream output = new FileOutputStream("Exercise17_01.txt");
		    ) {
			//new PrintWriter(new FileOutputStream("Exercise17_01.txt", true));

				for (int i = 0; i < 100; i++) {
					output.write(((int)(Math.random() * 200) + 1));
					output.write(i);
					    }

		try (

			FileInputStream input = new FileInputStream("Exercise17_01.txt");
			    ) {

				int value;
					while ((value = input.read()) != -1)
			        System.out.print(value + " ");
			    }
			}
		}
}