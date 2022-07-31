/**
 * 
 * Designer: Alex Nguyen
 * Date: 6/27/22
 * Filename: CollegeCalculator.java
 * Purpose: Prompts the user for the amount of each expense and offset cost. If the cost is not applicable the user should enter a value of 0. Add the expenses and subtract the offset costs to determine how much money an individual will need for their school year.
 */

import java.util.Scanner; // Import the Scanner class
import java.text.NumberFormat; // Inport NumberFormat

public class CollegeCalculator{
  public static void main(String[] args){
    //Declare variables
    double expensesAN = 0;
    double offsetsAN = 0;
    double totalAN = 0;

    Scanner input = new Scanner(System.in);
    NumberFormat money = NumberFormat.getCurrencyInstance();

    //Explain instructions
    System.out.println("Lets calculate your Expenses.");
    System.out.println("If the cost is not applicable the user should enter a value of 0.");

    //Total all expenses
    System.out.println("Type your tuition cost:");
    expensesAN += input.nextDouble();
    System.out.println("Type your Room & Board cost:");
    expensesAN += input.nextDouble();
    System.out.println("Type your Meal Plan cost:");
    expensesAN += input.nextDouble();
    System.out.println("Type your Books & Supplies cost:");
    expensesAN += input.nextDouble();
    System.out.println("Type your Transportation cost:");
    expensesAN += input.nextDouble();
    System.out.println("Type your Miscellaneous cost:");
    expensesAN += input.nextDouble();

    //Explain instructions
    System.out.println("\nNow lets calculate your offsets.");
    System.out.println("If the cost is not applicable the user should enter a value of 0.");

    //Total all offsets
    System.out.println("Type your total Scholarship value:");
    offsetsAN += input.nextDouble();
    System.out.println("Type your total Federal Aid value:");
    offsetsAN += input.nextDouble();
    System.out.println("Type your total Grants value:");
    offsetsAN += input.nextDouble();
    System.out.println("Type your total Income value:");
    offsetsAN += input.nextDouble();

    //Caluclate total
    totalAN = expensesAN - offsetsAN;

    //Display total
    System.out.println("\n Your expected expenses are:" + (money.format(totalAN)));
  }
}