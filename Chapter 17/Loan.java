

/*
 * (Restore objects from a file) The Loan class Listing 10.2 does not implement Serializable. 
 * Rewrite the Loan class to implement Serializable. Exercise17_07.java creates a file named Exercise17_07.dat 
 * containing Loan objects that were written using the ObjectOutputStream. 
 * Modify Exercise17_07 by adding a void function called outputData that reads the Loan objects 
 * from the file and displays the total loan amount. Suppose you don’t know how many 
 * Loan objects are there in the file, use EOFException to end the loop.
 * 
 * Name: Amanda Cauzza
 * Date: 7/26
 */


//Rewrite the Loan class to implement Serializable
public class Loan implements java.io.Serializable {
  
private double annualInterestRate;
  private int numberOfYears;
  private double loanAmount;
  private java.util.Date loanDate;

  /** Default constructor 
 * @return */
  public Loan() {
    this(2.5, 1, 1000);
  }

  /** Construct a loan with specified annual interest rate,
      number of years and loan amount 
 * @return 
    */
  public Loan(double annualInterestRate, int numberOfYears,
      double loanAmount) {
    this.annualInterestRate = annualInterestRate;
    this.numberOfYears = numberOfYears;
    this.loanAmount = loanAmount;
    loanDate = new java.util.Date();
  }

  /** Return annualInterestRate */
  public double getAnnualInterestRate() {
    return annualInterestRate;
  }

  /** Set a new annualInterestRate */
  public void setAnnualInterestRate(double annualInterestRate) {
    this.annualInterestRate = annualInterestRate;
  }

  /** Return numberOfYears */
  public int getNumberOfYears() {
    return numberOfYears;
  }

  /** Set a new numberOfYears */
  public void setNumberOfYears(int numberOfYears) {
    this.numberOfYears = numberOfYears;
  }

  /** Return loanAmount */
  public double getLoanAmount() {
    return loanAmount;
  }

  /** Set a newloanAmount */
  public void setLoanAmount(double loanAmount) {
    this.loanAmount = loanAmount;
  }

  /** Find monthly payment */
  public double getMonthlyPayment() {
    double monthlyInterestRate = annualInterestRate / 1200;
    double monthlyPayment = loanAmount * monthlyInterestRate / (1 -
      (Math.pow(1 / (1 + monthlyInterestRate), numberOfYears * 12)));
    return monthlyPayment;    
  }

  /** Find total payment */
  public double getTotalPayment() {
    double totalPayment = getMonthlyPayment() * numberOfYears * 12;
    return totalPayment;    
  }

  /** Return loan date */
  public java.util.Date getLoanDate() {
    return loanDate;
  }
  
  @Override
  public String toString() {
	  return "\nLoan ammount: " + loanAmount;
  }
}
