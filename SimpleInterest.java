/**
 * 
 * Designer: Alex Nguyen
 * Date: 6/28/22
 * Filename: SimpleInterest.java
 * Purpose: a SimpleInterest application that prompts the user for the principal, number of years, and interest rate. Then calculates the amount of interest. 
 */

import java.util.Scanner; // Import the Scanner
import java.text.NumberFormat; //Import the Nmber Format

public class SimpleInterest{
  public static void main(String[] args){
    
    //Declare variables
    double principalAN = 0;
    double yearsAN = 0;
    double interestRateAN = 0;
    double termValueAN;
    
    Scanner input = new Scanner(System.in);
    NumberFormat money = NumberFormat.getCurrencyInstance();
    
    //Collect inputs for variables
    System.out.print("Enter the principal: ");
    principalAN = input.nextDouble();
    System.out.print("Enter the number of years: ");
    yearsAN = input.nextDouble();
    System.out.print("Enter the interest rate: ");
    interestRateAN = input.nextDouble();
    
    //Caluclate value
    termValueAN = principalAN * (1 + yearsAN * interestRateAN);
    
    //Display term value
    System.out.println("The value after the term is: " + money.format(termValueAN));

  }
}