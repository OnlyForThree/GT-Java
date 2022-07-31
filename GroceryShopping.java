/**
*Project name: GroceryShopping
*Original Creators: Krish Ghosh, Sai Challagundala, Srijan Kyasa
*New Attempt Date: 07/08/22
*New Attempt Takers: Alex Nguyen + Sayo Odusote
*/
import java.util.Scanner;//Import scanner
import java.lang.Math;//Import Math Language
import java.text.NumberFormat;//Import number format

public class GroceryShopping {
  public static void main(String[] args) {
    //Declare variables
    double totalCost, amountPaid;
    double discountValue = 0;
    double coins, bills;
    int hundreds, fifties, twenties, tens, fives, ones;
    int quarters, dimes, nickels, pennies;
    
    int randomHigh = 2;//Random number maximum
    int randomLow = 1;//Random number minimum
    int randomNumber = (int)((randomHigh - randomLow + 1) * Math.random() + randomLow); //Random number 1-2
    
    Scanner input = new Scanner(System.in);
    NumberFormat money = NumberFormat.getCurrencyInstance();
    NumberFormat number = NumberFormat.getIntegerInstance();

    //Get input for grocery cost
    System.out.print("What was your total cost of groceries: $");
     totalCost = input.nextDouble();

    //Get input for total paid
    System.out.print("(only bills) How much did you pay for groceries: $");
     amountPaid = input.nextDouble();

    //50% chance at getting a 25% discount
    if (randomNumber == 1){
      discountValue = 0.25;
      System.out.println("You found a coupon. You get 25% off your groceries!");
    }

    //Calculate new total with any discounts and taxes
    totalCost = (totalCost - (totalCost * discountValue)) * (1.06);

    //Print the change owed based of amount paid and new total
    System.out.println("Change given back: " + money.format((amountPaid - totalCost)));

    //Calculate $100 bills
    hundreds = (int)(totalCost / 100);
    totalCost = totalCost - (100 * hundreds);

    //Calculate $50 bills
    fifties = (int)(totalCost / 50);
    totalCost = totalCost - (fifties * 50);

    //Calculate $20 bills
    twenties = (int)(totalCost / 20);
    totalCost = totalCost - (twenties * 20);

    //Calculate $10 bills
    tens = (int)(totalCost / 10);
    totalCost = totalCost - (tens * 10);

    //Calculate $5
    fives = (int)(totalCost / 5);
    totalCost = totalCost - (fives * 5);
    
    //Calculate $1 bills
    ones = (int)(totalCost / 1);
    totalCost = totalCost - (ones * 1);

    //Calculate quarters
    quarters = (int)(totalCost / 0.25);
    totalCost = totalCost - (quarters * 0.25);
    
    //Calcuate dimes
    dimes = (int)(totalCost / .10);
    totalCost = totalCost - (dimes * 0.1);
    
    // Calculate nickels
    nickels = (int)(totalCost / .5);
    totalCost = totalCost - (nickels * 0.05);
    
    // Calculate pennies
    pennies = (int)(totalCost / .01);
    totalCost = totalCost - (pennies * 0.01);

    //Calculate bills and coins
    bills = (int) hundreds + fifties + twenties + tens + ones;
    coins = (int) quarters + dimes + nickels + pennies;

//Output all the bills and coins
    System.out.println("Total number of bills: " + number.format(bills));
    System.out.println("Total number of coins: " + number.format(coins));
    System.out.println("Total number of hundreds: " + number.format(hundreds));
    System.out.println("Total number of fifties: " + number.format(fifties));
    System.out.println("Total nunber of twenties: " + number.format(twenties));
    System.out.println("Total number of tens: " + number.format(tens));
    System.out.println("Total number of fives: " + number.format(fives));
    System.out.println("Total number of ones: " + number.format(ones));
    System.out.println("Total number of quarters: " + number.format(quarters));
    System.out.println("Total number of dimes: " + number.format(dimes));
    System.out.println("Total number of nickels: " + number.format(nickels));
    System.out.println("Total number of pennies: " + number.format(pennies));
  }
}