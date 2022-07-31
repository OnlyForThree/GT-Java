/**
 * 
 * Designer: Alex Nguyen
 * Date: 7/6/22
 * Filename: Printing.java
 * Purpose:  A Printing application that prompts the user for the number of copies to print and then displays the price per copy and the total price for the job.
 */

import java.text.NumberFormat;
import java.util.Scanner;

class Printing {
  public static void main(String[] args) {
    int userAmountAN;
    double copyCostAN, totalCostAN;

    Scanner input = new Scanner(System.in);
    NumberFormat money = NumberFormat.getCurrencyInstance();

    System.out.print("Enter the number of copies to be printed: ");
    userAmountAN = input.nextInt();

    if ((userAmountAN >= 0) && (userAmountAN <= 99)){
      copyCostAN = 0.30;
    }
    else if ((userAmountAN >= 100) && (userAmountAN <= 499)){
      copyCostAN = 0.28;
    }
    else if ((userAmountAN >= 500) && (userAmountAN <= 749)){
      copyCostAN = 0.27;
    }
    else if ((userAmountAN >= 750) && (userAmountAN <= 1000)){
      copyCostAN = 0.26;
    }
    else{
      copyCostAN = 0.25;
    }

    System.out.println("Price per copy is: " + money.format(copyCostAN));
    System.out.println("Total cost is: " + money.format(copyCostAN * userAmountAN));
  }
}