/*
 * (Encrypt files) Encode the file by adding 5 to every byte in the file. 
 * Write a program that prompts the user to enter an input file name and an 
 * output file name and saves the encrypted version of the input file to the output file.
 * 
 * Name: Amanda Cauzza
 * Date: 7/28
 */


import java.io.*;
import java.util.Scanner;

public class Exercise17_14 {
	  private static Scanner input;

	public static void main(String[] args) throws IOException {
		  input = new Scanner(System.in);
		  
		  //Write a program that prompts the user to enter an input file name
		  System.out.print("Please Enter Input File Name: ");
		  input.next();
		  //Write a program that prompts the user to enter an output file name
		  System.out.print("Please Enter Output File Name: ");
		  input.next();
			  
			  
		    try (		    		
		      RandomAccessFile start = new RandomAccessFile("inputFile.dat", "r");
		      RandomAccessFile end = new RandomAccessFile("outputFile.dat", "rw");
		    ) {
		    	
			      start.setLength(0);
			      end.setLength(0);
		      //Encode the file by adding 5 to every byte in the file
		    	int i = 0;
		    	start.seek(0);
		    	while ((i = start.read()) != -1) {
		    		end.write(((byte)i) + 5);
		    	}
		    }
		    
		    catch (IOException ex) {
		        System.out.println("IO exception");
		      }
	  }
}