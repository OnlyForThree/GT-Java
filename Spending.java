/**
 * 
 * Designer: Alex Nguyen
 * Date: 6/29/22
 * Filename: Spending.java
 * Purpose: A Spending application to help examine the spending patterns of a user.  The application should prompt the user for the amount spent last month on food, clothing, entertainment, and rent, and then display a table showing the percentage of expenditures in each category.  
 */

import java.util.Scanner; // Import the Scanner
import java.text.NumberFormat; //Import Number Format

public class Spending{
  public static void main(String[] args){
    //Declare variables
    double foodAN = 0;
    double clothingAN = 0;
    double entertainmentAN = 0;
    double rentAN = 0;
    double totalCostAN = 0;
      
    Scanner input = new Scanner(System.in);
    NumberFormat percent = NumberFormat.getPercentInstance();
    
    //Collect all inputs for variables
    System.out.println("Enter the amount spent last month on the following items:\n\n");
    System.out.print("Food: $");
    foodAN = input.nextDouble();
    totalCostAN = totalCostAN + foodAN;
    System.out.print("Clothing: $");
    clothingAN = input.nextDouble();
    totalCostAN = totalCostAN + clothingAN;
    System.out.print("Entertainment: $");
    entertainmentAN = input.nextDouble();
    totalCostAN = totalCostAN + entertainmentAN;
    System.out.print("Rent: $");
    rentAN = input.nextDouble();
    totalCostAN = totalCostAN + rentAN;

    //Update variables
    foodAN = foodAN / totalCostAN;
    clothingAN = clothingAN / totalCostAN;
    entertainmentAN = entertainmentAN / totalCostAN;
    rentAN = rentAN / totalCostAN;
    
    //Display results
    System.out.format("%-15s %2s %1s", "\nCategory", "Budget", " \n");
    System.out.format("%-15s %.2f %1s", "Food", foodAN * 100, "%\n");
    System.out.format("%-15s %.2f %1s", "Clothing", clothingAN * 100, "%\n");
    System.out.format("%-15s %.2f %1s", "Entertainment", entertainmentAN * 100, "%\n");
    System.out.format("%-15s %.2f %1s", "Rent", rentAN * 100, "%\n");
  }
}