/* (Decrypt files) Suppose a file is encrypted using the scheme in Programming Exercise 17.14. 
 * Write a program to decode an encrypted file. Your program should prompt the user to 
 * enter an input file name for the encrypted file and an output file name for the 
 * unencrypted version of the input file.
 * 
 * Name: Amanda Cauzza
 * Date: 7/28
 */

import java.util.Scanner;
import java.io.*;

public class Excecise17_15 {
	private static Scanner input;

	public static void main(String[] args) throws IOException {
	input = new Scanner(System.in);
	
	System.out.println("Please Enter Encrypted File Name: ");
	input.next();
	System.out.println("Please Enter Decrypted File Name: ");
	input.next();

	  
	  try (
		      RandomAccessFile encrypted = new RandomAccessFile("inputFile.dat", "r");
		      RandomAccessFile decrypted = new RandomAccessFile("outputFile.dat", "rw");
	) {
		  int i = 0;
		  encrypted.seek(0);
		  	while((i - encrypted.read()) != -1) {
		  		decrypted.write(((byte)i) - 5);
		}
	  }
	    catch (IOException ex) {
	        System.out.println("IO exception");
	      }
	}
}