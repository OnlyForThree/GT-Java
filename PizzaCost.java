/**
 * 
 * Designer: Alex Nguyen
 * Date: 6/27/22
 * Filename: PizzaCost.java
 * Purpose:  Prompts the user for the size of a pizza and then displays the cost of making the pizza
 */

import java.util.Scanner; // Import the Scanner class
import java.text.NumberFormat; // Inport NumberFormat

public class PizzaCost{
    public static void main(String[] args){
      //Declare variables
      double laborAN = 0.75;
      double materialsAN;
      double totalAN;
      int rentAN = 1;

      Scanner input = new Scanner(System.in);
      NumberFormat money = NumberFormat.getCurrencyInstance();

      //Explain instructions + Collect input
      System.out.println("Enter the diameter of the pizza in inches: ");
      materialsAN = (input.nextDouble());

      //Calculate total
      totalAN = (materialsAN * (materialsAN * 0.05)) + rentAN + laborAN;

      //Display total
      System.out.println("Your total is: " + (money.format(totalAN)));
    }
}