import java.io.*;

public class Exercise17_7 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //Modify Exercise17_07 by adding a void function called outputData that reads the Loan objects 
        // from the file and displays the total loan amount
    	
    	//Exercise17_07.java creates a file named Exercise17_07.dat containing Loan objects that were written using the ObjectOutputStream
    	try (
    			ObjectInputStream input = new ObjectInputStream(new FileInputStream("Exercise17_7.dat"));
    			) {
    		
    			while (true) {
    				Loan loan = (Loan)input.readObject();
    				System.out.println(loan);
    				System.out.printf("Total loan amount: $%.2f\n", loan.getTotalPayment());
    				System.out.println();
    			 }
        } 
    	
    //Suppose you don’t know how many Loan objects are there in the file, use EOFException to end the loop.	
        catch (EOFException ex) {
            System.out.println("All data were read");
          }
        catch (IOException ex) {
            ex.printStackTrace();
          }
    }
}

